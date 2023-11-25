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
import java.io.Serializable;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "column_encryption_key_values")
@NamedQueries({
    @NamedQuery(name = "ColumnEncryptionKeyValues.findAll", query = "SELECT c FROM ColumnEncryptionKeyValues c"),
    @NamedQuery(name = "ColumnEncryptionKeyValues.findByColumnEncryptionKeyId", query = "SELECT c FROM ColumnEncryptionKeyValues c WHERE c.columnEncryptionKeyId = :columnEncryptionKeyId"),
    @NamedQuery(name = "ColumnEncryptionKeyValues.findByColumnMasterKeyId", query = "SELECT c FROM ColumnEncryptionKeyValues c WHERE c.columnMasterKeyId = :columnMasterKeyId"),
    @NamedQuery(name = "ColumnEncryptionKeyValues.findByEncryptionAlgorithmName", query = "SELECT c FROM ColumnEncryptionKeyValues c WHERE c.encryptionAlgorithmName = :encryptionAlgorithmName")})
public class ColumnEncryptionKeyValues implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "column_encryption_key_id")
    private int columnEncryptionKeyId;
    @Basic(optional = false)
    @Column(name = "column_master_key_id")
    private int columnMasterKeyId;
    @Lob
    @Column(name = "encrypted_value")
    private byte[] encryptedValue;
    @Column(name = "encryption_algorithm_name")
    private String encryptionAlgorithmName;

    public ColumnEncryptionKeyValues() {
    }

    public int getColumnEncryptionKeyId() {
        return columnEncryptionKeyId;
    }

    public void setColumnEncryptionKeyId(int columnEncryptionKeyId) {
        this.columnEncryptionKeyId = columnEncryptionKeyId;
    }

    public int getColumnMasterKeyId() {
        return columnMasterKeyId;
    }

    public void setColumnMasterKeyId(int columnMasterKeyId) {
        this.columnMasterKeyId = columnMasterKeyId;
    }

    public byte[] getEncryptedValue() {
        return encryptedValue;
    }

    public void setEncryptedValue(byte[] encryptedValue) {
        this.encryptedValue = encryptedValue;
    }

    public String getEncryptionAlgorithmName() {
        return encryptionAlgorithmName;
    }

    public void setEncryptionAlgorithmName(String encryptionAlgorithmName) {
        this.encryptionAlgorithmName = encryptionAlgorithmName;
    }
    
}
