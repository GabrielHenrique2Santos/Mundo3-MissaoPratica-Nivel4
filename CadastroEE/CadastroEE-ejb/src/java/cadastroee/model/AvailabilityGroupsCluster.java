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
@Table(name = "availability_groups_cluster")
@NamedQueries({
    @NamedQuery(name = "AvailabilityGroupsCluster.findAll", query = "SELECT a FROM AvailabilityGroupsCluster a"),
    @NamedQuery(name = "AvailabilityGroupsCluster.findByGroupId", query = "SELECT a FROM AvailabilityGroupsCluster a WHERE a.groupId = :groupId"),
    @NamedQuery(name = "AvailabilityGroupsCluster.findByName", query = "SELECT a FROM AvailabilityGroupsCluster a WHERE a.name = :name"),
    @NamedQuery(name = "AvailabilityGroupsCluster.findByResourceId", query = "SELECT a FROM AvailabilityGroupsCluster a WHERE a.resourceId = :resourceId"),
    @NamedQuery(name = "AvailabilityGroupsCluster.findByResourceGroupId", query = "SELECT a FROM AvailabilityGroupsCluster a WHERE a.resourceGroupId = :resourceGroupId"),
    @NamedQuery(name = "AvailabilityGroupsCluster.findByFailureConditionLevel", query = "SELECT a FROM AvailabilityGroupsCluster a WHERE a.failureConditionLevel = :failureConditionLevel"),
    @NamedQuery(name = "AvailabilityGroupsCluster.findByHealthCheckTimeout", query = "SELECT a FROM AvailabilityGroupsCluster a WHERE a.healthCheckTimeout = :healthCheckTimeout"),
    @NamedQuery(name = "AvailabilityGroupsCluster.findByAutomatedBackupPreference", query = "SELECT a FROM AvailabilityGroupsCluster a WHERE a.automatedBackupPreference = :automatedBackupPreference"),
    @NamedQuery(name = "AvailabilityGroupsCluster.findByAutomatedBackupPreferenceDesc", query = "SELECT a FROM AvailabilityGroupsCluster a WHERE a.automatedBackupPreferenceDesc = :automatedBackupPreferenceDesc")})
public class AvailabilityGroupsCluster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "group_id")
    private String groupId;
    @Column(name = "name")
    private String name;
    @Column(name = "resource_id")
    private String resourceId;
    @Column(name = "resource_group_id")
    private String resourceGroupId;
    @Column(name = "failure_condition_level")
    private Integer failureConditionLevel;
    @Column(name = "health_check_timeout")
    private Integer healthCheckTimeout;
    @Column(name = "automated_backup_preference")
    private Short automatedBackupPreference;
    @Column(name = "automated_backup_preference_desc")
    private String automatedBackupPreferenceDesc;

    public AvailabilityGroupsCluster() {
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public Integer getFailureConditionLevel() {
        return failureConditionLevel;
    }

    public void setFailureConditionLevel(Integer failureConditionLevel) {
        this.failureConditionLevel = failureConditionLevel;
    }

    public Integer getHealthCheckTimeout() {
        return healthCheckTimeout;
    }

    public void setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
    }

    public Short getAutomatedBackupPreference() {
        return automatedBackupPreference;
    }

    public void setAutomatedBackupPreference(Short automatedBackupPreference) {
        this.automatedBackupPreference = automatedBackupPreference;
    }

    public String getAutomatedBackupPreferenceDesc() {
        return automatedBackupPreferenceDesc;
    }

    public void setAutomatedBackupPreferenceDesc(String automatedBackupPreferenceDesc) {
        this.automatedBackupPreferenceDesc = automatedBackupPreferenceDesc;
    }
    
}
