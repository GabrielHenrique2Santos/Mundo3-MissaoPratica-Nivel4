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
@Table(name = "linked_logins")
@NamedQueries({
    @NamedQuery(name = "LinkedLogins.findAll", query = "SELECT l FROM LinkedLogins l"),
    @NamedQuery(name = "LinkedLogins.findByServerId", query = "SELECT l FROM LinkedLogins l WHERE l.serverId = :serverId"),
    @NamedQuery(name = "LinkedLogins.findByLocalPrincipalId", query = "SELECT l FROM LinkedLogins l WHERE l.localPrincipalId = :localPrincipalId"),
    @NamedQuery(name = "LinkedLogins.findByUsesSelfCredential", query = "SELECT l FROM LinkedLogins l WHERE l.usesSelfCredential = :usesSelfCredential"),
    @NamedQuery(name = "LinkedLogins.findByRemoteName", query = "SELECT l FROM LinkedLogins l WHERE l.remoteName = :remoteName"),
    @NamedQuery(name = "LinkedLogins.findByModifyDate", query = "SELECT l FROM LinkedLogins l WHERE l.modifyDate = :modifyDate")})
public class LinkedLogins implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "server_id")
    private int serverId;
    @Column(name = "local_principal_id")
    private Integer localPrincipalId;
    @Basic(optional = false)
    @Column(name = "uses_self_credential")
    private boolean usesSelfCredential;
    @Column(name = "remote_name")
    private String remoteName;
    @Basic(optional = false)
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;

    public LinkedLogins() {
    }

    public int getServerId() {
        return serverId;
    }

    public void setServerId(int serverId) {
        this.serverId = serverId;
    }

    public Integer getLocalPrincipalId() {
        return localPrincipalId;
    }

    public void setLocalPrincipalId(Integer localPrincipalId) {
        this.localPrincipalId = localPrincipalId;
    }

    public boolean getUsesSelfCredential() {
        return usesSelfCredential;
    }

    public void setUsesSelfCredential(boolean usesSelfCredential) {
        this.usesSelfCredential = usesSelfCredential;
    }

    public String getRemoteName() {
        return remoteName;
    }

    public void setRemoteName(String remoteName) {
        this.remoteName = remoteName;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
    
}
