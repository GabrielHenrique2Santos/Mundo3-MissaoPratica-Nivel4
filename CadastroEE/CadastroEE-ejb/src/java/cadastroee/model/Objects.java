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
@Table(name = "objects")
@NamedQueries({
    @NamedQuery(name = "Objects.findAll", query = "SELECT o FROM Objects o"),
    @NamedQuery(name = "Objects.findByName", query = "SELECT o FROM Objects o WHERE o.name = :name"),
    @NamedQuery(name = "Objects.findByObjectId", query = "SELECT o FROM Objects o WHERE o.objectId = :objectId"),
    @NamedQuery(name = "Objects.findByPrincipalId", query = "SELECT o FROM Objects o WHERE o.principalId = :principalId"),
    @NamedQuery(name = "Objects.findBySchemaId", query = "SELECT o FROM Objects o WHERE o.schemaId = :schemaId"),
    @NamedQuery(name = "Objects.findByParentObjectId", query = "SELECT o FROM Objects o WHERE o.parentObjectId = :parentObjectId"),
    @NamedQuery(name = "Objects.findByType", query = "SELECT o FROM Objects o WHERE o.type = :type"),
    @NamedQuery(name = "Objects.findByTypeDesc", query = "SELECT o FROM Objects o WHERE o.typeDesc = :typeDesc"),
    @NamedQuery(name = "Objects.findByCreateDate", query = "SELECT o FROM Objects o WHERE o.createDate = :createDate"),
    @NamedQuery(name = "Objects.findByModifyDate", query = "SELECT o FROM Objects o WHERE o.modifyDate = :modifyDate"),
    @NamedQuery(name = "Objects.findByIsMsShipped", query = "SELECT o FROM Objects o WHERE o.isMsShipped = :isMsShipped"),
    @NamedQuery(name = "Objects.findByIsPublished", query = "SELECT o FROM Objects o WHERE o.isPublished = :isPublished"),
    @NamedQuery(name = "Objects.findByIsSchemaPublished", query = "SELECT o FROM Objects o WHERE o.isSchemaPublished = :isSchemaPublished")})
public class Objects implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Column(name = "principal_id")
    private Integer principalId;
    @Basic(optional = false)
    @Column(name = "schema_id")
    private int schemaId;
    @Basic(optional = false)
    @Column(name = "parent_object_id")
    private int parentObjectId;
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
    @Column(name = "is_published")
    private boolean isPublished;
    @Basic(optional = false)
    @Column(name = "is_schema_published")
    private boolean isSchemaPublished;

    public Objects() {
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

    public Integer getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(Integer principalId) {
        this.principalId = principalId;
    }

    public int getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(int schemaId) {
        this.schemaId = schemaId;
    }

    public int getParentObjectId() {
        return parentObjectId;
    }

    public void setParentObjectId(int parentObjectId) {
        this.parentObjectId = parentObjectId;
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

    public boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(boolean isPublished) {
        this.isPublished = isPublished;
    }

    public boolean getIsSchemaPublished() {
        return isSchemaPublished;
    }

    public void setIsSchemaPublished(boolean isSchemaPublished) {
        this.isSchemaPublished = isSchemaPublished;
    }
    
}
