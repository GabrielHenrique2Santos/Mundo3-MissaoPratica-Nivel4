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
@Table(name = "sysdepends")
@NamedQueries({
    @NamedQuery(name = "Sysdepends.findAll", query = "SELECT s FROM Sysdepends s"),
    @NamedQuery(name = "Sysdepends.findById", query = "SELECT s FROM Sysdepends s WHERE s.id = :id"),
    @NamedQuery(name = "Sysdepends.findByDepid", query = "SELECT s FROM Sysdepends s WHERE s.depid = :depid"),
    @NamedQuery(name = "Sysdepends.findByNumber", query = "SELECT s FROM Sysdepends s WHERE s.number = :number"),
    @NamedQuery(name = "Sysdepends.findByDepnumber", query = "SELECT s FROM Sysdepends s WHERE s.depnumber = :depnumber"),
    @NamedQuery(name = "Sysdepends.findByStatus", query = "SELECT s FROM Sysdepends s WHERE s.status = :status"),
    @NamedQuery(name = "Sysdepends.findByDeptype", query = "SELECT s FROM Sysdepends s WHERE s.deptype = :deptype"),
    @NamedQuery(name = "Sysdepends.findByDepdbid", query = "SELECT s FROM Sysdepends s WHERE s.depdbid = :depdbid"),
    @NamedQuery(name = "Sysdepends.findByDepsiteid", query = "SELECT s FROM Sysdepends s WHERE s.depsiteid = :depsiteid"),
    @NamedQuery(name = "Sysdepends.findBySelall", query = "SELECT s FROM Sysdepends s WHERE s.selall = :selall"),
    @NamedQuery(name = "Sysdepends.findByResultobj", query = "SELECT s FROM Sysdepends s WHERE s.resultobj = :resultobj"),
    @NamedQuery(name = "Sysdepends.findByReadobj", query = "SELECT s FROM Sysdepends s WHERE s.readobj = :readobj")})
public class Sysdepends implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @Column(name = "depid")
    private int depid;
    @Column(name = "number")
    private Short number;
    @Column(name = "depnumber")
    private Short depnumber;
    @Column(name = "status")
    private Short status;
    @Basic(optional = false)
    @Column(name = "deptype")
    private short deptype;
    @Column(name = "depdbid")
    private Short depdbid;
    @Column(name = "depsiteid")
    private Short depsiteid;
    @Basic(optional = false)
    @Column(name = "selall")
    private boolean selall;
    @Basic(optional = false)
    @Column(name = "resultobj")
    private boolean resultobj;
    @Basic(optional = false)
    @Column(name = "readobj")
    private boolean readobj;

    public Sysdepends() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDepid() {
        return depid;
    }

    public void setDepid(int depid) {
        this.depid = depid;
    }

    public Short getNumber() {
        return number;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

    public Short getDepnumber() {
        return depnumber;
    }

    public void setDepnumber(Short depnumber) {
        this.depnumber = depnumber;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public short getDeptype() {
        return deptype;
    }

    public void setDeptype(short deptype) {
        this.deptype = deptype;
    }

    public Short getDepdbid() {
        return depdbid;
    }

    public void setDepdbid(Short depdbid) {
        this.depdbid = depdbid;
    }

    public Short getDepsiteid() {
        return depsiteid;
    }

    public void setDepsiteid(Short depsiteid) {
        this.depsiteid = depsiteid;
    }

    public boolean getSelall() {
        return selall;
    }

    public void setSelall(boolean selall) {
        this.selall = selall;
    }

    public boolean getResultobj() {
        return resultobj;
    }

    public void setResultobj(boolean resultobj) {
        this.resultobj = resultobj;
    }

    public boolean getReadobj() {
        return readobj;
    }

    public void setReadobj(boolean readobj) {
        this.readobj = readobj;
    }
    
}
