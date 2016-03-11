package com.flipkart.vitess.jdbc;

import com.flipkart.vitess.util.Constants;
import com.youtube.vitess.proto.Query;

import java.sql.*;
import java.util.logging.Logger;

/**
 * Created by ashudeep.sharma on 15/02/16.
 */
public class VitessMariaDBDatabaseMetadata extends VitessDatabaseMetaData
    implements DatabaseMetaData {

    private static final String DRIVER_NAME = "Vitess MariaDB JDBC Driver";
    private static Logger logger = Logger.getLogger(VitessMariaDBDatabaseMetadata.class.getName());
    private final VitessConnection connection;

    public VitessMariaDBDatabaseMetadata(VitessConnection connection) {
        this.connection = connection;
    }

    public boolean allTablesAreSelectable() throws SQLException {
        return false;
    }

    public String getURL() throws SQLException {
        return connection.getUrl();
    }

    public String getUserName() throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public boolean isReadOnly() throws SQLException {
        return connection.isReadOnly();
    }

    public boolean nullsAreSortedHigh() throws SQLException {
        return false;
    }

    public boolean nullsAreSortedLow() throws SQLException {
        return !this.nullsAreSortedHigh();
    }

    public boolean nullsAreSortedAtStart() throws SQLException {
        return false;
    }

    public boolean nullsAreSortedAtEnd() throws SQLException {
        return !this.nullsAreSortedAtStart();
    }

    public String getDatabaseProductVersion() throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public String getDriverName() throws SQLException {
        return DRIVER_NAME;
    }

    public boolean usesLocalFiles() throws SQLException {
        return false;
    }

    public boolean usesLocalFilePerTable() throws SQLException {
        return false;
    }

    public boolean storesUpperCaseIdentifiers() throws SQLException {
        return false;
    }

    public boolean storesLowerCaseIdentifiers() throws SQLException {
        return false;
    }

    public boolean storesMixedCaseIdentifiers() throws SQLException {
        return false;
    }

    public boolean supportsMixedCaseQuotedIdentifiers() throws SQLException {
        return false;
    }

    public boolean storesUpperCaseQuotedIdentifiers() throws SQLException {
        return false;
    }

    public boolean storesLowerCaseQuotedIdentifiers() throws SQLException {
        return false;
    }

    public boolean storesMixedCaseQuotedIdentifiers() throws SQLException {
        return false;
    }

    public String getSQLKeywords() throws SQLException {
        StringBuilder sb = new StringBuilder();
        sb.append("ACCESSIBLE,");
        sb.append("ANALYZE,");
        sb.append("ASENSITIVE,");
        sb.append("BEFORE,");
        sb.append("BIGINT,");
        sb.append("BINARY,");
        sb.append("BLOB,");
        sb.append("CALL,");
        sb.append("CHANGE,");
        sb.append("CONDITION,");
        sb.append("DATABASE,");
        sb.append("DATABASES,");
        sb.append("DAY_HOUR,");
        sb.append("DAY_MICROSECOND,");
        sb.append("DAY_MINUTE,");
        sb.append("DAY_SECOND,");
        sb.append("DELAYED,");
        sb.append("DETERMINISTIC,");
        sb.append("DISTINCTROW,");
        sb.append("DIV,");
        sb.append("DUAL,");
        sb.append("EACH,");
        sb.append("ELSEIF,");
        sb.append("ENCLOSED,");
        sb.append("ESCAPED,");
        sb.append("EXIT,");
        sb.append("EXPLAIN,");
        sb.append("FLOAT4,");
        sb.append("FLOAT8,");
        sb.append("FORCE,");
        sb.append("FULLTEXT,");
        sb.append("HIGH_PRIORITY,");
        sb.append("HOUR_MICROSECOND,");
        sb.append("HOUR_MINUTE,");
        sb.append("HOUR_SECOND,");
        sb.append("IF,");
        sb.append("IGNORE,");
        sb.append("INFILE,");
        sb.append("INOUT,");
        sb.append("INT1,");
        sb.append("INT2,");
        sb.append("INT3,");
        sb.append("INT4,");
        sb.append("INT8,");
        sb.append("ITERATE,");
        sb.append("KEY,");
        sb.append("KEYS,");
        sb.append("KILL,");
        sb.append("LEAVE,");
        sb.append("LIMIT,");
        sb.append("LINEAR,");
        sb.append("LINES,");
        sb.append("LOAD,");
        sb.append("LOCALTIME,");
        sb.append("LOCALTIMESTAMP,");
        sb.append("LOCK,");
        sb.append("LONG,");
        sb.append("LONGBLOB,");
        sb.append("LONGTEXT,");
        sb.append("LOOP,");
        sb.append("LOW_PRIORITY,");
        sb.append("MEDIUMBLOB,");
        sb.append("MEDIUMINT,");
        sb.append("MEDIUMTEXT,");
        sb.append("MIDDLEINT,");
        sb.append("MINUTE_MICROSECOND,");
        sb.append("MINUTE_SECOND,");
        sb.append("MOD,");
        sb.append("MODIFIES,");
        sb.append("NO_WRITE_TO_BINLOG,");
        sb.append("OPTIMIZE,");
        sb.append("OPTIONALLY,");
        sb.append("OUT,");
        sb.append("OUTFILE,");
        sb.append("PURGE,");
        sb.append("RANGE,");
        sb.append("READS,");
        sb.append("READ_ONLY,");
        sb.append("READ_WRITE,");
        sb.append("REGEXP,");
        sb.append("RELEASE,");
        sb.append("RENAME,");
        sb.append("REPEAT,");
        sb.append("REPLACE,");
        sb.append("REQUIRE,");
        sb.append("RETURN,");
        sb.append("RLIKE,");
        sb.append("SCHEMAS,");
        sb.append("SECOND_MICROSECOND,");
        sb.append("SENSITIVE,");
        sb.append("SEPARATOR,");
        sb.append("SHOW,");
        sb.append("SPATIAL,");
        sb.append("SPECIFIC,");
        sb.append("SQLEXCEPTION,");
        sb.append("SQL_BIG_RESULT,");
        sb.append("SQL_CALC_FOUND_ROWS,");
        sb.append("SQL_SMALL_RESULT,");
        sb.append("SSL,");
        sb.append("STARTING,");
        sb.append("STRAIGHT_JOIN,");
        sb.append("TERMINATED,");
        sb.append("TINYBLOB,");
        sb.append("TINYINT,");
        sb.append("TINYTEXT,");
        sb.append("TRIGGER,");
        sb.append("UNDO,");
        sb.append("UNLOCK,");
        sb.append("UNSIGNED,");
        sb.append("USE,");
        sb.append("UTC_DATE,");
        sb.append("UTC_TIME,");
        sb.append("UTC_TIMESTAMP,");
        sb.append("VARBINARY,");
        sb.append("VARCHARACTER,");
        sb.append("WHILE,");
        sb.append("X509,");
        sb.append("XOR,");
        sb.append("YEAR_MONTH,");
        sb.append("ZEROFILL,");
        sb.append("GENERAL,");
        sb.append("IGNORE_SERVER_IDS,");
        sb.append("MASTER_HEARTBEAT_PERIOD,");
        sb.append("MAXVALUE,");
        sb.append("RESIGNAL,");
        sb.append("SIGNAL");
        sb.append("SLOW");
        return sb.toString();
    }

    public boolean supportsAlterTableWithAddColumn() throws SQLException {
        return false;
    }

    public boolean supportsAlterTableWithDropColumn() throws SQLException {
        return false;
    }

    public boolean supportsColumnAliasing() throws SQLException {
        return true;
    }

    public boolean supportsConvert() throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public boolean supportsConvert(int fromType, int toType) throws SQLException {
        return false;
    }

    public boolean supportsTableCorrelationNames() throws SQLException {
        return false;
    }

    public boolean supportsDifferentTableCorrelationNames() throws SQLException {
        return false;
    }

    public boolean supportsExpressionsInOrderBy() throws SQLException {
        return false;
    }

    public boolean supportsOrderByUnrelated() throws SQLException {
        return false;
    }

    public boolean supportsGroupBy() throws SQLException {
        return false;
    }

    public boolean supportsGroupByUnrelated() throws SQLException {
        return false;
    }

    public boolean supportsGroupByBeyondSelect() throws SQLException {
        return false;
    }

    public boolean supportsLikeEscapeClause() throws SQLException {
        return false;
    }

    public boolean supportsMultipleResultSets() throws SQLException {
        return false;
    }

    public boolean supportsMultipleTransactions() throws SQLException {
        return false;
    }

    public boolean supportsNonNullableColumns() throws SQLException {
        return true;
    }

    public boolean supportsMinimumSQLGrammar() throws SQLException {
        return true;
    }

    public boolean supportsCoreSQLGrammar() throws SQLException {
        return false;
    }

    public boolean supportsExtendedSQLGrammar() throws SQLException {
        return false;
    }

    public boolean supportsANSI92EntryLevelSQL() throws SQLException {
        return false;
    }

    public boolean supportsANSI92IntermediateSQL() throws SQLException {
        return false;
    }

    public boolean supportsANSI92FullSQL() throws SQLException {
        return false;
    }

    public boolean supportsIntegrityEnhancementFacility() throws SQLException {
        return false;
    }

    public boolean supportsOuterJoins() throws SQLException {
        return false;
    }

    public boolean supportsFullOuterJoins() throws SQLException {
        return false;
    }

    public boolean supportsLimitedOuterJoins() throws SQLException {
        return false;
    }

    public boolean supportsSchemasInDataManipulation() throws SQLException {
        return false;
    }

    public boolean supportsSchemasInProcedureCalls() throws SQLException {
        return false;
    }

    public boolean supportsSchemasInTableDefinitions() throws SQLException {
        return false;
    }

    public boolean supportsSchemasInIndexDefinitions() throws SQLException {
        return false;
    }

    public boolean supportsSchemasInPrivilegeDefinitions() throws SQLException {
        return false;
    }

    public boolean supportsCatalogsInDataManipulation() throws SQLException {
        return false;
    }

    public boolean supportsCatalogsInProcedureCalls() throws SQLException {
        return false;
    }

    public boolean supportsCatalogsInTableDefinitions() throws SQLException {
        return false;
    }

    public boolean supportsCatalogsInIndexDefinitions() throws SQLException {
        return false;
    }

    public boolean supportsCatalogsInPrivilegeDefinitions() throws SQLException {
        return false;
    }

    public boolean supportsPositionedDelete() throws SQLException {
        return false;
    }

    public boolean supportsPositionedUpdate() throws SQLException {
        return false;
    }

    public boolean supportsSelectForUpdate() throws SQLException {
        return false;
    }

    public boolean supportsSubqueriesInComparisons() throws SQLException {
        return false;
    }

    public boolean supportsSubqueriesInExists() throws SQLException {
        return false;
    }

    public boolean supportsSubqueriesInIns() throws SQLException {
        return false;
    }

    public boolean supportsSubqueriesInQuantifieds() throws SQLException {
        return false;
    }

    public boolean supportsCorrelatedSubqueries() throws SQLException {
        return false;
    }

    public boolean supportsUnion() throws SQLException {
        return false;
    }

    public boolean supportsUnionAll() throws SQLException {
        return false;
    }

    public boolean supportsOpenCursorsAcrossCommit() throws SQLException {
        return false;
    }

    public boolean supportsOpenCursorsAcrossRollback() throws SQLException {
        return false;
    }

    public boolean supportsOpenStatementsAcrossCommit() throws SQLException {
        return false;
    }

    public boolean supportsOpenStatementsAcrossRollback() throws SQLException {
        return false;
    }

    public int getMaxColumnsInTable() throws SQLException {
        return 512;
    }

    public int getMaxCursorNameLength() throws SQLException {
        return 0;
    }

    public int getMaxSchemaNameLength() throws SQLException {
        return 32;
    }

    public int getMaxProcedureNameLength() throws SQLException {
        return 0;
    }

    public int getMaxCatalogNameLength() throws SQLException {
        return 0;
    }

    public int getMaxRowSize() throws SQLException {
        return 0;
    }

    public boolean doesMaxRowSizeIncludeBlobs() throws SQLException {
        return false;
    }

    public int getMaxStatementLength() throws SQLException {
        return 0;
    }

    public int getMaxStatements() throws SQLException {
        return 0;
    }

    public int getDefaultTransactionIsolation() throws SQLException {
        return connection.TRANSACTION_REPEATABLE_READ;
    }

    public boolean supportsTransactions() throws SQLException {
        return true;
    }

    public boolean supportsTransactionIsolationLevel(int level) throws SQLException {
        switch (level) {
            case Connection.TRANSACTION_READ_UNCOMMITTED:
            case Connection.TRANSACTION_READ_COMMITTED:
            case Connection.TRANSACTION_REPEATABLE_READ:
            case Connection.TRANSACTION_SERIALIZABLE:
                return true;
            default:
                return false;
        }
    }

    public boolean supportsDataDefinitionAndDataManipulationTransactions() throws SQLException {
        return false;
    }

    public boolean supportsDataManipulationTransactionsOnly() throws SQLException {
        return false;
    }

    public ResultSet getTables(String catalog, String schemaPattern, String tableNamePattern,
        String[] types) throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public ResultSet getSchemas() throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public ResultSet getCatalogs() throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public ResultSet getTableTypes() throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public ResultSet getColumns(String catalog, String schemaPattern, String tableNamePattern,
        String columnNamePattern) throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public ResultSet getColumnPrivileges(String catalog, String schema, String table,
        String columnNamePattern) throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public ResultSet getTablePrivileges(String catalog, String schemaPattern,
        String tableNamePattern) throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public ResultSet getBestRowIdentifier(String catalog, String schema, String table, int scope,
        boolean nullable) throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public ResultSet getVersionColumns(String catalog, String schema, String table)
        throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public ResultSet getPrimaryKeys(String catalog, String schema, String table)
        throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public ResultSet getImportedKeys(String catalog, String schema, String table)
        throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public ResultSet getExportedKeys(String catalog, String schema, String table)
        throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public ResultSet getCrossReference(String parentCatalog, String parentSchema,
        String parentTable, String foreignCatalog, String foreignSchema, String foreignTable)
        throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public ResultSet getTypeInfo() throws SQLException {
        String[] columnNames =
            {"TYPE_NAME", "DATA_TYPE", "PRECISION", "LITERAL_PREFIX", "LITERAL_SUFFIX",
                "CREATE_PARAMS", "NULLABLE", "CASE_SENSITIVE", "SEARCHABLE", "UNSIGNED_ATTRIBUTE",
                "FIXED_PREC_SCALE", "AUTO_INCREMENT", "LOCAL_TYPE_NAME", "MINIMUM_SCALE",
                "MAXIMUM_SCALE", "SQL_DATA_TYPE", "SQL_DATETIME_SUB", "NUM_PREC_RADIX"};
        Query.Type[] columnTypes =
            {Query.Type.VARCHAR, Query.Type.INT32, Query.Type.INT32, Query.Type.VARCHAR,
                Query.Type.VARCHAR, Query.Type.VARCHAR, Query.Type.INT32, Query.Type.BIT,
                Query.Type.INT16, Query.Type.BIT, Query.Type.BIT, Query.Type.BIT,
                Query.Type.VARCHAR, Query.Type.INT16, Query.Type.INT16, Query.Type.INT32,
                Query.Type.INT32, Query.Type.INT32};

        String[][] data =
            {{"BIT", "-7", "1", "", "", "", "1", "1", "3", "0", "0", "0", "BIT", "0", "0", "0", "0",
                "10"},
                {"BOOL", "-7", "1", "", "", "", "1", "1", "3", "0", "0", "0", "BOOL", "0", "0", "0",
                    "0", "10"},
                {"TINYINT", "-6", "3", "", "", "[(M)] [UNSIGNED] [ZEROFILL]", "1", "0", "3", "1",
                    "0", "1", "TINYINT", "0", "0", "0", "0", "10"},
                {"TINYINT UNSIGNED", "-6", "3", "", "", "[(M)] [UNSIGNED] [ZEROFILL]", "1", "0",
                    "3", "1", "0", "1", "TINYINT UNSIGNED", "0", "0", "0", "0", "10"},
                {"BIGINT", "-5", "19", "", "", "[(M)] [UNSIGNED] [ZEROFILL]", "1", "0", "3", "1",
                    "0", "1", "BIGINT", "0", "0", "0", "0", "10"},
                {"BIGINT UNSIGNED", "-5", "20", "", "", "[(M)] [ZEROFILL]", "1", "0", "3", "1", "0",
                    "1", "BIGINT UNSIGNED", "0", "0", "0", "0", "10"},
                {"LONG VARBINARY", "-4", "16777215", "'", "'", "", "1", "1", "3", "0", "0", "0",
                    "LONG VARBINARY", "0", "0", "0", "0", "10"},
                {"MEDIUMBLOB", "-4", "16777215", "'", "'", "", "1", "1", "3", "0", "0", "0",
                    "MEDIUMBLOB", "0", "0", "0", "0", "10"},
                {"LONGBLOB", "-4", "2147483647", "'", "'", "", "1", "1", "3", "0", "0", "0",
                    "LONGBLOB", "0", "0", "0", "0", "10"},
                {"BLOB", "-4", "65535", "'", "'", "", "1", "1", "3", "0", "0", "0", "BLOB", "0",
                    "0", "0", "0", "10"},
                {"TINYBLOB", "-4", "255", "'", "'", "", "1", "1", "3", "0", "0", "0", "TINYBLOB",
                    "0", "0", "0", "0", "10"},
                {"VARBINARY", "-3", "255", "'", "'", "(M)", "1", "1", "3", "0", "0", "0",
                    "VARBINARY", "0", "0", "0", "0", "10"},
                {"BINARY", "-2", "255", "'", "'", "(M)", "1", "1", "3", "0", "0", "0", "BINARY",
                    "0", "0", "0", "0", "10"},
                {"LONG VARCHAR", "-1", "16777215", "'", "'", "", "1", "0", "3", "0", "0", "0",
                    "LONG VARCHAR", "0", "0", "0", "0", "10"},
                {"MEDIUMTEXT", "-1", "16777215", "'", "'", "", "1", "0", "3", "0", "0", "0",
                    "MEDIUMTEXT", "0", "0", "0", "0", "10"},
                {"LONGTEXT", "-1", "2147483647", "'", "'", "", "1", "0", "3", "0", "0", "0",
                    "LONGTEXT", "0", "0", "0", "0", "10"},
                {"TEXT", "-1", "65535", "'", "'", "", "1", "0", "3", "0", "0", "0", "TEXT", "0",
                    "0", "0", "0", "10"},
                {"TINYTEXT", "-1", "255", "'", "'", "", "1", "0", "3", "0", "0", "0", "TINYTEXT",
                    "0", "0", "0", "0", "10"},
                {"CHAR", "1", "255", "'", "'", "(M)", "1", "0", "3", "0", "0", "0", "CHAR", "0",
                    "0", "0", "0", "10"},
                {"NUMERIC", "2", "65", "", "", "[(M,D])] [ZEROFILL]", "1", "0", "3", "0", "0", "1",
                    "NUMERIC", "-308", "308", "0", "0", "10"},
                {"DECIMAL", "3", "65", "", "", "[(M,D])] [ZEROFILL]", "1", "0", "3", "0", "0", "1",
                    "DECIMAL", "-308", "308", "0", "0", "10"},
                {"INTEGER", "4", "10", "", "", "[(M)] [UNSIGNED] [ZEROFILL]", "1", "0", "3", "1",
                    "0", "1", "INTEGER", "0", "0", "0", "0", "10"},
                {"INTEGER UNSIGNED", "4", "10", "", "", "[(M)] [ZEROFILL]", "1", "0", "3", "1", "0",
                    "1", "INTEGER UNSIGNED", "0", "0", "0", "0", "10"},
                {"INT", "4", "10", "", "", "[(M)] [UNSIGNED] [ZEROFILL]", "1", "0", "3", "1", "0",
                    "1", "INT", "0", "0", "0", "0", "10"},
                {"INT UNSIGNED", "4", "10", "", "", "[(M)] [ZEROFILL]", "1", "0", "3", "1", "0",
                    "1", "INT UNSIGNED", "0", "0", "0", "0", "10"},
                {"MEDIUMINT", "4", "7", "", "", "[(M)] [UNSIGNED] [ZEROFILL]", "1", "0", "3", "1",
                    "0", "1", "MEDIUMINT", "0", "0", "0", "0", "10"},
                {"MEDIUMINT UNSIGNED", "4", "8", "", "", "[(M)] [ZEROFILL]", "1", "0", "3", "1",
                    "0", "1", "MEDIUMINT UNSIGNED", "0", "0", "0", "0", "10"},
                {"SMALLINT", "5", "5", "", "", "[(M)] [UNSIGNED] [ZEROFILL]", "1", "0", "3", "1",
                    "0", "1", "SMALLINT", "0", "0", "0", "0", "10"},
                {"SMALLINT UNSIGNED", "5", "5", "", "", "[(M)] [ZEROFILL]", "1", "0", "3", "1", "0",
                    "1", "SMALLINT UNSIGNED", "0", "0", "0", "0", "10"},
                {"FLOAT", "7", "10", "", "", "[(M|D)] [ZEROFILL]", "1", "0", "3", "0", "0", "1",
                    "FLOAT", "-38", "38", "0", "0", "10"},
                {"DOUBLE", "8", "17", "", "", "[(M|D)] [ZEROFILL]", "1", "0", "3", "0", "0", "1",
                    "DOUBLE", "-308", "308", "0", "0", "10"},
                {"DOUBLE PRECISION", "8", "17", "", "", "[(M,D)] [ZEROFILL]", "1", "0", "3", "0",
                    "0", "1", "DOUBLE PRECISION", "-308", "308", "0", "0", "10"},
                {"REAL", "8", "17", "", "", "[(M,D)] [ZEROFILL]", "1", "0", "3", "0", "0", "1",
                    "REAL", "-308", "308", "0", "0", "10"},
                {"VARCHAR", "12", "255", "'", "'", "(M)", "1", "0", "3", "0", "0", "0", "VARCHAR",
                    "0", "0", "0", "0", "10"},
                {"ENUM", "12", "65535", "'", "'", "", "1", "0", "3", "0", "0", "0", "ENUM", "0",
                    "0", "0", "0", "10"},
                {"SET", "12", "64", "'", "'", "", "1", "0", "3", "0", "0", "0", "SET", "0", "0",
                    "0", "0", "10"},
                {"DATE", "91", "10", "'", "'", "", "1", "0", "3", "0", "0", "0", "DATE", "0", "0",
                    "0", "0", "10"},
                {"TIME", "92", "18", "'", "'", "[(M)]", "1", "0", "3", "0", "0", "0", "TIME", "0",
                    "0", "0", "0", "10"},
                {"DATETIME", "93", "27", "'", "'", "[(M)]", "1", "0", "3", "0", "0", "0",
                    "DATETIME", "0", "0", "0", "0", "10"},
                {"TIMESTAMP", "93", "27", "'", "'", "[(M)]", "1", "0", "3", "0", "0", "0",
                    "TIMESTAMP", "0", "0", "0", "0", "10"}};

        return new VitessResultSet(columnNames, columnTypes, data);
    }

    public ResultSet getIndexInfo(String catalog, String schema, String table, boolean unique,
        boolean approximate) throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public boolean ownUpdatesAreVisible(int type) throws SQLException {
        return false;
    }

    public boolean ownDeletesAreVisible(int type) throws SQLException {
        return false;
    }

    public boolean ownInsertsAreVisible(int type) throws SQLException {
        return false;
    }

    public boolean othersUpdatesAreVisible(int type) throws SQLException {
        return false;
    }

    public boolean othersDeletesAreVisible(int type) throws SQLException {
        return false;
    }

    public boolean othersInsertsAreVisible(int type) throws SQLException {
        return false;
    }

    public boolean updatesAreDetected(int type) throws SQLException {
        return false;
    }

    public boolean deletesAreDetected(int type) throws SQLException {
        return false;
    }

    public ResultSet getUDTs(String catalog, String schemaPattern, String typeNamePattern,
        int[] types) throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public VitessConnection getConnection() throws SQLException {
        return connection;
    }

    public boolean supportsSavepoints() throws SQLException {
        return false;
    }

    public boolean supportsMultipleOpenResults() throws SQLException {
        return false;
    }

    public ResultSet getSuperTypes(String catalog, String schemaPattern, String typeNamePattern)
        throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public ResultSet getSuperTables(String catalog, String schemaPattern, String tableNamePattern)
        throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public ResultSet getAttributes(String catalog, String schemaPattern, String typeNamePattern,
        String attributeNamePattern) throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public boolean supportsResultSetHoldability(int holdability) throws SQLException {
        return false;
    }

    public int getResultSetHoldability() throws SQLException {
        return 0;
    }

    public int getDatabaseMajorVersion() throws SQLException {
        return 0;
    }

    public int getDatabaseMinorVersion() throws SQLException {
        return 0;
    }

    public int getSQLStateType() throws SQLException {
        return DatabaseMetaData.sqlStateSQL;
    }

    public boolean locatorsUpdateCopy() throws SQLException {
        return false;
    }

    public boolean supportsStatementPooling() throws SQLException {
        return false;
    }

    public RowIdLifetime getRowIdLifetime() throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public ResultSet getSchemas(String catalog, String schemaPattern) throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public boolean supportsStoredFunctionsUsingCallSyntax() throws SQLException {
        return false;
    }

    public boolean autoCommitFailureClosesAllResultSets() throws SQLException {
        return false;
    }

    public ResultSet getClientInfoProperties() throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public ResultSet getFunctions(String catalog, String schemaPattern, String functionNamePattern)
        throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public ResultSet getFunctionColumns(String catalog, String schemaPattern,
        String functionNamePattern, String columnNamePattern) throws SQLException {
        throw new SQLFeatureNotSupportedException(
            Constants.SQLExceptionMessages.SQL_FEATURE_NOT_SUPPORTED);
    }

    public ResultSet getPseudoColumns(String catalog, String schemaPattern, String tableNamePattern,
        String columnNamePattern) throws SQLException {
        return connection.createStatement().executeQuery("SELECT ' ' TABLE_CAT, ' ' TABLE_SCHEM,"
            + "' ' TABLE_NAME, ' ' COLUMN_NAME, 0 DATA_TYPE, 0 COLUMN_SIZE, 0 DECIMAL_DIGITS,"
            + "10 NUM_PREC_RADIX, ' ' COLUMN_USAGE,  ' ' REMARKS, 0 CHAR_OCTET_LENGTH, 'YES' IS_NULLABLE FROM DUAL "
            + "WHERE 1=0");
    }

    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}