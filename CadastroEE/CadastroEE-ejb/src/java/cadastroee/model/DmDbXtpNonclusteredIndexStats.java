/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "dm_db_xtp_nonclustered_index_stats")
@NamedQueries({
    @NamedQuery(name = "DmDbXtpNonclusteredIndexStats.findAll", query = "SELECT d FROM DmDbXtpNonclusteredIndexStats d"),
    @NamedQuery(name = "DmDbXtpNonclusteredIndexStats.findByObjectId", query = "SELECT d FROM DmDbXtpNonclusteredIndexStats d WHERE d.objectId = :objectId"),
    @NamedQuery(name = "DmDbXtpNonclusteredIndexStats.findByXtpObjectId", query = "SELECT d FROM DmDbXtpNonclusteredIndexStats d WHERE d.xtpObjectId = :xtpObjectId"),
    @NamedQuery(name = "DmDbXtpNonclusteredIndexStats.findByIndexId", query = "SELECT d FROM DmDbXtpNonclusteredIndexStats d WHERE d.indexId = :indexId"),
    @NamedQuery(name = "DmDbXtpNonclusteredIndexStats.findByDeltaPages", query = "SELECT d FROM DmDbXtpNonclusteredIndexStats d WHERE d.deltaPages = :deltaPages"),
    @NamedQuery(name = "DmDbXtpNonclusteredIndexStats.findByInternalPages", query = "SELECT d FROM DmDbXtpNonclusteredIndexStats d WHERE d.internalPages = :internalPages"),
    @NamedQuery(name = "DmDbXtpNonclusteredIndexStats.findByLeafPages", query = "SELECT d FROM DmDbXtpNonclusteredIndexStats d WHERE d.leafPages = :leafPages"),
    @NamedQuery(name = "DmDbXtpNonclusteredIndexStats.findByOutstandingRetiredNodes", query = "SELECT d FROM DmDbXtpNonclusteredIndexStats d WHERE d.outstandingRetiredNodes = :outstandingRetiredNodes"),
    @NamedQuery(name = "DmDbXtpNonclusteredIndexStats.findByPageUpdateCount", query = "SELECT d FROM DmDbXtpNonclusteredIndexStats d WHERE d.pageUpdateCount = :pageUpdateCount"),
    @NamedQuery(name = "DmDbXtpNonclusteredIndexStats.findByPageUpdateRetryCount", query = "SELECT d FROM DmDbXtpNonclusteredIndexStats d WHERE d.pageUpdateRetryCount = :pageUpdateRetryCount"),
    @NamedQuery(name = "DmDbXtpNonclusteredIndexStats.findByPageConsolidationCount", query = "SELECT d FROM DmDbXtpNonclusteredIndexStats d WHERE d.pageConsolidationCount = :pageConsolidationCount"),
    @NamedQuery(name = "DmDbXtpNonclusteredIndexStats.findByPageConsolidationRetryCount", query = "SELECT d FROM DmDbXtpNonclusteredIndexStats d WHERE d.pageConsolidationRetryCount = :pageConsolidationRetryCount"),
    @NamedQuery(name = "DmDbXtpNonclusteredIndexStats.findByPageSplitCount", query = "SELECT d FROM DmDbXtpNonclusteredIndexStats d WHERE d.pageSplitCount = :pageSplitCount"),
    @NamedQuery(name = "DmDbXtpNonclusteredIndexStats.findByPageSplitRetryCount", query = "SELECT d FROM DmDbXtpNonclusteredIndexStats d WHERE d.pageSplitRetryCount = :pageSplitRetryCount"),
    @NamedQuery(name = "DmDbXtpNonclusteredIndexStats.findByKeySplitCount", query = "SELECT d FROM DmDbXtpNonclusteredIndexStats d WHERE d.keySplitCount = :keySplitCount"),
    @NamedQuery(name = "DmDbXtpNonclusteredIndexStats.findByKeySplitRetryCount", query = "SELECT d FROM DmDbXtpNonclusteredIndexStats d WHERE d.keySplitRetryCount = :keySplitRetryCount"),
    @NamedQuery(name = "DmDbXtpNonclusteredIndexStats.findByPageMergeCount", query = "SELECT d FROM DmDbXtpNonclusteredIndexStats d WHERE d.pageMergeCount = :pageMergeCount"),
    @NamedQuery(name = "DmDbXtpNonclusteredIndexStats.findByPageMergeRetryCount", query = "SELECT d FROM DmDbXtpNonclusteredIndexStats d WHERE d.pageMergeRetryCount = :pageMergeRetryCount"),
    @NamedQuery(name = "DmDbXtpNonclusteredIndexStats.findByKeyMergeCount", query = "SELECT d FROM DmDbXtpNonclusteredIndexStats d WHERE d.keyMergeCount = :keyMergeCount"),
    @NamedQuery(name = "DmDbXtpNonclusteredIndexStats.findByKeyMergeRetryCount", query = "SELECT d FROM DmDbXtpNonclusteredIndexStats d WHERE d.keyMergeRetryCount = :keyMergeRetryCount"),
    @NamedQuery(name = "DmDbXtpNonclusteredIndexStats.findByUsesKeyNormalization", query = "SELECT d FROM DmDbXtpNonclusteredIndexStats d WHERE d.usesKeyNormalization = :usesKeyNormalization")})
public class DmDbXtpNonclusteredIndexStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @Column(name = "xtp_object_id")
    private int xtpObjectId;
    @Basic(optional = false)
    @Column(name = "index_id")
    private int indexId;
    @Basic(optional = false)
    @Column(name = "delta_pages")
    private long deltaPages;
    @Basic(optional = false)
    @Column(name = "internal_pages")
    private long internalPages;
    @Basic(optional = false)
    @Column(name = "leaf_pages")
    private long leafPages;
    @Basic(optional = false)
    @Column(name = "outstanding_retired_nodes")
    private long outstandingRetiredNodes;
    @Basic(optional = false)
    @Column(name = "page_update_count")
    private long pageUpdateCount;
    @Basic(optional = false)
    @Column(name = "page_update_retry_count")
    private long pageUpdateRetryCount;
    @Basic(optional = false)
    @Column(name = "page_consolidation_count")
    private long pageConsolidationCount;
    @Basic(optional = false)
    @Column(name = "page_consolidation_retry_count")
    private long pageConsolidationRetryCount;
    @Basic(optional = false)
    @Column(name = "page_split_count")
    private long pageSplitCount;
    @Basic(optional = false)
    @Column(name = "page_split_retry_count")
    private long pageSplitRetryCount;
    @Basic(optional = false)
    @Column(name = "key_split_count")
    private long keySplitCount;
    @Basic(optional = false)
    @Column(name = "key_split_retry_count")
    private long keySplitRetryCount;
    @Basic(optional = false)
    @Column(name = "page_merge_count")
    private long pageMergeCount;
    @Basic(optional = false)
    @Column(name = "page_merge_retry_count")
    private long pageMergeRetryCount;
    @Basic(optional = false)
    @Column(name = "key_merge_count")
    private long keyMergeCount;
    @Basic(optional = false)
    @Column(name = "key_merge_retry_count")
    private long keyMergeRetryCount;
    @Basic(optional = false)
    @Column(name = "uses_key_normalization")
    private boolean usesKeyNormalization;

    public DmDbXtpNonclusteredIndexStats() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getXtpObjectId() {
        return xtpObjectId;
    }

    public void setXtpObjectId(int xtpObjectId) {
        this.xtpObjectId = xtpObjectId;
    }

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    public long getDeltaPages() {
        return deltaPages;
    }

    public void setDeltaPages(long deltaPages) {
        this.deltaPages = deltaPages;
    }

    public long getInternalPages() {
        return internalPages;
    }

    public void setInternalPages(long internalPages) {
        this.internalPages = internalPages;
    }

    public long getLeafPages() {
        return leafPages;
    }

    public void setLeafPages(long leafPages) {
        this.leafPages = leafPages;
    }

    public long getOutstandingRetiredNodes() {
        return outstandingRetiredNodes;
    }

    public void setOutstandingRetiredNodes(long outstandingRetiredNodes) {
        this.outstandingRetiredNodes = outstandingRetiredNodes;
    }

    public long getPageUpdateCount() {
        return pageUpdateCount;
    }

    public void setPageUpdateCount(long pageUpdateCount) {
        this.pageUpdateCount = pageUpdateCount;
    }

    public long getPageUpdateRetryCount() {
        return pageUpdateRetryCount;
    }

    public void setPageUpdateRetryCount(long pageUpdateRetryCount) {
        this.pageUpdateRetryCount = pageUpdateRetryCount;
    }

    public long getPageConsolidationCount() {
        return pageConsolidationCount;
    }

    public void setPageConsolidationCount(long pageConsolidationCount) {
        this.pageConsolidationCount = pageConsolidationCount;
    }

    public long getPageConsolidationRetryCount() {
        return pageConsolidationRetryCount;
    }

    public void setPageConsolidationRetryCount(long pageConsolidationRetryCount) {
        this.pageConsolidationRetryCount = pageConsolidationRetryCount;
    }

    public long getPageSplitCount() {
        return pageSplitCount;
    }

    public void setPageSplitCount(long pageSplitCount) {
        this.pageSplitCount = pageSplitCount;
    }

    public long getPageSplitRetryCount() {
        return pageSplitRetryCount;
    }

    public void setPageSplitRetryCount(long pageSplitRetryCount) {
        this.pageSplitRetryCount = pageSplitRetryCount;
    }

    public long getKeySplitCount() {
        return keySplitCount;
    }

    public void setKeySplitCount(long keySplitCount) {
        this.keySplitCount = keySplitCount;
    }

    public long getKeySplitRetryCount() {
        return keySplitRetryCount;
    }

    public void setKeySplitRetryCount(long keySplitRetryCount) {
        this.keySplitRetryCount = keySplitRetryCount;
    }

    public long getPageMergeCount() {
        return pageMergeCount;
    }

    public void setPageMergeCount(long pageMergeCount) {
        this.pageMergeCount = pageMergeCount;
    }

    public long getPageMergeRetryCount() {
        return pageMergeRetryCount;
    }

    public void setPageMergeRetryCount(long pageMergeRetryCount) {
        this.pageMergeRetryCount = pageMergeRetryCount;
    }

    public long getKeyMergeCount() {
        return keyMergeCount;
    }

    public void setKeyMergeCount(long keyMergeCount) {
        this.keyMergeCount = keyMergeCount;
    }

    public long getKeyMergeRetryCount() {
        return keyMergeRetryCount;
    }

    public void setKeyMergeRetryCount(long keyMergeRetryCount) {
        this.keyMergeRetryCount = keyMergeRetryCount;
    }

    public boolean getUsesKeyNormalization() {
        return usesKeyNormalization;
    }

    public void setUsesKeyNormalization(boolean usesKeyNormalization) {
        this.usesKeyNormalization = usesKeyNormalization;
    }
    
}
