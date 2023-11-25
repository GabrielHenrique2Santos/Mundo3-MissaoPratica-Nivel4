/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "databases")
@NamedQueries({
    @NamedQuery(name = "Databases.findAll", query = "SELECT d FROM Databases d"),
    @NamedQuery(name = "Databases.findByName", query = "SELECT d FROM Databases d WHERE d.name = :name"),
    @NamedQuery(name = "Databases.findByDatabaseId", query = "SELECT d FROM Databases d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "Databases.findBySourceDatabaseId", query = "SELECT d FROM Databases d WHERE d.sourceDatabaseId = :sourceDatabaseId"),
    @NamedQuery(name = "Databases.findByCreateDate", query = "SELECT d FROM Databases d WHERE d.createDate = :createDate"),
    @NamedQuery(name = "Databases.findByCompatibilityLevel", query = "SELECT d FROM Databases d WHERE d.compatibilityLevel = :compatibilityLevel"),
    @NamedQuery(name = "Databases.findByCollationName", query = "SELECT d FROM Databases d WHERE d.collationName = :collationName"),
    @NamedQuery(name = "Databases.findByUserAccess", query = "SELECT d FROM Databases d WHERE d.userAccess = :userAccess"),
    @NamedQuery(name = "Databases.findByUserAccessDesc", query = "SELECT d FROM Databases d WHERE d.userAccessDesc = :userAccessDesc"),
    @NamedQuery(name = "Databases.findByIsReadOnly", query = "SELECT d FROM Databases d WHERE d.isReadOnly = :isReadOnly"),
    @NamedQuery(name = "Databases.findByIsAutoCloseOn", query = "SELECT d FROM Databases d WHERE d.isAutoCloseOn = :isAutoCloseOn"),
    @NamedQuery(name = "Databases.findByIsAutoShrinkOn", query = "SELECT d FROM Databases d WHERE d.isAutoShrinkOn = :isAutoShrinkOn"),
    @NamedQuery(name = "Databases.findByState", query = "SELECT d FROM Databases d WHERE d.state = :state"),
    @NamedQuery(name = "Databases.findByStateDesc", query = "SELECT d FROM Databases d WHERE d.stateDesc = :stateDesc"),
    @NamedQuery(name = "Databases.findByIsInStandby", query = "SELECT d FROM Databases d WHERE d.isInStandby = :isInStandby"),
    @NamedQuery(name = "Databases.findByIsCleanlyShutdown", query = "SELECT d FROM Databases d WHERE d.isCleanlyShutdown = :isCleanlyShutdown"),
    @NamedQuery(name = "Databases.findByIsSupplementalLoggingEnabled", query = "SELECT d FROM Databases d WHERE d.isSupplementalLoggingEnabled = :isSupplementalLoggingEnabled"),
    @NamedQuery(name = "Databases.findBySnapshotIsolationState", query = "SELECT d FROM Databases d WHERE d.snapshotIsolationState = :snapshotIsolationState"),
    @NamedQuery(name = "Databases.findBySnapshotIsolationStateDesc", query = "SELECT d FROM Databases d WHERE d.snapshotIsolationStateDesc = :snapshotIsolationStateDesc"),
    @NamedQuery(name = "Databases.findByIsReadCommittedSnapshotOn", query = "SELECT d FROM Databases d WHERE d.isReadCommittedSnapshotOn = :isReadCommittedSnapshotOn"),
    @NamedQuery(name = "Databases.findByRecoveryModel", query = "SELECT d FROM Databases d WHERE d.recoveryModel = :recoveryModel"),
    @NamedQuery(name = "Databases.findByRecoveryModelDesc", query = "SELECT d FROM Databases d WHERE d.recoveryModelDesc = :recoveryModelDesc"),
    @NamedQuery(name = "Databases.findByPageVerifyOption", query = "SELECT d FROM Databases d WHERE d.pageVerifyOption = :pageVerifyOption"),
    @NamedQuery(name = "Databases.findByPageVerifyOptionDesc", query = "SELECT d FROM Databases d WHERE d.pageVerifyOptionDesc = :pageVerifyOptionDesc"),
    @NamedQuery(name = "Databases.findByIsAutoCreateStatsOn", query = "SELECT d FROM Databases d WHERE d.isAutoCreateStatsOn = :isAutoCreateStatsOn"),
    @NamedQuery(name = "Databases.findByIsAutoCreateStatsIncrementalOn", query = "SELECT d FROM Databases d WHERE d.isAutoCreateStatsIncrementalOn = :isAutoCreateStatsIncrementalOn"),
    @NamedQuery(name = "Databases.findByIsAutoUpdateStatsOn", query = "SELECT d FROM Databases d WHERE d.isAutoUpdateStatsOn = :isAutoUpdateStatsOn"),
    @NamedQuery(name = "Databases.findByIsAutoUpdateStatsAsyncOn", query = "SELECT d FROM Databases d WHERE d.isAutoUpdateStatsAsyncOn = :isAutoUpdateStatsAsyncOn"),
    @NamedQuery(name = "Databases.findByIsAnsiNullDefaultOn", query = "SELECT d FROM Databases d WHERE d.isAnsiNullDefaultOn = :isAnsiNullDefaultOn"),
    @NamedQuery(name = "Databases.findByIsAnsiNullsOn", query = "SELECT d FROM Databases d WHERE d.isAnsiNullsOn = :isAnsiNullsOn"),
    @NamedQuery(name = "Databases.findByIsAnsiPaddingOn", query = "SELECT d FROM Databases d WHERE d.isAnsiPaddingOn = :isAnsiPaddingOn"),
    @NamedQuery(name = "Databases.findByIsAnsiWarningsOn", query = "SELECT d FROM Databases d WHERE d.isAnsiWarningsOn = :isAnsiWarningsOn"),
    @NamedQuery(name = "Databases.findByIsArithabortOn", query = "SELECT d FROM Databases d WHERE d.isArithabortOn = :isArithabortOn"),
    @NamedQuery(name = "Databases.findByIsConcatNullYieldsNullOn", query = "SELECT d FROM Databases d WHERE d.isConcatNullYieldsNullOn = :isConcatNullYieldsNullOn"),
    @NamedQuery(name = "Databases.findByIsNumericRoundabortOn", query = "SELECT d FROM Databases d WHERE d.isNumericRoundabortOn = :isNumericRoundabortOn"),
    @NamedQuery(name = "Databases.findByIsQuotedIdentifierOn", query = "SELECT d FROM Databases d WHERE d.isQuotedIdentifierOn = :isQuotedIdentifierOn"),
    @NamedQuery(name = "Databases.findByIsRecursiveTriggersOn", query = "SELECT d FROM Databases d WHERE d.isRecursiveTriggersOn = :isRecursiveTriggersOn"),
    @NamedQuery(name = "Databases.findByIsCursorCloseOnCommitOn", query = "SELECT d FROM Databases d WHERE d.isCursorCloseOnCommitOn = :isCursorCloseOnCommitOn"),
    @NamedQuery(name = "Databases.findByIsLocalCursorDefault", query = "SELECT d FROM Databases d WHERE d.isLocalCursorDefault = :isLocalCursorDefault"),
    @NamedQuery(name = "Databases.findByIsFulltextEnabled", query = "SELECT d FROM Databases d WHERE d.isFulltextEnabled = :isFulltextEnabled"),
    @NamedQuery(name = "Databases.findByIsTrustworthyOn", query = "SELECT d FROM Databases d WHERE d.isTrustworthyOn = :isTrustworthyOn"),
    @NamedQuery(name = "Databases.findByIsDbChainingOn", query = "SELECT d FROM Databases d WHERE d.isDbChainingOn = :isDbChainingOn"),
    @NamedQuery(name = "Databases.findByIsParameterizationForced", query = "SELECT d FROM Databases d WHERE d.isParameterizationForced = :isParameterizationForced"),
    @NamedQuery(name = "Databases.findByIsMasterKeyEncryptedByServer", query = "SELECT d FROM Databases d WHERE d.isMasterKeyEncryptedByServer = :isMasterKeyEncryptedByServer"),
    @NamedQuery(name = "Databases.findByIsQueryStoreOn", query = "SELECT d FROM Databases d WHERE d.isQueryStoreOn = :isQueryStoreOn"),
    @NamedQuery(name = "Databases.findByIsPublished", query = "SELECT d FROM Databases d WHERE d.isPublished = :isPublished"),
    @NamedQuery(name = "Databases.findByIsSubscribed", query = "SELECT d FROM Databases d WHERE d.isSubscribed = :isSubscribed"),
    @NamedQuery(name = "Databases.findByIsMergePublished", query = "SELECT d FROM Databases d WHERE d.isMergePublished = :isMergePublished"),
    @NamedQuery(name = "Databases.findByIsDistributor", query = "SELECT d FROM Databases d WHERE d.isDistributor = :isDistributor"),
    @NamedQuery(name = "Databases.findByIsSyncWithBackup", query = "SELECT d FROM Databases d WHERE d.isSyncWithBackup = :isSyncWithBackup"),
    @NamedQuery(name = "Databases.findByServiceBrokerGuid", query = "SELECT d FROM Databases d WHERE d.serviceBrokerGuid = :serviceBrokerGuid"),
    @NamedQuery(name = "Databases.findByIsBrokerEnabled", query = "SELECT d FROM Databases d WHERE d.isBrokerEnabled = :isBrokerEnabled"),
    @NamedQuery(name = "Databases.findByLogReuseWait", query = "SELECT d FROM Databases d WHERE d.logReuseWait = :logReuseWait"),
    @NamedQuery(name = "Databases.findByLogReuseWaitDesc", query = "SELECT d FROM Databases d WHERE d.logReuseWaitDesc = :logReuseWaitDesc"),
    @NamedQuery(name = "Databases.findByIsDateCorrelationOn", query = "SELECT d FROM Databases d WHERE d.isDateCorrelationOn = :isDateCorrelationOn"),
    @NamedQuery(name = "Databases.findByIsCdcEnabled", query = "SELECT d FROM Databases d WHERE d.isCdcEnabled = :isCdcEnabled"),
    @NamedQuery(name = "Databases.findByIsEncrypted", query = "SELECT d FROM Databases d WHERE d.isEncrypted = :isEncrypted"),
    @NamedQuery(name = "Databases.findByIsHonorBrokerPriorityOn", query = "SELECT d FROM Databases d WHERE d.isHonorBrokerPriorityOn = :isHonorBrokerPriorityOn"),
    @NamedQuery(name = "Databases.findByReplicaId", query = "SELECT d FROM Databases d WHERE d.replicaId = :replicaId"),
    @NamedQuery(name = "Databases.findByGroupDatabaseId", query = "SELECT d FROM Databases d WHERE d.groupDatabaseId = :groupDatabaseId"),
    @NamedQuery(name = "Databases.findByResourcePoolId", query = "SELECT d FROM Databases d WHERE d.resourcePoolId = :resourcePoolId"),
    @NamedQuery(name = "Databases.findByDefaultLanguageLcid", query = "SELECT d FROM Databases d WHERE d.defaultLanguageLcid = :defaultLanguageLcid"),
    @NamedQuery(name = "Databases.findByDefaultLanguageName", query = "SELECT d FROM Databases d WHERE d.defaultLanguageName = :defaultLanguageName"),
    @NamedQuery(name = "Databases.findByDefaultFulltextLanguageLcid", query = "SELECT d FROM Databases d WHERE d.defaultFulltextLanguageLcid = :defaultFulltextLanguageLcid"),
    @NamedQuery(name = "Databases.findByDefaultFulltextLanguageName", query = "SELECT d FROM Databases d WHERE d.defaultFulltextLanguageName = :defaultFulltextLanguageName"),
    @NamedQuery(name = "Databases.findByIsNestedTriggersOn", query = "SELECT d FROM Databases d WHERE d.isNestedTriggersOn = :isNestedTriggersOn"),
    @NamedQuery(name = "Databases.findByIsTransformNoiseWordsOn", query = "SELECT d FROM Databases d WHERE d.isTransformNoiseWordsOn = :isTransformNoiseWordsOn"),
    @NamedQuery(name = "Databases.findByTwoDigitYearCutoff", query = "SELECT d FROM Databases d WHERE d.twoDigitYearCutoff = :twoDigitYearCutoff"),
    @NamedQuery(name = "Databases.findByContainment", query = "SELECT d FROM Databases d WHERE d.containment = :containment"),
    @NamedQuery(name = "Databases.findByContainmentDesc", query = "SELECT d FROM Databases d WHERE d.containmentDesc = :containmentDesc"),
    @NamedQuery(name = "Databases.findByTargetRecoveryTimeInSeconds", query = "SELECT d FROM Databases d WHERE d.targetRecoveryTimeInSeconds = :targetRecoveryTimeInSeconds"),
    @NamedQuery(name = "Databases.findByDelayedDurability", query = "SELECT d FROM Databases d WHERE d.delayedDurability = :delayedDurability"),
    @NamedQuery(name = "Databases.findByDelayedDurabilityDesc", query = "SELECT d FROM Databases d WHERE d.delayedDurabilityDesc = :delayedDurabilityDesc"),
    @NamedQuery(name = "Databases.findByIsMemoryOptimizedElevateToSnapshotOn", query = "SELECT d FROM Databases d WHERE d.isMemoryOptimizedElevateToSnapshotOn = :isMemoryOptimizedElevateToSnapshotOn"),
    @NamedQuery(name = "Databases.findByIsFederationMember", query = "SELECT d FROM Databases d WHERE d.isFederationMember = :isFederationMember"),
    @NamedQuery(name = "Databases.findByIsRemoteDataArchiveEnabled", query = "SELECT d FROM Databases d WHERE d.isRemoteDataArchiveEnabled = :isRemoteDataArchiveEnabled"),
    @NamedQuery(name = "Databases.findByIsMixedPageAllocationOn", query = "SELECT d FROM Databases d WHERE d.isMixedPageAllocationOn = :isMixedPageAllocationOn"),
    @NamedQuery(name = "Databases.findByIsTemporalHistoryRetentionEnabled", query = "SELECT d FROM Databases d WHERE d.isTemporalHistoryRetentionEnabled = :isTemporalHistoryRetentionEnabled"),
    @NamedQuery(name = "Databases.findByCatalogCollationType", query = "SELECT d FROM Databases d WHERE d.catalogCollationType = :catalogCollationType"),
    @NamedQuery(name = "Databases.findByCatalogCollationTypeDesc", query = "SELECT d FROM Databases d WHERE d.catalogCollationTypeDesc = :catalogCollationTypeDesc"),
    @NamedQuery(name = "Databases.findByPhysicalDatabaseName", query = "SELECT d FROM Databases d WHERE d.physicalDatabaseName = :physicalDatabaseName"),
    @NamedQuery(name = "Databases.findByIsResultSetCachingOn", query = "SELECT d FROM Databases d WHERE d.isResultSetCachingOn = :isResultSetCachingOn"),
    @NamedQuery(name = "Databases.findByIsAcceleratedDatabaseRecoveryOn", query = "SELECT d FROM Databases d WHERE d.isAcceleratedDatabaseRecoveryOn = :isAcceleratedDatabaseRecoveryOn"),
    @NamedQuery(name = "Databases.findByIsTempdbSpillToRemoteStore", query = "SELECT d FROM Databases d WHERE d.isTempdbSpillToRemoteStore = :isTempdbSpillToRemoteStore"),
    @NamedQuery(name = "Databases.findByIsStalePageDetectionOn", query = "SELECT d FROM Databases d WHERE d.isStalePageDetectionOn = :isStalePageDetectionOn"),
    @NamedQuery(name = "Databases.findByIsMemoryOptimizedEnabled", query = "SELECT d FROM Databases d WHERE d.isMemoryOptimizedEnabled = :isMemoryOptimizedEnabled"),
    @NamedQuery(name = "Databases.findByIsDataRetentionEnabled", query = "SELECT d FROM Databases d WHERE d.isDataRetentionEnabled = :isDataRetentionEnabled"),
    @NamedQuery(name = "Databases.findByIsLedgerOn", query = "SELECT d FROM Databases d WHERE d.isLedgerOn = :isLedgerOn"),
    @NamedQuery(name = "Databases.findByIsChangeFeedEnabled", query = "SELECT d FROM Databases d WHERE d.isChangeFeedEnabled = :isChangeFeedEnabled")})
public class Databases implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "database_id")
    private int databaseId;
    @Column(name = "source_database_id")
    private Integer sourceDatabaseId;
    @Lob
    @Column(name = "owner_sid")
    private byte[] ownerSid;
    @Basic(optional = false)
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @Column(name = "compatibility_level")
    private short compatibilityLevel;
    @Column(name = "collation_name")
    private String collationName;
    @Column(name = "user_access")
    private Short userAccess;
    @Column(name = "user_access_desc")
    private String userAccessDesc;
    @Column(name = "is_read_only")
    private Boolean isReadOnly;
    @Basic(optional = false)
    @Column(name = "is_auto_close_on")
    private boolean isAutoCloseOn;
    @Column(name = "is_auto_shrink_on")
    private Boolean isAutoShrinkOn;
    @Column(name = "state")
    private Short state;
    @Column(name = "state_desc")
    private String stateDesc;
    @Column(name = "is_in_standby")
    private Boolean isInStandby;
    @Column(name = "is_cleanly_shutdown")
    private Boolean isCleanlyShutdown;
    @Column(name = "is_supplemental_logging_enabled")
    private Boolean isSupplementalLoggingEnabled;
    @Column(name = "snapshot_isolation_state")
    private Short snapshotIsolationState;
    @Column(name = "snapshot_isolation_state_desc")
    private String snapshotIsolationStateDesc;
    @Column(name = "is_read_committed_snapshot_on")
    private Boolean isReadCommittedSnapshotOn;
    @Column(name = "recovery_model")
    private Short recoveryModel;
    @Column(name = "recovery_model_desc")
    private String recoveryModelDesc;
    @Column(name = "page_verify_option")
    private Short pageVerifyOption;
    @Column(name = "page_verify_option_desc")
    private String pageVerifyOptionDesc;
    @Column(name = "is_auto_create_stats_on")
    private Boolean isAutoCreateStatsOn;
    @Column(name = "is_auto_create_stats_incremental_on")
    private Boolean isAutoCreateStatsIncrementalOn;
    @Column(name = "is_auto_update_stats_on")
    private Boolean isAutoUpdateStatsOn;
    @Column(name = "is_auto_update_stats_async_on")
    private Boolean isAutoUpdateStatsAsyncOn;
    @Column(name = "is_ansi_null_default_on")
    private Boolean isAnsiNullDefaultOn;
    @Column(name = "is_ansi_nulls_on")
    private Boolean isAnsiNullsOn;
    @Column(name = "is_ansi_padding_on")
    private Boolean isAnsiPaddingOn;
    @Column(name = "is_ansi_warnings_on")
    private Boolean isAnsiWarningsOn;
    @Column(name = "is_arithabort_on")
    private Boolean isArithabortOn;
    @Column(name = "is_concat_null_yields_null_on")
    private Boolean isConcatNullYieldsNullOn;
    @Column(name = "is_numeric_roundabort_on")
    private Boolean isNumericRoundabortOn;
    @Column(name = "is_quoted_identifier_on")
    private Boolean isQuotedIdentifierOn;
    @Column(name = "is_recursive_triggers_on")
    private Boolean isRecursiveTriggersOn;
    @Column(name = "is_cursor_close_on_commit_on")
    private Boolean isCursorCloseOnCommitOn;
    @Column(name = "is_local_cursor_default")
    private Boolean isLocalCursorDefault;
    @Column(name = "is_fulltext_enabled")
    private Boolean isFulltextEnabled;
    @Column(name = "is_trustworthy_on")
    private Boolean isTrustworthyOn;
    @Column(name = "is_db_chaining_on")
    private Boolean isDbChainingOn;
    @Column(name = "is_parameterization_forced")
    private Boolean isParameterizationForced;
    @Basic(optional = false)
    @Column(name = "is_master_key_encrypted_by_server")
    private boolean isMasterKeyEncryptedByServer;
    @Column(name = "is_query_store_on")
    private Boolean isQueryStoreOn;
    @Basic(optional = false)
    @Column(name = "is_published")
    private boolean isPublished;
    @Basic(optional = false)
    @Column(name = "is_subscribed")
    private boolean isSubscribed;
    @Basic(optional = false)
    @Column(name = "is_merge_published")
    private boolean isMergePublished;
    @Basic(optional = false)
    @Column(name = "is_distributor")
    private boolean isDistributor;
    @Basic(optional = false)
    @Column(name = "is_sync_with_backup")
    private boolean isSyncWithBackup;
    @Basic(optional = false)
    @Column(name = "service_broker_guid")
    private String serviceBrokerGuid;
    @Basic(optional = false)
    @Column(name = "is_broker_enabled")
    private boolean isBrokerEnabled;
    @Column(name = "log_reuse_wait")
    private Short logReuseWait;
    @Column(name = "log_reuse_wait_desc")
    private String logReuseWaitDesc;
    @Basic(optional = false)
    @Column(name = "is_date_correlation_on")
    private boolean isDateCorrelationOn;
    @Basic(optional = false)
    @Column(name = "is_cdc_enabled")
    private boolean isCdcEnabled;
    @Column(name = "is_encrypted")
    private Boolean isEncrypted;
    @Column(name = "is_honor_broker_priority_on")
    private Boolean isHonorBrokerPriorityOn;
    @Column(name = "replica_id")
    private String replicaId;
    @Column(name = "group_database_id")
    private String groupDatabaseId;
    @Column(name = "resource_pool_id")
    private Integer resourcePoolId;
    @Column(name = "default_language_lcid")
    private Short defaultLanguageLcid;
    @Column(name = "default_language_name")
    private String defaultLanguageName;
    @Column(name = "default_fulltext_language_lcid")
    private Integer defaultFulltextLanguageLcid;
    @Column(name = "default_fulltext_language_name")
    private String defaultFulltextLanguageName;
    @Column(name = "is_nested_triggers_on")
    private Boolean isNestedTriggersOn;
    @Column(name = "is_transform_noise_words_on")
    private Boolean isTransformNoiseWordsOn;
    @Column(name = "two_digit_year_cutoff")
    private Short twoDigitYearCutoff;
    @Column(name = "containment")
    private Short containment;
    @Column(name = "containment_desc")
    private String containmentDesc;
    @Column(name = "target_recovery_time_in_seconds")
    private Integer targetRecoveryTimeInSeconds;
    @Column(name = "delayed_durability")
    private Integer delayedDurability;
    @Column(name = "delayed_durability_desc")
    private String delayedDurabilityDesc;
    @Column(name = "is_memory_optimized_elevate_to_snapshot_on")
    private Boolean isMemoryOptimizedElevateToSnapshotOn;
    @Column(name = "is_federation_member")
    private Boolean isFederationMember;
    @Column(name = "is_remote_data_archive_enabled")
    private Boolean isRemoteDataArchiveEnabled;
    @Column(name = "is_mixed_page_allocation_on")
    private Boolean isMixedPageAllocationOn;
    @Column(name = "is_temporal_history_retention_enabled")
    private Boolean isTemporalHistoryRetentionEnabled;
    @Basic(optional = false)
    @Column(name = "catalog_collation_type")
    private int catalogCollationType;
    @Column(name = "catalog_collation_type_desc")
    private String catalogCollationTypeDesc;
    @Column(name = "physical_database_name")
    private String physicalDatabaseName;
    @Column(name = "is_result_set_caching_on")
    private Boolean isResultSetCachingOn;
    @Column(name = "is_accelerated_database_recovery_on")
    private Boolean isAcceleratedDatabaseRecoveryOn;
    @Column(name = "is_tempdb_spill_to_remote_store")
    private Boolean isTempdbSpillToRemoteStore;
    @Column(name = "is_stale_page_detection_on")
    private Boolean isStalePageDetectionOn;
    @Column(name = "is_memory_optimized_enabled")
    private Boolean isMemoryOptimizedEnabled;
    @Column(name = "is_data_retention_enabled")
    private Boolean isDataRetentionEnabled;
    @Column(name = "is_ledger_on")
    private Boolean isLedgerOn;
    @Column(name = "is_change_feed_enabled")
    private Boolean isChangeFeedEnabled;

    public Databases() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(int databaseId) {
        this.databaseId = databaseId;
    }

    public Integer getSourceDatabaseId() {
        return sourceDatabaseId;
    }

    public void setSourceDatabaseId(Integer sourceDatabaseId) {
        this.sourceDatabaseId = sourceDatabaseId;
    }

    public byte[] getOwnerSid() {
        return ownerSid;
    }

    public void setOwnerSid(byte[] ownerSid) {
        this.ownerSid = ownerSid;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public short getCompatibilityLevel() {
        return compatibilityLevel;
    }

    public void setCompatibilityLevel(short compatibilityLevel) {
        this.compatibilityLevel = compatibilityLevel;
    }

    public String getCollationName() {
        return collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    public Short getUserAccess() {
        return userAccess;
    }

    public void setUserAccess(Short userAccess) {
        this.userAccess = userAccess;
    }

    public String getUserAccessDesc() {
        return userAccessDesc;
    }

    public void setUserAccessDesc(String userAccessDesc) {
        this.userAccessDesc = userAccessDesc;
    }

    public Boolean getIsReadOnly() {
        return isReadOnly;
    }

    public void setIsReadOnly(Boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }

    public boolean getIsAutoCloseOn() {
        return isAutoCloseOn;
    }

    public void setIsAutoCloseOn(boolean isAutoCloseOn) {
        this.isAutoCloseOn = isAutoCloseOn;
    }

    public Boolean getIsAutoShrinkOn() {
        return isAutoShrinkOn;
    }

    public void setIsAutoShrinkOn(Boolean isAutoShrinkOn) {
        this.isAutoShrinkOn = isAutoShrinkOn;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }

    public Boolean getIsInStandby() {
        return isInStandby;
    }

    public void setIsInStandby(Boolean isInStandby) {
        this.isInStandby = isInStandby;
    }

    public Boolean getIsCleanlyShutdown() {
        return isCleanlyShutdown;
    }

    public void setIsCleanlyShutdown(Boolean isCleanlyShutdown) {
        this.isCleanlyShutdown = isCleanlyShutdown;
    }

    public Boolean getIsSupplementalLoggingEnabled() {
        return isSupplementalLoggingEnabled;
    }

    public void setIsSupplementalLoggingEnabled(Boolean isSupplementalLoggingEnabled) {
        this.isSupplementalLoggingEnabled = isSupplementalLoggingEnabled;
    }

    public Short getSnapshotIsolationState() {
        return snapshotIsolationState;
    }

    public void setSnapshotIsolationState(Short snapshotIsolationState) {
        this.snapshotIsolationState = snapshotIsolationState;
    }

    public String getSnapshotIsolationStateDesc() {
        return snapshotIsolationStateDesc;
    }

    public void setSnapshotIsolationStateDesc(String snapshotIsolationStateDesc) {
        this.snapshotIsolationStateDesc = snapshotIsolationStateDesc;
    }

    public Boolean getIsReadCommittedSnapshotOn() {
        return isReadCommittedSnapshotOn;
    }

    public void setIsReadCommittedSnapshotOn(Boolean isReadCommittedSnapshotOn) {
        this.isReadCommittedSnapshotOn = isReadCommittedSnapshotOn;
    }

    public Short getRecoveryModel() {
        return recoveryModel;
    }

    public void setRecoveryModel(Short recoveryModel) {
        this.recoveryModel = recoveryModel;
    }

    public String getRecoveryModelDesc() {
        return recoveryModelDesc;
    }

    public void setRecoveryModelDesc(String recoveryModelDesc) {
        this.recoveryModelDesc = recoveryModelDesc;
    }

    public Short getPageVerifyOption() {
        return pageVerifyOption;
    }

    public void setPageVerifyOption(Short pageVerifyOption) {
        this.pageVerifyOption = pageVerifyOption;
    }

    public String getPageVerifyOptionDesc() {
        return pageVerifyOptionDesc;
    }

    public void setPageVerifyOptionDesc(String pageVerifyOptionDesc) {
        this.pageVerifyOptionDesc = pageVerifyOptionDesc;
    }

    public Boolean getIsAutoCreateStatsOn() {
        return isAutoCreateStatsOn;
    }

    public void setIsAutoCreateStatsOn(Boolean isAutoCreateStatsOn) {
        this.isAutoCreateStatsOn = isAutoCreateStatsOn;
    }

    public Boolean getIsAutoCreateStatsIncrementalOn() {
        return isAutoCreateStatsIncrementalOn;
    }

    public void setIsAutoCreateStatsIncrementalOn(Boolean isAutoCreateStatsIncrementalOn) {
        this.isAutoCreateStatsIncrementalOn = isAutoCreateStatsIncrementalOn;
    }

    public Boolean getIsAutoUpdateStatsOn() {
        return isAutoUpdateStatsOn;
    }

    public void setIsAutoUpdateStatsOn(Boolean isAutoUpdateStatsOn) {
        this.isAutoUpdateStatsOn = isAutoUpdateStatsOn;
    }

    public Boolean getIsAutoUpdateStatsAsyncOn() {
        return isAutoUpdateStatsAsyncOn;
    }

    public void setIsAutoUpdateStatsAsyncOn(Boolean isAutoUpdateStatsAsyncOn) {
        this.isAutoUpdateStatsAsyncOn = isAutoUpdateStatsAsyncOn;
    }

    public Boolean getIsAnsiNullDefaultOn() {
        return isAnsiNullDefaultOn;
    }

    public void setIsAnsiNullDefaultOn(Boolean isAnsiNullDefaultOn) {
        this.isAnsiNullDefaultOn = isAnsiNullDefaultOn;
    }

    public Boolean getIsAnsiNullsOn() {
        return isAnsiNullsOn;
    }

    public void setIsAnsiNullsOn(Boolean isAnsiNullsOn) {
        this.isAnsiNullsOn = isAnsiNullsOn;
    }

    public Boolean getIsAnsiPaddingOn() {
        return isAnsiPaddingOn;
    }

    public void setIsAnsiPaddingOn(Boolean isAnsiPaddingOn) {
        this.isAnsiPaddingOn = isAnsiPaddingOn;
    }

    public Boolean getIsAnsiWarningsOn() {
        return isAnsiWarningsOn;
    }

    public void setIsAnsiWarningsOn(Boolean isAnsiWarningsOn) {
        this.isAnsiWarningsOn = isAnsiWarningsOn;
    }

    public Boolean getIsArithabortOn() {
        return isArithabortOn;
    }

    public void setIsArithabortOn(Boolean isArithabortOn) {
        this.isArithabortOn = isArithabortOn;
    }

    public Boolean getIsConcatNullYieldsNullOn() {
        return isConcatNullYieldsNullOn;
    }

    public void setIsConcatNullYieldsNullOn(Boolean isConcatNullYieldsNullOn) {
        this.isConcatNullYieldsNullOn = isConcatNullYieldsNullOn;
    }

    public Boolean getIsNumericRoundabortOn() {
        return isNumericRoundabortOn;
    }

    public void setIsNumericRoundabortOn(Boolean isNumericRoundabortOn) {
        this.isNumericRoundabortOn = isNumericRoundabortOn;
    }

    public Boolean getIsQuotedIdentifierOn() {
        return isQuotedIdentifierOn;
    }

    public void setIsQuotedIdentifierOn(Boolean isQuotedIdentifierOn) {
        this.isQuotedIdentifierOn = isQuotedIdentifierOn;
    }

    public Boolean getIsRecursiveTriggersOn() {
        return isRecursiveTriggersOn;
    }

    public void setIsRecursiveTriggersOn(Boolean isRecursiveTriggersOn) {
        this.isRecursiveTriggersOn = isRecursiveTriggersOn;
    }

    public Boolean getIsCursorCloseOnCommitOn() {
        return isCursorCloseOnCommitOn;
    }

    public void setIsCursorCloseOnCommitOn(Boolean isCursorCloseOnCommitOn) {
        this.isCursorCloseOnCommitOn = isCursorCloseOnCommitOn;
    }

    public Boolean getIsLocalCursorDefault() {
        return isLocalCursorDefault;
    }

    public void setIsLocalCursorDefault(Boolean isLocalCursorDefault) {
        this.isLocalCursorDefault = isLocalCursorDefault;
    }

    public Boolean getIsFulltextEnabled() {
        return isFulltextEnabled;
    }

    public void setIsFulltextEnabled(Boolean isFulltextEnabled) {
        this.isFulltextEnabled = isFulltextEnabled;
    }

    public Boolean getIsTrustworthyOn() {
        return isTrustworthyOn;
    }

    public void setIsTrustworthyOn(Boolean isTrustworthyOn) {
        this.isTrustworthyOn = isTrustworthyOn;
    }

    public Boolean getIsDbChainingOn() {
        return isDbChainingOn;
    }

    public void setIsDbChainingOn(Boolean isDbChainingOn) {
        this.isDbChainingOn = isDbChainingOn;
    }

    public Boolean getIsParameterizationForced() {
        return isParameterizationForced;
    }

    public void setIsParameterizationForced(Boolean isParameterizationForced) {
        this.isParameterizationForced = isParameterizationForced;
    }

    public boolean getIsMasterKeyEncryptedByServer() {
        return isMasterKeyEncryptedByServer;
    }

    public void setIsMasterKeyEncryptedByServer(boolean isMasterKeyEncryptedByServer) {
        this.isMasterKeyEncryptedByServer = isMasterKeyEncryptedByServer;
    }

    public Boolean getIsQueryStoreOn() {
        return isQueryStoreOn;
    }

    public void setIsQueryStoreOn(Boolean isQueryStoreOn) {
        this.isQueryStoreOn = isQueryStoreOn;
    }

    public boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(boolean isPublished) {
        this.isPublished = isPublished;
    }

    public boolean getIsSubscribed() {
        return isSubscribed;
    }

    public void setIsSubscribed(boolean isSubscribed) {
        this.isSubscribed = isSubscribed;
    }

    public boolean getIsMergePublished() {
        return isMergePublished;
    }

    public void setIsMergePublished(boolean isMergePublished) {
        this.isMergePublished = isMergePublished;
    }

    public boolean getIsDistributor() {
        return isDistributor;
    }

    public void setIsDistributor(boolean isDistributor) {
        this.isDistributor = isDistributor;
    }

    public boolean getIsSyncWithBackup() {
        return isSyncWithBackup;
    }

    public void setIsSyncWithBackup(boolean isSyncWithBackup) {
        this.isSyncWithBackup = isSyncWithBackup;
    }

    public String getServiceBrokerGuid() {
        return serviceBrokerGuid;
    }

    public void setServiceBrokerGuid(String serviceBrokerGuid) {
        this.serviceBrokerGuid = serviceBrokerGuid;
    }

    public boolean getIsBrokerEnabled() {
        return isBrokerEnabled;
    }

    public void setIsBrokerEnabled(boolean isBrokerEnabled) {
        this.isBrokerEnabled = isBrokerEnabled;
    }

    public Short getLogReuseWait() {
        return logReuseWait;
    }

    public void setLogReuseWait(Short logReuseWait) {
        this.logReuseWait = logReuseWait;
    }

    public String getLogReuseWaitDesc() {
        return logReuseWaitDesc;
    }

    public void setLogReuseWaitDesc(String logReuseWaitDesc) {
        this.logReuseWaitDesc = logReuseWaitDesc;
    }

    public boolean getIsDateCorrelationOn() {
        return isDateCorrelationOn;
    }

    public void setIsDateCorrelationOn(boolean isDateCorrelationOn) {
        this.isDateCorrelationOn = isDateCorrelationOn;
    }

    public boolean getIsCdcEnabled() {
        return isCdcEnabled;
    }

    public void setIsCdcEnabled(boolean isCdcEnabled) {
        this.isCdcEnabled = isCdcEnabled;
    }

    public Boolean getIsEncrypted() {
        return isEncrypted;
    }

    public void setIsEncrypted(Boolean isEncrypted) {
        this.isEncrypted = isEncrypted;
    }

    public Boolean getIsHonorBrokerPriorityOn() {
        return isHonorBrokerPriorityOn;
    }

    public void setIsHonorBrokerPriorityOn(Boolean isHonorBrokerPriorityOn) {
        this.isHonorBrokerPriorityOn = isHonorBrokerPriorityOn;
    }

    public String getReplicaId() {
        return replicaId;
    }

    public void setReplicaId(String replicaId) {
        this.replicaId = replicaId;
    }

    public String getGroupDatabaseId() {
        return groupDatabaseId;
    }

    public void setGroupDatabaseId(String groupDatabaseId) {
        this.groupDatabaseId = groupDatabaseId;
    }

    public Integer getResourcePoolId() {
        return resourcePoolId;
    }

    public void setResourcePoolId(Integer resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
    }

    public Short getDefaultLanguageLcid() {
        return defaultLanguageLcid;
    }

    public void setDefaultLanguageLcid(Short defaultLanguageLcid) {
        this.defaultLanguageLcid = defaultLanguageLcid;
    }

    public String getDefaultLanguageName() {
        return defaultLanguageName;
    }

    public void setDefaultLanguageName(String defaultLanguageName) {
        this.defaultLanguageName = defaultLanguageName;
    }

    public Integer getDefaultFulltextLanguageLcid() {
        return defaultFulltextLanguageLcid;
    }

    public void setDefaultFulltextLanguageLcid(Integer defaultFulltextLanguageLcid) {
        this.defaultFulltextLanguageLcid = defaultFulltextLanguageLcid;
    }

    public String getDefaultFulltextLanguageName() {
        return defaultFulltextLanguageName;
    }

    public void setDefaultFulltextLanguageName(String defaultFulltextLanguageName) {
        this.defaultFulltextLanguageName = defaultFulltextLanguageName;
    }

    public Boolean getIsNestedTriggersOn() {
        return isNestedTriggersOn;
    }

    public void setIsNestedTriggersOn(Boolean isNestedTriggersOn) {
        this.isNestedTriggersOn = isNestedTriggersOn;
    }

    public Boolean getIsTransformNoiseWordsOn() {
        return isTransformNoiseWordsOn;
    }

    public void setIsTransformNoiseWordsOn(Boolean isTransformNoiseWordsOn) {
        this.isTransformNoiseWordsOn = isTransformNoiseWordsOn;
    }

    public Short getTwoDigitYearCutoff() {
        return twoDigitYearCutoff;
    }

    public void setTwoDigitYearCutoff(Short twoDigitYearCutoff) {
        this.twoDigitYearCutoff = twoDigitYearCutoff;
    }

    public Short getContainment() {
        return containment;
    }

    public void setContainment(Short containment) {
        this.containment = containment;
    }

    public String getContainmentDesc() {
        return containmentDesc;
    }

    public void setContainmentDesc(String containmentDesc) {
        this.containmentDesc = containmentDesc;
    }

    public Integer getTargetRecoveryTimeInSeconds() {
        return targetRecoveryTimeInSeconds;
    }

    public void setTargetRecoveryTimeInSeconds(Integer targetRecoveryTimeInSeconds) {
        this.targetRecoveryTimeInSeconds = targetRecoveryTimeInSeconds;
    }

    public Integer getDelayedDurability() {
        return delayedDurability;
    }

    public void setDelayedDurability(Integer delayedDurability) {
        this.delayedDurability = delayedDurability;
    }

    public String getDelayedDurabilityDesc() {
        return delayedDurabilityDesc;
    }

    public void setDelayedDurabilityDesc(String delayedDurabilityDesc) {
        this.delayedDurabilityDesc = delayedDurabilityDesc;
    }

    public Boolean getIsMemoryOptimizedElevateToSnapshotOn() {
        return isMemoryOptimizedElevateToSnapshotOn;
    }

    public void setIsMemoryOptimizedElevateToSnapshotOn(Boolean isMemoryOptimizedElevateToSnapshotOn) {
        this.isMemoryOptimizedElevateToSnapshotOn = isMemoryOptimizedElevateToSnapshotOn;
    }

    public Boolean getIsFederationMember() {
        return isFederationMember;
    }

    public void setIsFederationMember(Boolean isFederationMember) {
        this.isFederationMember = isFederationMember;
    }

    public Boolean getIsRemoteDataArchiveEnabled() {
        return isRemoteDataArchiveEnabled;
    }

    public void setIsRemoteDataArchiveEnabled(Boolean isRemoteDataArchiveEnabled) {
        this.isRemoteDataArchiveEnabled = isRemoteDataArchiveEnabled;
    }

    public Boolean getIsMixedPageAllocationOn() {
        return isMixedPageAllocationOn;
    }

    public void setIsMixedPageAllocationOn(Boolean isMixedPageAllocationOn) {
        this.isMixedPageAllocationOn = isMixedPageAllocationOn;
    }

    public Boolean getIsTemporalHistoryRetentionEnabled() {
        return isTemporalHistoryRetentionEnabled;
    }

    public void setIsTemporalHistoryRetentionEnabled(Boolean isTemporalHistoryRetentionEnabled) {
        this.isTemporalHistoryRetentionEnabled = isTemporalHistoryRetentionEnabled;
    }

    public int getCatalogCollationType() {
        return catalogCollationType;
    }

    public void setCatalogCollationType(int catalogCollationType) {
        this.catalogCollationType = catalogCollationType;
    }

    public String getCatalogCollationTypeDesc() {
        return catalogCollationTypeDesc;
    }

    public void setCatalogCollationTypeDesc(String catalogCollationTypeDesc) {
        this.catalogCollationTypeDesc = catalogCollationTypeDesc;
    }

    public String getPhysicalDatabaseName() {
        return physicalDatabaseName;
    }

    public void setPhysicalDatabaseName(String physicalDatabaseName) {
        this.physicalDatabaseName = physicalDatabaseName;
    }

    public Boolean getIsResultSetCachingOn() {
        return isResultSetCachingOn;
    }

    public void setIsResultSetCachingOn(Boolean isResultSetCachingOn) {
        this.isResultSetCachingOn = isResultSetCachingOn;
    }

    public Boolean getIsAcceleratedDatabaseRecoveryOn() {
        return isAcceleratedDatabaseRecoveryOn;
    }

    public void setIsAcceleratedDatabaseRecoveryOn(Boolean isAcceleratedDatabaseRecoveryOn) {
        this.isAcceleratedDatabaseRecoveryOn = isAcceleratedDatabaseRecoveryOn;
    }

    public Boolean getIsTempdbSpillToRemoteStore() {
        return isTempdbSpillToRemoteStore;
    }

    public void setIsTempdbSpillToRemoteStore(Boolean isTempdbSpillToRemoteStore) {
        this.isTempdbSpillToRemoteStore = isTempdbSpillToRemoteStore;
    }

    public Boolean getIsStalePageDetectionOn() {
        return isStalePageDetectionOn;
    }

    public void setIsStalePageDetectionOn(Boolean isStalePageDetectionOn) {
        this.isStalePageDetectionOn = isStalePageDetectionOn;
    }

    public Boolean getIsMemoryOptimizedEnabled() {
        return isMemoryOptimizedEnabled;
    }

    public void setIsMemoryOptimizedEnabled(Boolean isMemoryOptimizedEnabled) {
        this.isMemoryOptimizedEnabled = isMemoryOptimizedEnabled;
    }

    public Boolean getIsDataRetentionEnabled() {
        return isDataRetentionEnabled;
    }

    public void setIsDataRetentionEnabled(Boolean isDataRetentionEnabled) {
        this.isDataRetentionEnabled = isDataRetentionEnabled;
    }

    public Boolean getIsLedgerOn() {
        return isLedgerOn;
    }

    public void setIsLedgerOn(Boolean isLedgerOn) {
        this.isLedgerOn = isLedgerOn;
    }

    public Boolean getIsChangeFeedEnabled() {
        return isChangeFeedEnabled;
    }

    public void setIsChangeFeedEnabled(Boolean isChangeFeedEnabled) {
        this.isChangeFeedEnabled = isChangeFeedEnabled;
    }
    
}
