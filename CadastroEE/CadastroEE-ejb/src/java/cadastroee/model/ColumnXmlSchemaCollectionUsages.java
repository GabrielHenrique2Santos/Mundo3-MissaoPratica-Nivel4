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
@Table(name = "column_xml_schema_collection_usages")
@NamedQueries({
    @NamedQuery(name = "ColumnXmlSchemaCollectionUsages.findAll", query = "SELECT c FROM ColumnXmlSchemaCollectionUsages c"),
    @NamedQuery(name = "ColumnXmlSchemaCollectionUsages.findByObjectId", query = "SELECT c FROM ColumnXmlSchemaCollectionUsages c WHERE c.objectId = :objectId"),
    @NamedQuery(name = "ColumnXmlSchemaCollectionUsages.findByColumnId", query = "SELECT c FROM ColumnXmlSchemaCollectionUsages c WHERE c.columnId = :columnId"),
    @NamedQuery(name = "ColumnXmlSchemaCollectionUsages.findByXmlCollectionId", query = "SELECT c FROM ColumnXmlSchemaCollectionUsages c WHERE c.xmlCollectionId = :xmlCollectionId")})
public class ColumnXmlSchemaCollectionUsages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "object_id")
    private int objectId;
    @Basic(optional = false)
    @Column(name = "column_id")
    private int columnId;
    @Basic(optional = false)
    @Column(name = "xml_collection_id")
    private int xmlCollectionId;

    public ColumnXmlSchemaCollectionUsages() {
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
    }

    public int getXmlCollectionId() {
        return xmlCollectionId;
    }

    public void setXmlCollectionId(int xmlCollectionId) {
        this.xmlCollectionId = xmlCollectionId;
    }
    
}
