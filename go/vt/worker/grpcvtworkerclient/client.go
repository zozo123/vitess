// Copyright 2015, Google Inc. All rights reserved.
// Use of this source code is governed by a BSD-style
// license that can be found in the LICENSE file.

// Package grpcvtworkerclient contains the gRPC version of the vtworker client protocol.
package grpcvtworkerclient

import (
	"time"

	"github.com/youtube/vitess/go/vt/logutil"
	"github.com/youtube/vitess/go/vt/worker/vtworkerclient"
	"golang.org/x/net/context"
	"google.golang.org/grpc"

	logutilpb "github.com/youtube/vitess/go/vt/proto/logutil"
	vtworkerdatapb "github.com/youtube/vitess/go/vt/proto/vtworkerdata"
	vtworkerservicepb "github.com/youtube/vitess/go/vt/proto/vtworkerservice"
)

type gRPCVtworkerClient struct {
	cc *grpc.ClientConn
	c  vtworkerservicepb.VtworkerClient
}

func gRPCVtworkerClientFactory(addr string, dialTimeout time.Duration) (vtworkerclient.Client, error) {
	// create the RPC client
	cc, err := grpc.Dial(addr, grpc.WithInsecure())
	if err != nil {
		return nil, err
	}
	c := vtworkerservicepb.NewVtworkerClient(cc)

	return &gRPCVtworkerClient{
		cc: cc,
		c:  c,
	}, nil
}

type eventStreamAdapter struct {
	stream vtworkerservicepb.Vtworker_ExecuteVtworkerCommandClient
}

func (e *eventStreamAdapter) Recv() (*logutilpb.Event, error) {
	le, err := e.stream.Recv()
	if err != nil {
		return nil, err
	}
	return le.Event, nil
}

// ExecuteVtworkerCommand is part of the VtworkerClient interface.
func (client *gRPCVtworkerClient) ExecuteVtworkerCommand(ctx context.Context, args []string) (logutil.EventStream, error) {
	query := &vtworkerdatapb.ExecuteVtworkerCommandRequest{
		Args: args,
	}

	stream, err := client.c.ExecuteVtworkerCommand(ctx, query)
	if err != nil {
		return nil, err
	}
	return &eventStreamAdapter{stream}, nil
}

// Close is part of the VtworkerClient interface.
func (client *gRPCVtworkerClient) Close() {
	client.cc.Close()
}

func init() {
	vtworkerclient.RegisterFactory("grpc", gRPCVtworkerClientFactory)
}
