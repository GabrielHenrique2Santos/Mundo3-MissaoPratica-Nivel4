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
@Table(name = "server_audits")
@NamedQueries({
    @NamedQuery(name = "ServerAudits.findAll", query = "SELECT s FROM ServerAudits s"),
    @NamedQuery(name = "ServerAudits.findByAuditId", query = "SELECT s FROM ServerAudits s WHERE s.auditId = :auditId"),
    @NamedQuery(name = "ServerAudits.findByName", query = "SELECT s FROM ServerAudits s WHERE s.name = :name"),
    @NamedQuery(name = "ServerAudits.findByAuditGuid", query = "SELECT s FROM ServerAudits s WHERE s.auditGuid = :auditGuid"),
    @NamedQuery(name = "ServerAudits.findByCreateDate", query = "SELECT s FROM ServerAudits s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "ServerAudits.findByModifyDate", query = "SELECT s FROM ServerAudits s WHERE s.modifyDate = :modifyDate"),
    @NamedQuery(name = "ServerAudits.findByPrincipalId", query = "SELECT s FROM ServerAudits s WHERE s.principalId = :principalId"),
    @NamedQuery(name = "ServerAudits.findByType", query = "SELECT s FROM ServerAudits s WHERE s.type = :type"),
    @NamedQuery(name = "ServerAudits.findByTypeDesc", query = "SELECT s FROM ServerAudits s WHERE s.typeDesc = :typeDesc"),
    @NamedQuery(name = "ServerAudits.findByOnFailure", query = "SELECT s FROM ServerAudits s WHERE s.onFailure = :onFailure"),
    @NamedQuery(name = "ServerAudits.findByOnFailureDesc", query = "SELECT s FROM ServerAudits s WHERE s.onFailureDesc = :onFailureDesc"),
    @NamedQuery(name = "ServerAudits.findByIsStateEnabled", query = "SELECT s FROM ServerAudits s WHERE s.isStateEnabled = :isStateEnabled"),
    @NamedQuery(name = "ServerAudits.findByQueueDelay", query = "SELECT s FROM ServerAudits s WHERE s.queueDelay = :queueDelay"),
    @NamedQuery(name = "ServerAudits.findByPredicate", query = "SELECT s FROM ServerAudits s WHERE s.predicate = :predicate"),
    @NamedQuery(name = "ServerAudits.findByIsOperatorAudit", query = "SELECT s FROM ServerAudits s WHERE s.isOperatorAudit = :isOperatorAudit")})
public class ServerAudits implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "audit_id")
    private int auditId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "audit_guid")
    private String auditGuid;
    @Basic(optional = false)
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Basic(optional = false)
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;
    @Column(name = "principal_id")
    private Integer principalId;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Column(name = "type_desc")
    private String typeDesc;
    @Column(name = "on_failure")
    private Short onFailure;
    @Column(name = "on_failure_desc")
    private String onFailureDesc;
    @Column(name = "is_state_enabled")
    private Boolean isStateEnabled;
    @Column(name = "queue_delay")
    private Integer queueDelay;
    @Column(name = "predicate")
    private String predicate;
    @Column(name = "is_operator_audit")
    private Boolean isOperatorAudit;

    public ServerAudits() {
    }

    public int getAuditId() {
        return auditId;
    }

    public void setAuditId(int auditId) {
        this.auditId = auditId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuditGuid() {
        return auditGuid;
    }

    public void setAuditGuid(String auditGuid) {
        this.auditGuid = auditGuid;
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

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
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

    public Short getOnFailure() {
        return onFailure;
    }

    public void setOnFailure(Short onFailure) {
        this.onFailure = onFailure;
    }

    public String getOnFailureDesc() {
        return onFailureDesc;
    }

    public void setOnFailureDesc(String onFailureDesc) {
        this.onFailureDesc = onFailureDesc;
    }

    public Boolean getIsStateEnabled() {
        return isStateEnabled;
    }

    public void setIsStateEnabled(Boolean isStateEnabled) {
        this.isStateEnabled = isStateEnabled;
    }

    public Integer getQueueDelay() {
        return queueDelay;
    }

    public void setQueueDelay(Integer queueDelay) {
        this.queueDelay = queueDelay;
    }

    public String getPredicate() {
        return predicate;
    }

    public void setPredicate(String predicate) {
        this.predicate = predicate;
    }

    public Boolean getIsOperatorAudit() {
        return isOperatorAudit;
    }

    public void setIsOperatorAudit(Boolean isOperatorAudit) {
        this.isOperatorAudit = isOperatorAudit;
    }
    
}
