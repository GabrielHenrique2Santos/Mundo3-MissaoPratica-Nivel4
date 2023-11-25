/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
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
@Table(name = "dm_tran_version_store")
@NamedQueries({
    @NamedQuery(name = "DmTranVersionStore.findAll", query = "SELECT d FROM DmTranVersionStore d"),
    @NamedQuery(name = "DmTranVersionStore.findByTransactionSequenceNum", query = "SELECT d FROM DmTranVersionStore d WHERE d.transactionSequenceNum = :transactionSequenceNum"),
    @NamedQuery(name = "DmTranVersionStore.findByVersionSequenceNum", query = "SELECT d FROM DmTranVersionStore d WHERE d.versionSequenceNum = :versionSequenceNum"),
    @NamedQuery(name = "DmTranVersionStore.findByDatabaseId", query = "SELECT d FROM DmTranVersionStore d WHERE d.databaseId = :databaseId"),
    @NamedQuery(name = "DmTranVersionStore.findByRowsetId", query = "SELECT d FROM DmTranVersionStore d WHERE d.rowsetId = :rowsetId"),
    @NamedQuery(name = "DmTranVersionStore.findByStatus", query = "SELECT d FROM DmTranVersionStore d WHERE d.status = :status"),
    @NamedQuery(name = "DmTranVersionStore.findByMinLengthInBytes", query = "SELECT d FROM DmTranVersionStore d WHERE d.minLengthInBytes = :minLengthInBytes"),
    @NamedQuery(name = "DmTranVersionStore.findByRecordLengthFirstPartInBytes", query = "SELECT d FROM DmTranVersionStore d WHERE d.recordLengthFirstPartInBytes = :recordLengthFirstPartInBytes"),
    @NamedQuery(name = "DmTranVersionStore.findByRecordLengthSecondPartInBytes", query = "SELECT d FROM DmTranVersionStore d WHERE d.recordLengthSecondPartInBytes = :recordLengthSecondPartInBytes")})
public class DmTranVersionStore implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "transaction_sequence_num")
    private BigInteger transactionSequenceNum;
    @Column(name = "version_sequence_num")
    private BigInteger versionSequenceNum;
    @Column(name = "database_id")
    private Short databaseId;
    @Column(name = "rowset_id")
    private BigInteger rowsetId;
    @Column(name = "status")
    private Short status;
    @Column(name = "min_length_in_bytes")
    private Short minLengthInBytes;
    @Column(name = "record_length_first_part_in_bytes")
    private Short recordLengthFirstPartInBytes;
    @Lob
    @Column(name = "record_image_first_part")
    private byte[] recordImageFirstPart;
    @Column(name = "record_length_second_part_in_bytes")
    private Short recordLengthSecondPartInBytes;
    @Lob
    @Column(name = "record_image_second_part")
    private byte[] recordImageSecondPart;

    public DmTranVersionStore() {
    }

    public BigInteger getTransactionSequenceNum() {
        return transactionSequenceNum;
    }

    public void setTransactionSequenceNum(BigInteger transactionSequenceNum) {
        this.transactionSequenceNum = transactionSequenceNum;
    }

    public BigInteger getVersionSequenceNum() {
        return versionSequenceNum;
    }

    public void setVersionSequenceNum(BigInteger versionSequenceNum) {
        this.versionSequenceNum = versionSequenceNum;
    }

    public Short getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(Short databaseId) {
        this.databaseId = databaseId;
    }

    public BigInteger getRowsetId() {
        return rowsetId;
    }

    public void setRowsetId(BigInteger rowsetId) {
        this.rowsetId = rowsetId;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getMinLengthInBytes() {
        return minLengthInBytes;
    }

    public void setMinLengthInBytes(Short minLengthInBytes) {
        this.minLengthInBytes = minLengthInBytes;
    }

    public Short getRecordLengthFirstPartInBytes() {
        return recordLengthFirstPartInBytes;
    }

    public void setRecordLengthFirstPartInBytes(Short recordLengthFirstPartInBytes) {
        this.recordLengthFirstPartInBytes = recordLengthFirstPartInBytes;
    }

    public byte[] getRecordImageFirstPart() {
        return recordImageFirstPart;
    }

    public void setRecordImageFirstPart(byte[] recordImageFirstPart) {
        this.recordImageFirstPart = recordImageFirstPart;
    }

    public Short getRecordLengthSecondPartInBytes() {
        return recordLengthSecondPartInBytes;
    }

    public void setRecordLengthSecondPartInBytes(Short recordLengthSecondPartInBytes) {
        this.recordLengthSecondPartInBytes = recordLengthSecondPartInBytes;
    }

    public byte[] getRecordImageSecondPart() {
        return recordImageSecondPart;
    }

    public void setRecordImageSecondPart(byte[] recordImageSecondPart) {
        this.recordImageSecondPart = recordImageSecondPart;
    }
    
}
