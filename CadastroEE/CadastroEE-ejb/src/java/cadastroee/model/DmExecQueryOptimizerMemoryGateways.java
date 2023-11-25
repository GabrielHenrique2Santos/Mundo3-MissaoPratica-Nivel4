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
@Table(name = "dm_exec_query_optimizer_memory_gateways")
@NamedQueries({
    @NamedQuery(name = "DmExecQueryOptimizerMemoryGateways.findAll", query = "SELECT d FROM DmExecQueryOptimizerMemoryGateways d"),
    @NamedQuery(name = "DmExecQueryOptimizerMemoryGateways.findByPoolId", query = "SELECT d FROM DmExecQueryOptimizerMemoryGateways d WHERE d.poolId = :poolId"),
    @NamedQuery(name = "DmExecQueryOptimizerMemoryGateways.findByName", query = "SELECT d FROM DmExecQueryOptimizerMemoryGateways d WHERE d.name = :name"),
    @NamedQuery(name = "DmExecQueryOptimizerMemoryGateways.findByMaxCount", query = "SELECT d FROM DmExecQueryOptimizerMemoryGateways d WHERE d.maxCount = :maxCount"),
    @NamedQuery(name = "DmExecQueryOptimizerMemoryGateways.findByActiveCount", query = "SELECT d FROM DmExecQueryOptimizerMemoryGateways d WHERE d.activeCount = :activeCount"),
    @NamedQuery(name = "DmExecQueryOptimizerMemoryGateways.findByWaiterCount", query = "SELECT d FROM DmExecQueryOptimizerMemoryGateways d WHERE d.waiterCount = :waiterCount"),
    @NamedQuery(name = "DmExecQueryOptimizerMemoryGateways.findByThresholdFactor", query = "SELECT d FROM DmExecQueryOptimizerMemoryGateways d WHERE d.thresholdFactor = :thresholdFactor"),
    @NamedQuery(name = "DmExecQueryOptimizerMemoryGateways.findByThreshold", query = "SELECT d FROM DmExecQueryOptimizerMemoryGateways d WHERE d.threshold = :threshold"),
    @NamedQuery(name = "DmExecQueryOptimizerMemoryGateways.findByIsActive", query = "SELECT d FROM DmExecQueryOptimizerMemoryGateways d WHERE d.isActive = :isActive")})
public class DmExecQueryOptimizerMemoryGateways implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "pool_id")
    private int poolId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "max_count")
    private int maxCount;
    @Basic(optional = false)
    @Column(name = "active_count")
    private int activeCount;
    @Basic(optional = false)
    @Column(name = "waiter_count")
    private int waiterCount;
    @Basic(optional = false)
    @Column(name = "threshold_factor")
    private long thresholdFactor;
    @Basic(optional = false)
    @Column(name = "threshold")
    private long threshold;
    @Basic(optional = false)
    @Column(name = "is_active")
    private boolean isActive;

    public DmExecQueryOptimizerMemoryGateways() {
    }

    public int getPoolId() {
        return poolId;
    }

    public void setPoolId(int poolId) {
        this.poolId = poolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public int getActiveCount() {
        return activeCount;
    }

    public void setActiveCount(int activeCount) {
        this.activeCount = activeCount;
    }

    public int getWaiterCount() {
        return waiterCount;
    }

    public void setWaiterCount(int waiterCount) {
        this.waiterCount = waiterCount;
    }

    public long getThresholdFactor() {
        return thresholdFactor;
    }

    public void setThresholdFactor(long thresholdFactor) {
        this.thresholdFactor = thresholdFactor;
    }

    public long getThreshold() {
        return threshold;
    }

    public void setThreshold(long threshold) {
        this.threshold = threshold;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
}
