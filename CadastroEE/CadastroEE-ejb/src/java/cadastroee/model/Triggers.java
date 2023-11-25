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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "triggers")
@NamedQueries({
    @NamedQuery(name = "Triggers.findAll", query = "SELECT t FROM Triggers t"),
    @NamedQuery(name = "Triggers.findByName", query = "SELECT t FROM Triggers t WHERE t.name = :name"),
    @NamedQuery(name = "Triggers.findByObjectId", query = "SELECT t FROM Triggers t WHERE t.objectId = :objectId"),
    @NamedQuery(name = "Triggers.findByParentClass", query = "SELECT t FROM Triggers t WHERE t.parentClass = :parentClass"),
    @NamedQuery(name = "Triggers.findByParentClassDesc", query = "SELECT t FROM Triggers t WHERE t.parentClassDesc = :parentClassDesc"),
    @NamedQuery(name = "Triggers.findByParentId", query = "SELECT t FROM Triggers t WHERE t.parentId = :parentId"),
    @NamedQuery(name = "Triggers.findByType", query = "SELECT t FROM Triggers t WHERE t.type = :type"),
    @NamedQuery(name = "Triggers.findByTypeDesc", query = "SELECT t FROM Triggers t WHERE t.typeDesc = :typeDesc"),
    @NamedQuery(name = "Triggers.findByCreateDate", query = "SELECT t FROM Triggers t WHERE t.createDate = :createDate"),
    @NamedQuery(name = "Triggers.findByModifyDate", query = "SELECT t FROM Triggers t WHERE t.modifyDate = :modifyDate"),
    @NamedQuery(name = "Triggers.findByIsMsShipped", query = "SELECT t FROM Triggers t WHERE t.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "Triggers.findByIsDisabled", query = "SELECT t FROM Triggers t WHERE t.isDisabled = :isDisabled"),
    @NamedQuery(name = "Triggers.findByIsNotForReplication", query = "SELECT t FROM Triggers t WHERE t.isNotForReplication = :isNotForReplication"),
    @NamedQuery(name = "Triggers.findByIsInsteadOfTrigger", query = "SELECT t FROM Triggers t WHERE t.isInsteadOfTrigger = :isInsteadOfTrigger")})
public class Triggers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @Column(name = "parent_class")
    private short parentClass;
    @Column(name = "parent_class_desc")
    private String parentClassDesc;
    @Basic(optional = false)
    @Column(name = "parent_id")
    private int parentId;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Column(name = "type_desc")
    private String typeDesc;
    @Basic(optional = false)
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;
    @Basic(optional = false)
    @Column(name = "is_ms_shipped")
    private boolean isMsShipped;
    @Basic(optional = false)
    @Column(name = "is_disabled")
    private boolean isDisabled;
    @Basic(optional = false)
    @Column(name = "is_not_for_replication")
    private boolean isNotForReplication;
    @Basic(optional = false)
    @Column(name = "is_instead_of_trigger")
    private boolean isInsteadOfTrigger;

    public Triggers() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public short getParentClass() {
        return parentClass;
    }

    public void setParentClass(short parentClass) {
        this.parentClass = parentClass;
    }

    public String getParentClassDesc() {
        return parentClassDesc;
    }

    public void setParentClassDesc(String parentClassDesc) {
        this.parentClassDesc = parentClassDesc;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public boolean getIsMsShipped() {
        return isMsShipped;
    }

    public void setIsMsShipped(boolean isMsShipped) {
        this.isMsShipped = isMsShipped;
    }

    public boolean getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public boolean getIsNotForReplication() {
        return isNotForReplication;
    }

    public void setIsNotForReplication(boolean isNotForReplication) {
        this.isNotForReplication = isNotForReplication;
    }

    public boolean getIsInsteadOfTrigger() {
        return isInsteadOfTrigger;
    }

    public void setIsInsteadOfTrigger(boolean isInsteadOfTrigger) {
        this.isInsteadOfTrigger = isInsteadOfTrigger;
    }
    
}
