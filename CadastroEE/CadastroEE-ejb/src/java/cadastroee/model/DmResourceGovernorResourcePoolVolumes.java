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
import java.math.BigInteger;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "dm_resource_governor_resource_pool_volumes")
@NamedQueries({
    @NamedQuery(name = "DmResourceGovernorResourcePoolVolumes.findAll", query = "SELECT d FROM DmResourceGovernorResourcePoolVolumes d"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolVolumes.findByPoolId", query = "SELECT d FROM DmResourceGovernorResourcePoolVolumes d WHERE d.poolId = :poolId"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolVolumes.findByVolumeName", query = "SELECT d FROM DmResourceGovernorResourcePoolVolumes d WHERE d.volumeName = :volumeName"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolVolumes.findByReadIoQueuedTotal", query = "SELECT d FROM DmResourceGovernorResourcePoolVolumes d WHERE d.readIoQueuedTotal = :readIoQueuedTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolVolumes.findByReadIoIssuedTotal", query = "SELECT d FROM DmResourceGovernorResourcePoolVolumes d WHERE d.readIoIssuedTotal = :readIoIssuedTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolVolumes.findByReadIoCompletedTotal", query = "SELECT d FROM DmResourceGovernorResourcePoolVolumes d WHERE d.readIoCompletedTotal = :readIoCompletedTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolVolumes.findByReadIoThrottledTotal", query = "SELECT d FROM DmResourceGovernorResourcePoolVolumes d WHERE d.readIoThrottledTotal = :readIoThrottledTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolVolumes.findByReadBytesTotal", query = "SELECT d FROM DmResourceGovernorResourcePoolVolumes d WHERE d.readBytesTotal = :readBytesTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolVolumes.findByReadIoStallTotalMs", query = "SELECT d FROM DmResourceGovernorResourcePoolVolumes d WHERE d.readIoStallTotalMs = :readIoStallTotalMs"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolVolumes.findByReadIoStallQueuedMs", query = "SELECT d FROM DmResourceGovernorResourcePoolVolumes d WHERE d.readIoStallQueuedMs = :readIoStallQueuedMs"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolVolumes.findByWriteIoQueuedTotal", query = "SELECT d FROM DmResourceGovernorResourcePoolVolumes d WHERE d.writeIoQueuedTotal = :writeIoQueuedTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolVolumes.findByWriteIoIssuedTotal", query = "SELECT d FROM DmResourceGovernorResourcePoolVolumes d WHERE d.writeIoIssuedTotal = :writeIoIssuedTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolVolumes.findByWriteIoCompletedTotal", query = "SELECT d FROM DmResourceGovernorResourcePoolVolumes d WHERE d.writeIoCompletedTotal = :writeIoCompletedTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolVolumes.findByWriteIoThrottledTotal", query = "SELECT d FROM DmResourceGovernorResourcePoolVolumes d WHERE d.writeIoThrottledTotal = :writeIoThrottledTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolVolumes.findByWriteBytesTotal", query = "SELECT d FROM DmResourceGovernorResourcePoolVolumes d WHERE d.writeBytesTotal = :writeBytesTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolVolumes.findByWriteIoStallTotalMs", query = "SELECT d FROM DmResourceGovernorResourcePoolVolumes d WHERE d.writeIoStallTotalMs = :writeIoStallTotalMs"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolVolumes.findByWriteIoStallQueuedMs", query = "SELECT d FROM DmResourceGovernorResourcePoolVolumes d WHERE d.writeIoStallQueuedMs = :writeIoStallQueuedMs"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolVolumes.findByIoIssueViolationsTotal", query = "SELECT d FROM DmResourceGovernorResourcePoolVolumes d WHERE d.ioIssueViolationsTotal = :ioIssueViolationsTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolVolumes.findByIoIssueDelayTotalMs", query = "SELECT d FROM DmResourceGovernorResourcePoolVolumes d WHERE d.ioIssueDelayTotalMs = :ioIssueDelayTotalMs"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolVolumes.findByIoIssueAheadTotalMs", query = "SELECT d FROM DmResourceGovernorResourcePoolVolumes d WHERE d.ioIssueAheadTotalMs = :ioIssueAheadTotalMs"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolVolumes.findByReservedIoLimitedByVolumeTotal", query = "SELECT d FROM DmResourceGovernorResourcePoolVolumes d WHERE d.reservedIoLimitedByVolumeTotal = :reservedIoLimitedByVolumeTotal"),
    @NamedQuery(name = "DmResourceGovernorResourcePoolVolumes.findByIoIssueDelayNonThrottledTotalMs", query = "SELECT d FROM DmResourceGovernorResourcePoolVolumes d WHERE d.ioIssueDelayNonThrottledTotalMs = :ioIssueDelayNonThrottledTotalMs")})
public class DmResourceGovernorResourcePoolVolumes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "pool_id")
    private int poolId;
    @Basic(optional = false)
    @Column(name = "volume_name")
    private String volumeName;
    @Basic(optional = false)
    @Column(name = "read_io_queued_total")
    private int readIoQueuedTotal;
    @Basic(optional = false)
    @Column(name = "read_io_issued_total")
    private int readIoIssuedTotal;
    @Basic(optional = false)
    @Column(name = "read_io_completed_total")
    private int readIoCompletedTotal;
    @Basic(optional = false)
    @Column(name = "read_io_throttled_total")
    private int readIoThrottledTotal;
    @Basic(optional = false)
    @Column(name = "read_bytes_total")
    private long readBytesTotal;
    @Basic(optional = false)
    @Column(name = "read_io_stall_total_ms")
    private long readIoStallTotalMs;
    @Basic(optional = false)
    @Column(name = "read_io_stall_queued_ms")
    private long readIoStallQueuedMs;
    @Basic(optional = false)
    @Column(name = "write_io_queued_total")
    private int writeIoQueuedTotal;
    @Basic(optional = false)
    @Column(name = "write_io_issued_total")
    private int writeIoIssuedTotal;
    @Basic(optional = false)
    @Column(name = "write_io_completed_total")
    private int writeIoCompletedTotal;
    @Basic(optional = false)
    @Column(name = "write_io_throttled_total")
    private int writeIoThrottledTotal;
    @Basic(optional = false)
    @Column(name = "write_bytes_total")
    private long writeBytesTotal;
    @Basic(optional = false)
    @Column(name = "write_io_stall_total_ms")
    private long writeIoStallTotalMs;
    @Basic(optional = false)
    @Column(name = "write_io_stall_queued_ms")
    private long writeIoStallQueuedMs;
    @Basic(optional = false)
    @Column(name = "io_issue_violations_total")
    private int ioIssueViolationsTotal;
    @Basic(optional = false)
    @Column(name = "io_issue_delay_total_ms")
    private long ioIssueDelayTotalMs;
    @Basic(optional = false)
    @Column(name = "io_issue_ahead_total_ms")
    private long ioIssueAheadTotalMs;
    @Basic(optional = false)
    @Column(name = "reserved_io_limited_by_volume_total")
    private int reservedIoLimitedByVolumeTotal;
    @Column(name = "io_issue_delay_non_throttled_total_ms")
    private BigInteger ioIssueDelayNonThrottledTotalMs;

    public DmResourceGovernorResourcePoolVolumes() {
    }

    public int getPoolId() {
        return poolId;
    }

    public void setPoolId(int poolId) {
        this.poolId = poolId;
    }

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    public int getReadIoQueuedTotal() {
        return readIoQueuedTotal;
    }

    public void setReadIoQueuedTotal(int readIoQueuedTotal) {
        this.readIoQueuedTotal = readIoQueuedTotal;
    }

    public int getReadIoIssuedTotal() {
        return readIoIssuedTotal;
    }

    public void setReadIoIssuedTotal(int readIoIssuedTotal) {
        this.readIoIssuedTotal = readIoIssuedTotal;
    }

    public int getReadIoCompletedTotal() {
        return readIoCompletedTotal;
    }

    public void setReadIoCompletedTotal(int readIoCompletedTotal) {
        this.readIoCompletedTotal = readIoCompletedTotal;
    }

    public int getReadIoThrottledTotal() {
        return readIoThrottledTotal;
    }

    public void setReadIoThrottledTotal(int readIoThrottledTotal) {
        this.readIoThrottledTotal = readIoThrottledTotal;
    }

    public long getReadBytesTotal() {
        return readBytesTotal;
    }

    public void setReadBytesTotal(long readBytesTotal) {
        this.readBytesTotal = readBytesTotal;
    }

    public long getReadIoStallTotalMs() {
        return readIoStallTotalMs;
    }

    public void setReadIoStallTotalMs(long readIoStallTotalMs) {
        this.readIoStallTotalMs = readIoStallTotalMs;
    }

    public long getReadIoStallQueuedMs() {
        return readIoStallQueuedMs;
    }

    public void setReadIoStallQueuedMs(long readIoStallQueuedMs) {
        this.readIoStallQueuedMs = readIoStallQueuedMs;
    }

    public int getWriteIoQueuedTotal() {
        return writeIoQueuedTotal;
    }

    public void setWriteIoQueuedTotal(int writeIoQueuedTotal) {
        this.writeIoQueuedTotal = writeIoQueuedTotal;
    }

    public int getWriteIoIssuedTotal() {
        return writeIoIssuedTotal;
    }

    public void setWriteIoIssuedTotal(int writeIoIssuedTotal) {
        this.writeIoIssuedTotal = writeIoIssuedTotal;
    }

    public int getWriteIoCompletedTotal() {
        return writeIoCompletedTotal;
    }

    public void setWriteIoCompletedTotal(int writeIoCompletedTotal) {
        this.writeIoCompletedTotal = writeIoCompletedTotal;
    }

    public int getWriteIoThrottledTotal() {
        return writeIoThrottledTotal;
    }

    public void setWriteIoThrottledTotal(int writeIoThrottledTotal) {
        this.writeIoThrottledTotal = writeIoThrottledTotal;
    }

    public long getWriteBytesTotal() {
        return writeBytesTotal;
    }

    public void setWriteBytesTotal(long writeBytesTotal) {
        this.writeBytesTotal = writeBytesTotal;
    }

    public long getWriteIoStallTotalMs() {
        return writeIoStallTotalMs;
    }

    public void setWriteIoStallTotalMs(long writeIoStallTotalMs) {
        this.writeIoStallTotalMs = writeIoStallTotalMs;
    }

    public long getWriteIoStallQueuedMs() {
        return writeIoStallQueuedMs;
    }

    public void setWriteIoStallQueuedMs(long writeIoStallQueuedMs) {
        this.writeIoStallQueuedMs = writeIoStallQueuedMs;
    }

    public int getIoIssueViolationsTotal() {
        return ioIssueViolationsTotal;
    }

    public void setIoIssueViolationsTotal(int ioIssueViolationsTotal) {
        this.ioIssueViolationsTotal = ioIssueViolationsTotal;
    }

    public long getIoIssueDelayTotalMs() {
        return ioIssueDelayTotalMs;
    }

    public void setIoIssueDelayTotalMs(long ioIssueDelayTotalMs) {
        this.ioIssueDelayTotalMs = ioIssueDelayTotalMs;
    }

    public long getIoIssueAheadTotalMs() {
        return ioIssueAheadTotalMs;
    }

    public void setIoIssueAheadTotalMs(long ioIssueAheadTotalMs) {
        this.ioIssueAheadTotalMs = ioIssueAheadTotalMs;
    }

    public int getReservedIoLimitedByVolumeTotal() {
        return reservedIoLimitedByVolumeTotal;
    }

    public void setReservedIoLimitedByVolumeTotal(int reservedIoLimitedByVolumeTotal) {
        this.reservedIoLimitedByVolumeTotal = reservedIoLimitedByVolumeTotal;
    }

    public BigInteger getIoIssueDelayNonThrottledTotalMs() {
        return ioIssueDelayNonThrottledTotalMs;
    }

    public void setIoIssueDelayNonThrottledTotalMs(BigInteger ioIssueDelayNonThrottledTotalMs) {
        this.ioIssueDelayNonThrottledTotalMs = ioIssueDelayNonThrottledTotalMs;
    }
    
}
