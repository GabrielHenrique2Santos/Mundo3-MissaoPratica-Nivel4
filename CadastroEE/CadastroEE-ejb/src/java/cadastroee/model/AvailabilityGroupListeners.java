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
@Table(name = "availability_group_listeners")
@NamedQueries({
    @NamedQuery(name = "AvailabilityGroupListeners.findAll", query = "SELECT a FROM AvailabilityGroupListeners a"),
    @NamedQuery(name = "AvailabilityGroupListeners.findByGroupId", query = "SELECT a FROM AvailabilityGroupListeners a WHERE a.groupId = :groupId"),
    @NamedQuery(name = "AvailabilityGroupListeners.findByListenerId", query = "SELECT a FROM AvailabilityGroupListeners a WHERE a.listenerId = :listenerId"),
    @NamedQuery(name = "AvailabilityGroupListeners.findByDnsName", query = "SELECT a FROM AvailabilityGroupListeners a WHERE a.dnsName = :dnsName"),
    @NamedQuery(name = "AvailabilityGroupListeners.findByPort", query = "SELECT a FROM AvailabilityGroupListeners a WHERE a.port = :port"),
    @NamedQuery(name = "AvailabilityGroupListeners.findByIsConformant", query = "SELECT a FROM AvailabilityGroupListeners a WHERE a.isConformant = :isConformant"),
    @NamedQuery(name = "AvailabilityGroupListeners.findByIpConfigurationStringFromCluster", query = "SELECT a FROM AvailabilityGroupListeners a WHERE a.ipConfigurationStringFromCluster = :ipConfigurationStringFromCluster"),
    @NamedQuery(name = "AvailabilityGroupListeners.findByIsDistributedNetworkName", query = "SELECT a FROM AvailabilityGroupListeners a WHERE a.isDistributedNetworkName = :isDistributedNetworkName")})
public class AvailabilityGroupListeners implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "group_id")
    private String groupId;
    @Column(name = "listener_id")
    private String listenerId;
    @Column(name = "dns_name")
    private String dnsName;
    @Column(name = "port")
    private Integer port;
    @Basic(optional = false)
    @Column(name = "is_conformant")
    private boolean isConformant;
    @Column(name = "ip_configuration_string_from_cluster")
    private String ipConfigurationStringFromCluster;
    @Basic(optional = false)
    @Column(name = "is_distributed_network_name")
    private boolean isDistributedNetworkName;

    public AvailabilityGroupListeners() {
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public String getDnsName() {
        return dnsName;
    }

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public boolean getIsConformant() {
        return isConformant;
    }

    public void setIsConformant(boolean isConformant) {
        this.isConformant = isConformant;
    }

    public String getIpConfigurationStringFromCluster() {
        return ipConfigurationStringFromCluster;
    }

    public void setIpConfigurationStringFromCluster(String ipConfigurationStringFromCluster) {
        this.ipConfigurationStringFromCluster = ipConfigurationStringFromCluster;
    }

    public boolean getIsDistributedNetworkName() {
        return isDistributedNetworkName;
    }

    public void setIsDistributedNetworkName(boolean isDistributedNetworkName) {
        this.isDistributedNetworkName = isDistributedNetworkName;
    }
    
}
