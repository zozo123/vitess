<?php
// DO NOT EDIT! Generated by Protobuf-PHP protoc plugin 1.0
// Source: tabletmanagerservice.proto

namespace Vitess\Proto\Tabletmanagerservice {

  class TabletManagerClient extends \Grpc\BaseStub {

    public function __construct($hostname, $opts) {
      parent::__construct($hostname, $opts);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\PingRequest $input
     */
    public function Ping(\Vitess\Proto\Tabletmanagerdata\PingRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/Ping', $argument, '\Vitess\Proto\Tabletmanagerdata\PingResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\SleepRequest $input
     */
    public function Sleep(\Vitess\Proto\Tabletmanagerdata\SleepRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/Sleep', $argument, '\Vitess\Proto\Tabletmanagerdata\SleepResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\ExecuteHookRequest $input
     */
    public function ExecuteHook(\Vitess\Proto\Tabletmanagerdata\ExecuteHookRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/ExecuteHook', $argument, '\Vitess\Proto\Tabletmanagerdata\ExecuteHookResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\GetSchemaRequest $input
     */
    public function GetSchema(\Vitess\Proto\Tabletmanagerdata\GetSchemaRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/GetSchema', $argument, '\Vitess\Proto\Tabletmanagerdata\GetSchemaResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\GetPermissionsRequest $input
     */
    public function GetPermissions(\Vitess\Proto\Tabletmanagerdata\GetPermissionsRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/GetPermissions', $argument, '\Vitess\Proto\Tabletmanagerdata\GetPermissionsResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\SetReadOnlyRequest $input
     */
    public function SetReadOnly(\Vitess\Proto\Tabletmanagerdata\SetReadOnlyRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/SetReadOnly', $argument, '\Vitess\Proto\Tabletmanagerdata\SetReadOnlyResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\SetReadWriteRequest $input
     */
    public function SetReadWrite(\Vitess\Proto\Tabletmanagerdata\SetReadWriteRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/SetReadWrite', $argument, '\Vitess\Proto\Tabletmanagerdata\SetReadWriteResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\ChangeTypeRequest $input
     */
    public function ChangeType(\Vitess\Proto\Tabletmanagerdata\ChangeTypeRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/ChangeType', $argument, '\Vitess\Proto\Tabletmanagerdata\ChangeTypeResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\RefreshStateRequest $input
     */
    public function RefreshState(\Vitess\Proto\Tabletmanagerdata\RefreshStateRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/RefreshState', $argument, '\Vitess\Proto\Tabletmanagerdata\RefreshStateResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\RunHealthCheckRequest $input
     */
    public function RunHealthCheck(\Vitess\Proto\Tabletmanagerdata\RunHealthCheckRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/RunHealthCheck', $argument, '\Vitess\Proto\Tabletmanagerdata\RunHealthCheckResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\IgnoreHealthErrorRequest $input
     */
    public function IgnoreHealthError(\Vitess\Proto\Tabletmanagerdata\IgnoreHealthErrorRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/IgnoreHealthError', $argument, '\Vitess\Proto\Tabletmanagerdata\IgnoreHealthErrorResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\ReloadSchemaRequest $input
     */
    public function ReloadSchema(\Vitess\Proto\Tabletmanagerdata\ReloadSchemaRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/ReloadSchema', $argument, '\Vitess\Proto\Tabletmanagerdata\ReloadSchemaResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\PreflightSchemaRequest $input
     */
    public function PreflightSchema(\Vitess\Proto\Tabletmanagerdata\PreflightSchemaRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/PreflightSchema', $argument, '\Vitess\Proto\Tabletmanagerdata\PreflightSchemaResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\ApplySchemaRequest $input
     */
    public function ApplySchema(\Vitess\Proto\Tabletmanagerdata\ApplySchemaRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/ApplySchema', $argument, '\Vitess\Proto\Tabletmanagerdata\ApplySchemaResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\ExecuteFetchAsDbaRequest $input
     */
    public function ExecuteFetchAsDba(\Vitess\Proto\Tabletmanagerdata\ExecuteFetchAsDbaRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/ExecuteFetchAsDba', $argument, '\Vitess\Proto\Tabletmanagerdata\ExecuteFetchAsDbaResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\ExecuteFetchAsAppRequest $input
     */
    public function ExecuteFetchAsApp(\Vitess\Proto\Tabletmanagerdata\ExecuteFetchAsAppRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/ExecuteFetchAsApp', $argument, '\Vitess\Proto\Tabletmanagerdata\ExecuteFetchAsAppResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\SlaveStatusRequest $input
     */
    public function SlaveStatus(\Vitess\Proto\Tabletmanagerdata\SlaveStatusRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/SlaveStatus', $argument, '\Vitess\Proto\Tabletmanagerdata\SlaveStatusResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\MasterPositionRequest $input
     */
    public function MasterPosition(\Vitess\Proto\Tabletmanagerdata\MasterPositionRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/MasterPosition', $argument, '\Vitess\Proto\Tabletmanagerdata\MasterPositionResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\StopSlaveRequest $input
     */
    public function StopSlave(\Vitess\Proto\Tabletmanagerdata\StopSlaveRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/StopSlave', $argument, '\Vitess\Proto\Tabletmanagerdata\StopSlaveResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\StopSlaveMinimumRequest $input
     */
    public function StopSlaveMinimum(\Vitess\Proto\Tabletmanagerdata\StopSlaveMinimumRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/StopSlaveMinimum', $argument, '\Vitess\Proto\Tabletmanagerdata\StopSlaveMinimumResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\StartSlaveRequest $input
     */
    public function StartSlave(\Vitess\Proto\Tabletmanagerdata\StartSlaveRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/StartSlave', $argument, '\Vitess\Proto\Tabletmanagerdata\StartSlaveResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\TabletExternallyReparentedRequest $input
     */
    public function TabletExternallyReparented(\Vitess\Proto\Tabletmanagerdata\TabletExternallyReparentedRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/TabletExternallyReparented', $argument, '\Vitess\Proto\Tabletmanagerdata\TabletExternallyReparentedResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\TabletExternallyElectedRequest $input
     */
    public function TabletExternallyElected(\Vitess\Proto\Tabletmanagerdata\TabletExternallyElectedRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/TabletExternallyElected', $argument, '\Vitess\Proto\Tabletmanagerdata\TabletExternallyElectedResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\GetSlavesRequest $input
     */
    public function GetSlaves(\Vitess\Proto\Tabletmanagerdata\GetSlavesRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/GetSlaves', $argument, '\Vitess\Proto\Tabletmanagerdata\GetSlavesResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\WaitBlpPositionRequest $input
     */
    public function WaitBlpPosition(\Vitess\Proto\Tabletmanagerdata\WaitBlpPositionRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/WaitBlpPosition', $argument, '\Vitess\Proto\Tabletmanagerdata\WaitBlpPositionResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\StopBlpRequest $input
     */
    public function StopBlp(\Vitess\Proto\Tabletmanagerdata\StopBlpRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/StopBlp', $argument, '\Vitess\Proto\Tabletmanagerdata\StopBlpResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\StartBlpRequest $input
     */
    public function StartBlp(\Vitess\Proto\Tabletmanagerdata\StartBlpRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/StartBlp', $argument, '\Vitess\Proto\Tabletmanagerdata\StartBlpResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\RunBlpUntilRequest $input
     */
    public function RunBlpUntil(\Vitess\Proto\Tabletmanagerdata\RunBlpUntilRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/RunBlpUntil', $argument, '\Vitess\Proto\Tabletmanagerdata\RunBlpUntilResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\ResetReplicationRequest $input
     */
    public function ResetReplication(\Vitess\Proto\Tabletmanagerdata\ResetReplicationRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/ResetReplication', $argument, '\Vitess\Proto\Tabletmanagerdata\ResetReplicationResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\InitMasterRequest $input
     */
    public function InitMaster(\Vitess\Proto\Tabletmanagerdata\InitMasterRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/InitMaster', $argument, '\Vitess\Proto\Tabletmanagerdata\InitMasterResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\PopulateReparentJournalRequest $input
     */
    public function PopulateReparentJournal(\Vitess\Proto\Tabletmanagerdata\PopulateReparentJournalRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/PopulateReparentJournal', $argument, '\Vitess\Proto\Tabletmanagerdata\PopulateReparentJournalResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\InitSlaveRequest $input
     */
    public function InitSlave(\Vitess\Proto\Tabletmanagerdata\InitSlaveRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/InitSlave', $argument, '\Vitess\Proto\Tabletmanagerdata\InitSlaveResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\DemoteMasterRequest $input
     */
    public function DemoteMaster(\Vitess\Proto\Tabletmanagerdata\DemoteMasterRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/DemoteMaster', $argument, '\Vitess\Proto\Tabletmanagerdata\DemoteMasterResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\PromoteSlaveWhenCaughtUpRequest $input
     */
    public function PromoteSlaveWhenCaughtUp(\Vitess\Proto\Tabletmanagerdata\PromoteSlaveWhenCaughtUpRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/PromoteSlaveWhenCaughtUp', $argument, '\Vitess\Proto\Tabletmanagerdata\PromoteSlaveWhenCaughtUpResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\SlaveWasPromotedRequest $input
     */
    public function SlaveWasPromoted(\Vitess\Proto\Tabletmanagerdata\SlaveWasPromotedRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/SlaveWasPromoted', $argument, '\Vitess\Proto\Tabletmanagerdata\SlaveWasPromotedResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\SetMasterRequest $input
     */
    public function SetMaster(\Vitess\Proto\Tabletmanagerdata\SetMasterRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/SetMaster', $argument, '\Vitess\Proto\Tabletmanagerdata\SetMasterResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\SlaveWasRestartedRequest $input
     */
    public function SlaveWasRestarted(\Vitess\Proto\Tabletmanagerdata\SlaveWasRestartedRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/SlaveWasRestarted', $argument, '\Vitess\Proto\Tabletmanagerdata\SlaveWasRestartedResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\StopReplicationAndGetStatusRequest $input
     */
    public function StopReplicationAndGetStatus(\Vitess\Proto\Tabletmanagerdata\StopReplicationAndGetStatusRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/StopReplicationAndGetStatus', $argument, '\Vitess\Proto\Tabletmanagerdata\StopReplicationAndGetStatusResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\PromoteSlaveRequest $input
     */
    public function PromoteSlave(\Vitess\Proto\Tabletmanagerdata\PromoteSlaveRequest $argument, $metadata = array(), $options = array()) {
      return $this->_simpleRequest('/tabletmanagerservice.TabletManager/PromoteSlave', $argument, '\Vitess\Proto\Tabletmanagerdata\PromoteSlaveResponse::deserialize', $metadata, $options);
    }
    /**
     * @param Vitess\Proto\Tabletmanagerdata\BackupRequest $input
     */
    public function Backup($argument, $metadata = array(), $options = array()) {
      return $this->_serverStreamRequest('/tabletmanagerservice.TabletManager/Backup', $argument, '\Vitess\Proto\Tabletmanagerdata\BackupResponse::deserialize', $metadata, $options);
    }
  }
}
