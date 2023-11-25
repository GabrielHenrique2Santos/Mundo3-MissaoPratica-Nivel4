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
@Table(name = "dm_os_loaded_modules")
@NamedQueries({
    @NamedQuery(name = "DmOsLoadedModules.findAll", query = "SELECT d FROM DmOsLoadedModules d"),
    @NamedQuery(name = "DmOsLoadedModules.findByFileVersion", query = "SELECT d FROM DmOsLoadedModules d WHERE d.fileVersion = :fileVersion"),
    @NamedQuery(name = "DmOsLoadedModules.findByProductVersion", query = "SELECT d FROM DmOsLoadedModules d WHERE d.productVersion = :productVersion"),
    @NamedQuery(name = "DmOsLoadedModules.findByDebug", query = "SELECT d FROM DmOsLoadedModules d WHERE d.debug = :debug"),
    @NamedQuery(name = "DmOsLoadedModules.findByPatched", query = "SELECT d FROM DmOsLoadedModules d WHERE d.patched = :patched"),
    @NamedQuery(name = "DmOsLoadedModules.findByPrerelease", query = "SELECT d FROM DmOsLoadedModules d WHERE d.prerelease = :prerelease"),
    @NamedQuery(name = "DmOsLoadedModules.findByPrivateBuild", query = "SELECT d FROM DmOsLoadedModules d WHERE d.privateBuild = :privateBuild"),
    @NamedQuery(name = "DmOsLoadedModules.findBySpecialBuild", query = "SELECT d FROM DmOsLoadedModules d WHERE d.specialBuild = :specialBuild"),
    @NamedQuery(name = "DmOsLoadedModules.findByLanguage", query = "SELECT d FROM DmOsLoadedModules d WHERE d.language = :language"),
    @NamedQuery(name = "DmOsLoadedModules.findByCompany", query = "SELECT d FROM DmOsLoadedModules d WHERE d.company = :company"),
    @NamedQuery(name = "DmOsLoadedModules.findByDescription", query = "SELECT d FROM DmOsLoadedModules d WHERE d.description = :description"),
    @NamedQuery(name = "DmOsLoadedModules.findByName", query = "SELECT d FROM DmOsLoadedModules d WHERE d.name = :name"),
    @NamedQuery(name = "DmOsLoadedModules.findByTarget", query = "SELECT d FROM DmOsLoadedModules d WHERE d.target = :target")})
public class DmOsLoadedModules implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Lob
    @Column(name = "base_address")
    private byte[] baseAddress;
    @Column(name = "file_version")
    private String fileVersion;
    @Column(name = "product_version")
    private String productVersion;
    @Column(name = "debug")
    private Boolean debug;
    @Column(name = "patched")
    private Boolean patched;
    @Column(name = "prerelease")
    private Boolean prerelease;
    @Column(name = "private_build")
    private Boolean privateBuild;
    @Column(name = "special_build")
    private Boolean specialBuild;
    @Column(name = "language")
    private Integer language;
    @Column(name = "company")
    private String company;
    @Column(name = "description")
    private String description;
    @Column(name = "name")
    private String name;
    @Column(name = "target")
    private String target;

    public DmOsLoadedModules() {
    }

    public byte[] getBaseAddress() {
        return baseAddress;
    }

    public void setBaseAddress(byte[] baseAddress) {
        this.baseAddress = baseAddress;
    }

    public String getFileVersion() {
        return fileVersion;
    }

    public void setFileVersion(String fileVersion) {
        this.fileVersion = fileVersion;
    }

    public String getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion;
    }

    public Boolean getDebug() {
        return debug;
    }

    public void setDebug(Boolean debug) {
        this.debug = debug;
    }

    public Boolean getPatched() {
        return patched;
    }

    public void setPatched(Boolean patched) {
        this.patched = patched;
    }

    public Boolean getPrerelease() {
        return prerelease;
    }

    public void setPrerelease(Boolean prerelease) {
        this.prerelease = prerelease;
    }

    public Boolean getPrivateBuild() {
        return privateBuild;
    }

    public void setPrivateBuild(Boolean privateBuild) {
        this.privateBuild = privateBuild;
    }

    public Boolean getSpecialBuild() {
        return specialBuild;
    }

    public void setSpecialBuild(Boolean specialBuild) {
        this.specialBuild = specialBuild;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
    
}
