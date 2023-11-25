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
import java.math.BigInteger;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "syslockinfo")
@NamedQueries({
    @NamedQuery(name = "Syslockinfo.findAll", query = "SELECT s FROM Syslockinfo s"),
    @NamedQuery(name = "Syslockinfo.findByRscText", query = "SELECT s FROM Syslockinfo s WHERE s.rscText = :rscText"),
    @NamedQuery(name = "Syslockinfo.findByRscDbid", query = "SELECT s FROM Syslockinfo s WHERE s.rscDbid = :rscDbid"),
    @NamedQuery(name = "Syslockinfo.findByRscIndid", query = "SELECT s FROM Syslockinfo s WHERE s.rscIndid = :rscIndid"),
    @NamedQuery(name = "Syslockinfo.findByRscObjid", query = "SELECT s FROM Syslockinfo s WHERE s.rscObjid = :rscObjid"),
    @NamedQuery(name = "Syslockinfo.findByRscType", query = "SELECT s FROM Syslockinfo s WHERE s.rscType = :rscType"),
    @NamedQuery(name = "Syslockinfo.findByRscFlag", query = "SELECT s FROM Syslockinfo s WHERE s.rscFlag = :rscFlag"),
    @NamedQuery(name = "Syslockinfo.findByReqMode", query = "SELECT s FROM Syslockinfo s WHERE s.reqMode = :reqMode"),
    @NamedQuery(name = "Syslockinfo.findByReqStatus", query = "SELECT s FROM Syslockinfo s WHERE s.reqStatus = :reqStatus"),
    @NamedQuery(name = "Syslockinfo.findByReqRefcnt", query = "SELECT s FROM Syslockinfo s WHERE s.reqRefcnt = :reqRefcnt"),
    @NamedQuery(name = "Syslockinfo.findByReqCryrefcnt", query = "SELECT s FROM Syslockinfo s WHERE s.reqCryrefcnt = :reqCryrefcnt"),
    @NamedQuery(name = "Syslockinfo.findByReqLifetime", query = "SELECT s FROM Syslockinfo s WHERE s.reqLifetime = :reqLifetime"),
    @NamedQuery(name = "Syslockinfo.findByReqSpid", query = "SELECT s FROM Syslockinfo s WHERE s.reqSpid = :reqSpid"),
    @NamedQuery(name = "Syslockinfo.findByReqEcid", query = "SELECT s FROM Syslockinfo s WHERE s.reqEcid = :reqEcid"),
    @NamedQuery(name = "Syslockinfo.findByReqOwnertype", query = "SELECT s FROM Syslockinfo s WHERE s.reqOwnertype = :reqOwnertype"),
    @NamedQuery(name = "Syslockinfo.findByReqtransactionID", query = "SELECT s FROM Syslockinfo s WHERE s.reqtransactionID = :reqtransactionID"),
    @NamedQuery(name = "Syslockinfo.findByReqtransactionUOW", query = "SELECT s FROM Syslockinfo s WHERE s.reqtransactionUOW = :reqtransactionUOW")})
public class Syslockinfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "rsc_text")
    private String rscText;
    @Basic(optional = false)
    @Lob
    @Column(name = "rsc_bin")
    private byte[] rscBin;
    @Basic(optional = false)
    @Lob
    @Column(name = "rsc_valblk")
    private byte[] rscValblk;
    @Basic(optional = false)
    @Column(name = "rsc_dbid")
    private short rscDbid;
    @Basic(optional = false)
    @Column(name = "rsc_indid")
    private short rscIndid;
    @Basic(optional = false)
    @Column(name = "rsc_objid")
    private int rscObjid;
    @Basic(optional = false)
    @Column(name = "rsc_type")
    private short rscType;
    @Basic(optional = false)
    @Column(name = "rsc_flag")
    private short rscFlag;
    @Basic(optional = false)
    @Column(name = "req_mode")
    private short reqMode;
    @Basic(optional = false)
    @Column(name = "req_status")
    private short reqStatus;
    @Basic(optional = false)
    @Column(name = "req_refcnt")
    private short reqRefcnt;
    @Basic(optional = false)
    @Column(name = "req_cryrefcnt")
    private short reqCryrefcnt;
    @Basic(optional = false)
    @Column(name = "req_lifetime")
    private int reqLifetime;
    @Basic(optional = false)
    @Column(name = "req_spid")
    private int reqSpid;
    @Basic(optional = false)
    @Column(name = "req_ecid")
    private int reqEcid;
    @Basic(optional = false)
    @Column(name = "req_ownertype")
    private short reqOwnertype;
    @Column(name = "req_transactionID")
    private BigInteger reqtransactionID;
    @Column(name = "req_transactionUOW")
    private String reqtransactionUOW;

    public Syslockinfo() {
    }

    public String getRscText() {
        return rscText;
    }

    public void setRscText(String rscText) {
        this.rscText = rscText;
    }

    public byte[] getRscBin() {
        return rscBin;
    }

    public void setRscBin(byte[] rscBin) {
        this.rscBin = rscBin;
    }

    public byte[] getRscValblk() {
        return rscValblk;
    }

    public void setRscValblk(byte[] rscValblk) {
        this.rscValblk = rscValblk;
    }

    public short getRscDbid() {
        return rscDbid;
    }

    public void setRscDbid(short rscDbid) {
        this.rscDbid = rscDbid;
    }

    public short getRscIndid() {
        return rscIndid;
    }

    public void setRscIndid(short rscIndid) {
        this.rscIndid = rscIndid;
    }

    public int getRscObjid() {
        return rscObjid;
    }

    public void setRscObjid(int rscObjid) {
        this.rscObjid = rscObjid;
    }

    public short getRscType() {
        return rscType;
    }

    public void setRscType(short rscType) {
        this.rscType = rscType;
    }

    public short getRscFlag() {
        return rscFlag;
    }

    public void setRscFlag(short rscFlag) {
        this.rscFlag = rscFlag;
    }

    public short getReqMode() {
        return reqMode;
    }

    public void setReqMode(short reqMode) {
        this.reqMode = reqMode;
    }

    public short getReqStatus() {
        return reqStatus;
    }

    public void setReqStatus(short reqStatus) {
        this.reqStatus = reqStatus;
    }

    public short getReqRefcnt() {
        return reqRefcnt;
    }

    public void setReqRefcnt(short reqRefcnt) {
        this.reqRefcnt = reqRefcnt;
    }

    public short getReqCryrefcnt() {
        return reqCryrefcnt;
    }

    public void setReqCryrefcnt(short reqCryrefcnt) {
        this.reqCryrefcnt = reqCryrefcnt;
    }

    public int getReqLifetime() {
        return reqLifetime;
    }

    public void setReqLifetime(int reqLifetime) {
        this.reqLifetime = reqLifetime;
    }

    public int getReqSpid() {
        return reqSpid;
    }

    public void setReqSpid(int reqSpid) {
        this.reqSpid = reqSpid;
    }

    public int getReqEcid() {
        return reqEcid;
    }

    public void setReqEcid(int reqEcid) {
        this.reqEcid = reqEcid;
    }

    public short getReqOwnertype() {
        return reqOwnertype;
    }

    public void setReqOwnertype(short reqOwnertype) {
        this.reqOwnertype = reqOwnertype;
    }

    public BigInteger getReqtransactionID() {
        return reqtransactionID;
    }

    public void setReqtransactionID(BigInteger reqtransactionID) {
        this.reqtransactionID = reqtransactionID;
    }

    public String getReqtransactionUOW() {
        return reqtransactionUOW;
    }

    public void setReqtransactionUOW(String reqtransactionUOW) {
        this.reqtransactionUOW = reqtransactionUOW;
    }
    
}
