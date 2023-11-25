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
@Table(name = "xml_schema_elements")
@NamedQueries({
    @NamedQuery(name = "XmlSchemaElements.findAll", query = "SELECT x FROM XmlSchemaElements x"),
    @NamedQuery(name = "XmlSchemaElements.findByXmlComponentId", query = "SELECT x FROM XmlSchemaElements x WHERE x.xmlComponentId = :xmlComponentId"),
    @NamedQuery(name = "XmlSchemaElements.findByXmlCollectionId", query = "SELECT x FROM XmlSchemaElements x WHERE x.xmlCollectionId = :xmlCollectionId"),
    @NamedQuery(name = "XmlSchemaElements.findByXmlNamespaceId", query = "SELECT x FROM XmlSchemaElements x WHERE x.xmlNamespaceId = :xmlNamespaceId"),
    @NamedQuery(name = "XmlSchemaElements.findByIsQualified", query = "SELECT x FROM XmlSchemaElements x WHERE x.isQualified = :isQualified"),
    @NamedQuery(name = "XmlSchemaElements.findByName", query = "SELECT x FROM XmlSchemaElements x WHERE x.name = :name"),
    @NamedQuery(name = "XmlSchemaElements.findBySymbolSpace", query = "SELECT x FROM XmlSchemaElements x WHERE x.symbolSpace = :symbolSpace"),
    @NamedQuery(name = "XmlSchemaElements.findBySymbolSpaceDesc", query = "SELECT x FROM XmlSchemaElements x WHERE x.symbolSpaceDesc = :symbolSpaceDesc"),
    @NamedQuery(name = "XmlSchemaElements.findByKind", query = "SELECT x FROM XmlSchemaElements x WHERE x.kind = :kind"),
    @NamedQuery(name = "XmlSchemaElements.findByKindDesc", query = "SELECT x FROM XmlSchemaElements x WHERE x.kindDesc = :kindDesc"),
    @NamedQuery(name = "XmlSchemaElements.findByDerivation", query = "SELECT x FROM XmlSchemaElements x WHERE x.derivation = :derivation"),
    @NamedQuery(name = "XmlSchemaElements.findByDerivationDesc", query = "SELECT x FROM XmlSchemaElements x WHERE x.derivationDesc = :derivationDesc"),
    @NamedQuery(name = "XmlSchemaElements.findByBaseXmlComponentId", query = "SELECT x FROM XmlSchemaElements x WHERE x.baseXmlComponentId = :baseXmlComponentId"),
    @NamedQuery(name = "XmlSchemaElements.findByScopingXmlComponentId", query = "SELECT x FROM XmlSchemaElements x WHERE x.scopingXmlComponentId = :scopingXmlComponentId"),
    @NamedQuery(name = "XmlSchemaElements.findByIsDefaultFixed", query = "SELECT x FROM XmlSchemaElements x WHERE x.isDefaultFixed = :isDefaultFixed"),
    @NamedQuery(name = "XmlSchemaElements.findByIsAbstract", query = "SELECT x FROM XmlSchemaElements x WHERE x.isAbstract = :isAbstract"),
    @NamedQuery(name = "XmlSchemaElements.findByIsNillable", query = "SELECT x FROM XmlSchemaElements x WHERE x.isNillable = :isNillable"),
    @NamedQuery(name = "XmlSchemaElements.findByMustBeQualified", query = "SELECT x FROM XmlSchemaElements x WHERE x.mustBeQualified = :mustBeQualified"),
    @NamedQuery(name = "XmlSchemaElements.findByIsExtensionBlocked", query = "SELECT x FROM XmlSchemaElements x WHERE x.isExtensionBlocked = :isExtensionBlocked"),
    @NamedQuery(name = "XmlSchemaElements.findByIsRestrictionBlocked", query = "SELECT x FROM XmlSchemaElements x WHERE x.isRestrictionBlocked = :isRestrictionBlocked"),
    @NamedQuery(name = "XmlSchemaElements.findByIsSubstitutionBlocked", query = "SELECT x FROM XmlSchemaElements x WHERE x.isSubstitutionBlocked = :isSubstitutionBlocked"),
    @NamedQuery(name = "XmlSchemaElements.findByIsFinalExtension", query = "SELECT x FROM XmlSchemaElements x WHERE x.isFinalExtension = :isFinalExtension"),
    @NamedQuery(name = "XmlSchemaElements.findByIsFinalRestriction", query = "SELECT x FROM XmlSchemaElements x WHERE x.isFinalRestriction = :isFinalRestriction"),
    @NamedQuery(name = "XmlSchemaElements.findByDefaultValue", query = "SELECT x FROM XmlSchemaElements x WHERE x.defaultValue = :defaultValue")})
public class XmlSchemaElements implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "xml_component_id")
    private int xmlComponentId;
    @Basic(optional = false)
    @Column(name = "xml_collection_id")
    private int xmlCollectionId;
    @Basic(optional = false)
    @Column(name = "xml_namespace_id")
    private int xmlNamespaceId;
    @Basic(optional = false)
    @Column(name = "is_qualified")
    private boolean isQualified;
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "symbol_space")
    private Character symbolSpace;
    @Column(name = "symbol_space_desc")
    private String symbolSpaceDesc;
    @Basic(optional = false)
    @Column(name = "kind")
    private Character kind;
    @Column(name = "kind_desc")
    private String kindDesc;
    @Basic(optional = false)
    @Column(name = "derivation")
    private Character derivation;
    @Column(name = "derivation_desc")
    private String derivationDesc;
    @Column(name = "base_xml_component_id")
    private Integer baseXmlComponentId;
    @Column(name = "scoping_xml_component_id")
    private Integer scopingXmlComponentId;
    @Basic(optional = false)
    @Column(name = "is_default_fixed")
    private boolean isDefaultFixed;
    @Basic(optional = false)
    @Column(name = "is_abstract")
    private boolean isAbstract;
    @Basic(optional = false)
    @Column(name = "is_nillable")
    private boolean isNillable;
    @Basic(optional = false)
    @Column(name = "must_be_qualified")
    private boolean mustBeQualified;
    @Basic(optional = false)
    @Column(name = "is_extension_blocked")
    private boolean isExtensionBlocked;
    @Basic(optional = false)
    @Column(name = "is_restriction_blocked")
    private boolean isRestrictionBlocked;
    @Basic(optional = false)
    @Column(name = "is_substitution_blocked")
    private boolean isSubstitutionBlocked;
    @Basic(optional = false)
    @Column(name = "is_final_extension")
    private boolean isFinalExtension;
    @Basic(optional = false)
    @Column(name = "is_final_restriction")
    private boolean isFinalRestriction;
    @Column(name = "default_value")
    private String defaultValue;

    public XmlSchemaElements() {
    }

    public int getXmlComponentId() {
        return xmlComponentId;
    }

    public void setXmlComponentId(int xmlComponentId) {
        this.xmlComponentId = xmlComponentId;
    }

    public int getXmlCollectionId() {
        return xmlCollectionId;
    }

    public void setXmlCollectionId(int xmlCollectionId) {
        this.xmlCollectionId = xmlCollectionId;
    }

    public int getXmlNamespaceId() {
        return xmlNamespaceId;
    }

    public void setXmlNamespaceId(int xmlNamespaceId) {
        this.xmlNamespaceId = xmlNamespaceId;
    }

    public boolean getIsQualified() {
        return isQualified;
    }

    public void setIsQualified(boolean isQualified) {
        this.isQualified = isQualified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getSymbolSpace() {
        return symbolSpace;
    }

    public void setSymbolSpace(Character symbolSpace) {
        this.symbolSpace = symbolSpace;
    }

    public String getSymbolSpaceDesc() {
        return symbolSpaceDesc;
    }

    public void setSymbolSpaceDesc(String symbolSpaceDesc) {
        this.symbolSpaceDesc = symbolSpaceDesc;
    }

    public Character getKind() {
        return kind;
    }

    public void setKind(Character kind) {
        this.kind = kind;
    }

    public String getKindDesc() {
        return kindDesc;
    }

    public void setKindDesc(String kindDesc) {
        this.kindDesc = kindDesc;
    }

    public Character getDerivation() {
        return derivation;
    }

    public void setDerivation(Character derivation) {
        this.derivation = derivation;
    }

    public String getDerivationDesc() {
        return derivationDesc;
    }

    public void setDerivationDesc(String derivationDesc) {
        this.derivationDesc = derivationDesc;
    }

    public Integer getBaseXmlComponentId() {
        return baseXmlComponentId;
    }

    public void setBaseXmlComponentId(Integer baseXmlComponentId) {
        this.baseXmlComponentId = baseXmlComponentId;
    }

    public Integer getScopingXmlComponentId() {
        return scopingXmlComponentId;
    }

    public void setScopingXmlComponentId(Integer scopingXmlComponentId) {
        this.scopingXmlComponentId = scopingXmlComponentId;
    }

    public boolean getIsDefaultFixed() {
        return isDefaultFixed;
    }

    public void setIsDefaultFixed(boolean isDefaultFixed) {
        this.isDefaultFixed = isDefaultFixed;
    }

    public boolean getIsAbstract() {
        return isAbstract;
    }

    public void setIsAbstract(boolean isAbstract) {
        this.isAbstract = isAbstract;
    }

    public boolean getIsNillable() {
        return isNillable;
    }

    public void setIsNillable(boolean isNillable) {
        this.isNillable = isNillable;
    }

    public boolean getMustBeQualified() {
        return mustBeQualified;
    }

    public void setMustBeQualified(boolean mustBeQualified) {
        this.mustBeQualified = mustBeQualified;
    }

    public boolean getIsExtensionBlocked() {
        return isExtensionBlocked;
    }

    public void setIsExtensionBlocked(boolean isExtensionBlocked) {
        this.isExtensionBlocked = isExtensionBlocked;
    }

    public boolean getIsRestrictionBlocked() {
        return isRestrictionBlocked;
    }

    public void setIsRestrictionBlocked(boolean isRestrictionBlocked) {
        this.isRestrictionBlocked = isRestrictionBlocked;
    }

    public boolean getIsSubstitutionBlocked() {
        return isSubstitutionBlocked;
    }

    public void setIsSubstitutionBlocked(boolean isSubstitutionBlocked) {
        this.isSubstitutionBlocked = isSubstitutionBlocked;
    }

    public boolean getIsFinalExtension() {
        return isFinalExtension;
    }

    public void setIsFinalExtension(boolean isFinalExtension) {
        this.isFinalExtension = isFinalExtension;
    }

    public boolean getIsFinalRestriction() {
        return isFinalRestriction;
    }

    public void setIsFinalRestriction(boolean isFinalRestriction) {
        this.isFinalRestriction = isFinalRestriction;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
    
}
