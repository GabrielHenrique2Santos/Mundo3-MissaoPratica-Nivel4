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
@Table(name = "systypes")
@NamedQueries({
    @NamedQuery(name = "Systypes.findAll", query = "SELECT s FROM Systypes s"),
    @NamedQuery(name = "Systypes.findByName", query = "SELECT s FROM Systypes s WHERE s.name = :name"),
    @NamedQuery(name = "Systypes.findByXtype", query = "SELECT s FROM Systypes s WHERE s.xtype = :xtype"),
    @NamedQuery(name = "Systypes.findByStatus", query = "SELECT s FROM Systypes s WHERE s.status = :status"),
    @NamedQuery(name = "Systypes.findByXusertype", query = "SELECT s FROM Systypes s WHERE s.xusertype = :xusertype"),
    @NamedQuery(name = "Systypes.findByLength", query = "SELECT s FROM Systypes s WHERE s.length = :length"),
    @NamedQuery(name = "Systypes.findByXprec", query = "SELECT s FROM Systypes s WHERE s.xprec = :xprec"),
    @NamedQuery(name = "Systypes.findByXscale", query = "SELECT s FROM Systypes s WHERE s.xscale = :xscale"),
    @NamedQuery(name = "Systypes.findByTdefault", query = "SELECT s FROM Systypes s WHERE s.tdefault = :tdefault"),
    @NamedQuery(name = "Systypes.findByDomain", query = "SELECT s FROM Systypes s WHERE s.domain = :domain"),
    @NamedQuery(name = "Systypes.findByUid", query = "SELECT s FROM Systypes s WHERE s.uid = :uid"),
    @NamedQuery(name = "Systypes.findByReserved", query = "SELECT s FROM Systypes s WHERE s.reserved = :reserved"),
    @NamedQuery(name = "Systypes.findByCollationid", query = "SELECT s FROM Systypes s WHERE s.collationid = :collationid"),
    @NamedQuery(name = "Systypes.findByUsertype", query = "SELECT s FROM Systypes s WHERE s.usertype = :usertype"),
    @NamedQuery(name = "Systypes.findByVariable", query = "SELECT s FROM Systypes s WHERE s.variable = :variable"),
    @NamedQuery(name = "Systypes.findByAllownulls", query = "SELECT s FROM Systypes s WHERE s.allownulls = :allownulls"),
    @NamedQuery(name = "Systypes.findByType", query = "SELECT s FROM Systypes s WHERE s.type = :type"),
    @NamedQuery(name = "Systypes.findByPrintfmt", query = "SELECT s FROM Systypes s WHERE s.printfmt = :printfmt"),
    @NamedQuery(name = "Systypes.findByPrec", query = "SELECT s FROM Systypes s WHERE s.prec = :prec"),
    @NamedQuery(name = "Systypes.findByScale", query = "SELECT s FROM Systypes s WHERE s.scale = :scale"),
    @NamedQuery(name = "Systypes.findByCollation", query = "SELECT s FROM Systypes s WHERE s.collation = :collation")})
public class Systypes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "xtype")
    private short xtype;
    @Column(name = "status")
    private Short status;
    @Column(name = "xusertype")
    private Short xusertype;
    @Basic(optional = false)
    @Column(name = "length")
    private short length;
    @Basic(optional = false)
    @Column(name = "xprec")
    private short xprec;
    @Basic(optional = false)
    @Column(name = "xscale")
    private short xscale;
    @Basic(optional = false)
    @Column(name = "tdefault")
    private int tdefault;
    @Basic(optional = false)
    @Column(name = "domain")
    private int domain;
    @Column(name = "uid")
    private Short uid;
    @Column(name = "reserved")
    private Short reserved;
    @Column(name = "collationid")
    private Integer collationid;
    @Column(name = "usertype")
    private Short usertype;
    @Basic(optional = false)
    @Column(name = "variable")
    private boolean variable;
    @Column(name = "allownulls")
    private Boolean allownulls;
    @Basic(optional = false)
    @Column(name = "type")
    private short type;
    @Column(name = "printfmt")
    private String printfmt;
    @Column(name = "prec")
    private Short prec;
    @Column(name = "scale")
    private Short scale;
    @Column(name = "collation")
    private String collation;

    public Systypes() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getXtype() {
        return xtype;
    }

    public void setXtype(short xtype) {
        this.xtype = xtype;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getXusertype() {
        return xusertype;
    }

    public void setXusertype(Short xusertype) {
        this.xusertype = xusertype;
    }

    public short getLength() {
        return length;
    }

    public void setLength(short length) {
        this.length = length;
    }

    public short getXprec() {
        return xprec;
    }

    public void setXprec(short xprec) {
        this.xprec = xprec;
    }

    public short getXscale() {
        return xscale;
    }

    public void setXscale(short xscale) {
        this.xscale = xscale;
    }

    public int getTdefault() {
        return tdefault;
    }

    public void setTdefault(int tdefault) {
        this.tdefault = tdefault;
    }

    public int getDomain() {
        return domain;
    }

    public void setDomain(int domain) {
        this.domain = domain;
    }

    public Short getUid() {
        return uid;
    }

    public void setUid(Short uid) {
        this.uid = uid;
    }

    public Short getReserved() {
        return reserved;
    }

    public void setReserved(Short reserved) {
        this.reserved = reserved;
    }

    public Integer getCollationid() {
        return collationid;
    }

    public void setCollationid(Integer collationid) {
        this.collationid = collationid;
    }

    public Short getUsertype() {
        return usertype;
    }

    public void setUsertype(Short usertype) {
        this.usertype = usertype;
    }

    public boolean getVariable() {
        return variable;
    }

    public void setVariable(boolean variable) {
        this.variable = variable;
    }

    public Boolean getAllownulls() {
        return allownulls;
    }

    public void setAllownulls(Boolean allownulls) {
        this.allownulls = allownulls;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public String getPrintfmt() {
        return printfmt;
    }

    public void setPrintfmt(String printfmt) {
        this.printfmt = printfmt;
    }

    public Short getPrec() {
        return prec;
    }

    public void setPrec(Short prec) {
        this.prec = prec;
    }

    public Short getScale() {
        return scale;
    }

    public void setScale(Short scale) {
        this.scale = scale;
    }

    public String getCollation() {
        return collation;
    }

    public void setCollation(String collation) {
        this.collation = collation;
    }
    
}
