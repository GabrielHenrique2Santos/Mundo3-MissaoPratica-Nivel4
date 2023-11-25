/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

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
@Table(name = "dm_tran_active_snapshot_database_transactions")
@NamedQueries({
    @NamedQuery(name = "DmTranActiveSnapshotDatabaseTransactions.findAll", query = "SELECT d FROM DmTranActiveSnapshotDatabaseTransactions d"),
    @NamedQuery(name = "DmTranActiveSnapshotDatabaseTransactions.findByTransactionId", query = "SELECT d FROM DmTranActiveSnapshotDatabaseTransactions d WHERE d.transactionId = :transactionId"),
    @NamedQuery(name = "DmTranActiveSnapshotDatabaseTransactions.findByTransactionSequenceNum", query = "SELECT d FROM DmTranActiveSnapshotDatabaseTransactions d WHERE d.transactionSequenceNum = :transactionSequenceNum"),
    @NamedQuery(name = "DmTranActiveSnapshotDatabaseTransactions.findByCommitSequenceNum", query = "SELECT d FROM DmTranActiveSnapshotDatabaseTransactions d WHERE d.commitSequenceNum = :commitSequenceNum"),
    @NamedQuery(name = "DmTranActiveSnapshotDatabaseTransactions.findBySessionId", query = "SELECT d FROM DmTranActiveSnapshotDatabaseTransactions d WHERE d.sessionId = :sessionId"),
    @NamedQuery(name = "DmTranActiveSnapshotDatabaseTransactions.findByIsSnapshot", query = "SELECT d FROM DmTranActiveSnapshotDatabaseTransactions d WHERE d.isSnapshot = :isSnapshot"),
    @NamedQuery(name = "DmTranActiveSnapshotDatabaseTransactions.findByFirstSnapshotSequenceNum", query = "SELECT d FROM DmTranActiveSnapshotDatabaseTransactions d WHERE d.firstSnapshotSequenceNum = :firstSnapshotSequenceNum"),
    @NamedQuery(name = "DmTranActiveSnapshotDatabaseTransactions.findByMaxVersionChainTraversed", query = "SELECT d FROM DmTranActiveSnapshotDatabaseTransactions d WHERE d.maxVersionChainTraversed = :maxVersionChainTraversed"),
    @NamedQuery(name = "DmTranActiveSnapshotDatabaseTransactions.findByAverageVersionChainTraversed", query = "SELECT d FROM DmTranActiveSnapshotDatabaseTransactions d WHERE d.averageVersionChainTraversed = :averageVersionChainTraversed"),
    @NamedQuery(name = "DmTranActiveSnapshotDatabaseTransactions.findByElapsedTimeSeconds", query = "SELECT d FROM DmTranActiveSnapshotDatabaseTransactions d WHERE d.elapsedTimeSeconds = :elapsedTimeSeconds")})
public class DmTranActiveSnapshotDatabaseTransactions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "transaction_id")
    private BigInteger transactionId;
    @Column(name = "transaction_sequence_num")
    private BigInteger transactionSequenceNum;
    @Column(name = "commit_sequence_num")
    private BigInteger commitSequenceNum;
    @Column(name = "session_id")
    private Integer sessionId;
    @Column(name = "is_snapshot")
    private Boolean isSnapshot;
    @Column(name = "first_snapshot_sequence_num")
    private BigInteger firstSnapshotSequenceNum;
    @Column(name = "max_version_chain_traversed")
    private Integer maxVersionChainTraversed;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "average_version_chain_traversed")
    private Double averageVersionChainTraversed;
    @Column(name = "elapsed_time_seconds")
    private BigInteger elapsedTimeSeconds;

    public DmTranActiveSnapshotDatabaseTransactions() {
    }

    public BigInteger getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(BigInteger transactionId) {
        this.transactionId = transactionId;
    }

    public BigInteger getTransactionSequenceNum() {
        return transactionSequenceNum;
    }

    public void setTransactionSequenceNum(BigInteger transactionSequenceNum) {
        this.transactionSequenceNum = transactionSequenceNum;
    }

    public BigInteger getCommitSequenceNum() {
        return commitSequenceNum;
    }

    public void setCommitSequenceNum(BigInteger commitSequenceNum) {
        this.commitSequenceNum = commitSequenceNum;
    }

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public Boolean getIsSnapshot() {
        return isSnapshot;
    }

    public void setIsSnapshot(Boolean isSnapshot) {
        this.isSnapshot = isSnapshot;
    }

    public BigInteger getFirstSnapshotSequenceNum() {
        return firstSnapshotSequenceNum;
    }

    public void setFirstSnapshotSequenceNum(BigInteger firstSnapshotSequenceNum) {
        this.firstSnapshotSequenceNum = firstSnapshotSequenceNum;
    }

    public Integer getMaxVersionChainTraversed() {
        return maxVersionChainTraversed;
    }

    public void setMaxVersionChainTraversed(Integer maxVersionChainTraversed) {
        this.maxVersionChainTraversed = maxVersionChainTraversed;
    }

    public Double getAverageVersionChainTraversed() {
        return averageVersionChainTraversed;
    }

    public void setAverageVersionChainTraversed(Double averageVersionChainTraversed) {
        this.averageVersionChainTraversed = averageVersionChainTraversed;
    }

    public BigInteger getElapsedTimeSeconds() {
        return elapsedTimeSeconds;
    }

    public void setElapsedTimeSeconds(BigInteger elapsedTimeSeconds) {
        this.elapsedTimeSeconds = elapsedTimeSeconds;
    }
    
}
