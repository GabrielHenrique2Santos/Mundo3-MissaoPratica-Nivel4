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
@Table(name = "sysreferences")
@NamedQueries({
    @NamedQuery(name = "Sysreferences.findAll", query = "SELECT s FROM Sysreferences s"),
    @NamedQuery(name = "Sysreferences.findByConstid", query = "SELECT s FROM Sysreferences s WHERE s.constid = :constid"),
    @NamedQuery(name = "Sysreferences.findByFkeyid", query = "SELECT s FROM Sysreferences s WHERE s.fkeyid = :fkeyid"),
    @NamedQuery(name = "Sysreferences.findByRkeyid", query = "SELECT s FROM Sysreferences s WHERE s.rkeyid = :rkeyid"),
    @NamedQuery(name = "Sysreferences.findByRkeyindid", query = "SELECT s FROM Sysreferences s WHERE s.rkeyindid = :rkeyindid"),
    @NamedQuery(name = "Sysreferences.findByKeycnt", query = "SELECT s FROM Sysreferences s WHERE s.keycnt = :keycnt"),
    @NamedQuery(name = "Sysreferences.findByFkeydbid", query = "SELECT s FROM Sysreferences s WHERE s.fkeydbid = :fkeydbid"),
    @NamedQuery(name = "Sysreferences.findByRkeydbid", query = "SELECT s FROM Sysreferences s WHERE s.rkeydbid = :rkeydbid"),
    @NamedQuery(name = "Sysreferences.findByFkey1", query = "SELECT s FROM Sysreferences s WHERE s.fkey1 = :fkey1"),
    @NamedQuery(name = "Sysreferences.findByFkey2", query = "SELECT s FROM Sysreferences s WHERE s.fkey2 = :fkey2"),
    @NamedQuery(name = "Sysreferences.findByFkey3", query = "SELECT s FROM Sysreferences s WHERE s.fkey3 = :fkey3"),
    @NamedQuery(name = "Sysreferences.findByFkey4", query = "SELECT s FROM Sysreferences s WHERE s.fkey4 = :fkey4"),
    @NamedQuery(name = "Sysreferences.findByFkey5", query = "SELECT s FROM Sysreferences s WHERE s.fkey5 = :fkey5"),
    @NamedQuery(name = "Sysreferences.findByFkey6", query = "SELECT s FROM Sysreferences s WHERE s.fkey6 = :fkey6"),
    @NamedQuery(name = "Sysreferences.findByFkey7", query = "SELECT s FROM Sysreferences s WHERE s.fkey7 = :fkey7"),
    @NamedQuery(name = "Sysreferences.findByFkey8", query = "SELECT s FROM Sysreferences s WHERE s.fkey8 = :fkey8"),
    @NamedQuery(name = "Sysreferences.findByFkey9", query = "SELECT s FROM Sysreferences s WHERE s.fkey9 = :fkey9"),
    @NamedQuery(name = "Sysreferences.findByFkey10", query = "SELECT s FROM Sysreferences s WHERE s.fkey10 = :fkey10"),
    @NamedQuery(name = "Sysreferences.findByFkey11", query = "SELECT s FROM Sysreferences s WHERE s.fkey11 = :fkey11"),
    @NamedQuery(name = "Sysreferences.findByFkey12", query = "SELECT s FROM Sysreferences s WHERE s.fkey12 = :fkey12"),
    @NamedQuery(name = "Sysreferences.findByFkey13", query = "SELECT s FROM Sysreferences s WHERE s.fkey13 = :fkey13"),
    @NamedQuery(name = "Sysreferences.findByFkey14", query = "SELECT s FROM Sysreferences s WHERE s.fkey14 = :fkey14"),
    @NamedQuery(name = "Sysreferences.findByFkey15", query = "SELECT s FROM Sysreferences s WHERE s.fkey15 = :fkey15"),
    @NamedQuery(name = "Sysreferences.findByFkey16", query = "SELECT s FROM Sysreferences s WHERE s.fkey16 = :fkey16"),
    @NamedQuery(name = "Sysreferences.findByRkey1", query = "SELECT s FROM Sysreferences s WHERE s.rkey1 = :rkey1"),
    @NamedQuery(name = "Sysreferences.findByRkey2", query = "SELECT s FROM Sysreferences s WHERE s.rkey2 = :rkey2"),
    @NamedQuery(name = "Sysreferences.findByRkey3", query = "SELECT s FROM Sysreferences s WHERE s.rkey3 = :rkey3"),
    @NamedQuery(name = "Sysreferences.findByRkey4", query = "SELECT s FROM Sysreferences s WHERE s.rkey4 = :rkey4"),
    @NamedQuery(name = "Sysreferences.findByRkey5", query = "SELECT s FROM Sysreferences s WHERE s.rkey5 = :rkey5"),
    @NamedQuery(name = "Sysreferences.findByRkey6", query = "SELECT s FROM Sysreferences s WHERE s.rkey6 = :rkey6"),
    @NamedQuery(name = "Sysreferences.findByRkey7", query = "SELECT s FROM Sysreferences s WHERE s.rkey7 = :rkey7"),
    @NamedQuery(name = "Sysreferences.findByRkey8", query = "SELECT s FROM Sysreferences s WHERE s.rkey8 = :rkey8"),
    @NamedQuery(name = "Sysreferences.findByRkey9", query = "SELECT s FROM Sysreferences s WHERE s.rkey9 = :rkey9"),
    @NamedQuery(name = "Sysreferences.findByRkey10", query = "SELECT s FROM Sysreferences s WHERE s.rkey10 = :rkey10"),
    @NamedQuery(name = "Sysreferences.findByRkey11", query = "SELECT s FROM Sysreferences s WHERE s.rkey11 = :rkey11"),
    @NamedQuery(name = "Sysreferences.findByRkey12", query = "SELECT s FROM Sysreferences s WHERE s.rkey12 = :rkey12"),
    @NamedQuery(name = "Sysreferences.findByRkey13", query = "SELECT s FROM Sysreferences s WHERE s.rkey13 = :rkey13"),
    @NamedQuery(name = "Sysreferences.findByRkey14", query = "SELECT s FROM Sysreferences s WHERE s.rkey14 = :rkey14"),
    @NamedQuery(name = "Sysreferences.findByRkey15", query = "SELECT s FROM Sysreferences s WHERE s.rkey15 = :rkey15"),
    @NamedQuery(name = "Sysreferences.findByRkey16", query = "SELECT s FROM Sysreferences s WHERE s.rkey16 = :rkey16")})
public class Sysreferences implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "constid")
    private int constid;
    @Basic(optional = false)
    @Column(name = "fkeyid")
    private int fkeyid;
    @Column(name = "rkeyid")
    private Integer rkeyid;
    @Column(name = "rkeyindid")
    private Short rkeyindid;
    @Column(name = "keycnt")
    private Short keycnt;
    @Lob
    @Column(name = "forkeys")
    private byte[] forkeys;
    @Lob
    @Column(name = "refkeys")
    private byte[] refkeys;
    @Column(name = "fkeydbid")
    private Short fkeydbid;
    @Column(name = "rkeydbid")
    private Short rkeydbid;
    @Column(name = "fkey1")
    private Short fkey1;
    @Column(name = "fkey2")
    private Short fkey2;
    @Column(name = "fkey3")
    private Short fkey3;
    @Column(name = "fkey4")
    private Short fkey4;
    @Column(name = "fkey5")
    private Short fkey5;
    @Column(name = "fkey6")
    private Short fkey6;
    @Column(name = "fkey7")
    private Short fkey7;
    @Column(name = "fkey8")
    private Short fkey8;
    @Column(name = "fkey9")
    private Short fkey9;
    @Column(name = "fkey10")
    private Short fkey10;
    @Column(name = "fkey11")
    private Short fkey11;
    @Column(name = "fkey12")
    private Short fkey12;
    @Column(name = "fkey13")
    private Short fkey13;
    @Column(name = "fkey14")
    private Short fkey14;
    @Column(name = "fkey15")
    private Short fkey15;
    @Column(name = "fkey16")
    private Short fkey16;
    @Column(name = "rkey1")
    private Short rkey1;
    @Column(name = "rkey2")
    private Short rkey2;
    @Column(name = "rkey3")
    private Short rkey3;
    @Column(name = "rkey4")
    private Short rkey4;
    @Column(name = "rkey5")
    private Short rkey5;
    @Column(name = "rkey6")
    private Short rkey6;
    @Column(name = "rkey7")
    private Short rkey7;
    @Column(name = "rkey8")
    private Short rkey8;
    @Column(name = "rkey9")
    private Short rkey9;
    @Column(name = "rkey10")
    private Short rkey10;
    @Column(name = "rkey11")
    private Short rkey11;
    @Column(name = "rkey12")
    private Short rkey12;
    @Column(name = "rkey13")
    private Short rkey13;
    @Column(name = "rkey14")
    private Short rkey14;
    @Column(name = "rkey15")
    private Short rkey15;
    @Column(name = "rkey16")
    private Short rkey16;

    public Sysreferences() {
    }

    public int getConstid() {
        return constid;
    }

    public void setConstid(int constid) {
        this.constid = constid;
    }

    public int getFkeyid() {
        return fkeyid;
    }

    public void setFkeyid(int fkeyid) {
        this.fkeyid = fkeyid;
    }

    public Integer getRkeyid() {
        return rkeyid;
    }

    public void setRkeyid(Integer rkeyid) {
        this.rkeyid = rkeyid;
    }

    public Short getRkeyindid() {
        return rkeyindid;
    }

    public void setRkeyindid(Short rkeyindid) {
        this.rkeyindid = rkeyindid;
    }

    public Short getKeycnt() {
        return keycnt;
    }

    public void setKeycnt(Short keycnt) {
        this.keycnt = keycnt;
    }

    public byte[] getForkeys() {
        return forkeys;
    }

    public void setForkeys(byte[] forkeys) {
        this.forkeys = forkeys;
    }

    public byte[] getRefkeys() {
        return refkeys;
    }

    public void setRefkeys(byte[] refkeys) {
        this.refkeys = refkeys;
    }

    public Short getFkeydbid() {
        return fkeydbid;
    }

    public void setFkeydbid(Short fkeydbid) {
        this.fkeydbid = fkeydbid;
    }

    public Short getRkeydbid() {
        return rkeydbid;
    }

    public void setRkeydbid(Short rkeydbid) {
        this.rkeydbid = rkeydbid;
    }

    public Short getFkey1() {
        return fkey1;
    }

    public void setFkey1(Short fkey1) {
        this.fkey1 = fkey1;
    }

    public Short getFkey2() {
        return fkey2;
    }

    public void setFkey2(Short fkey2) {
        this.fkey2 = fkey2;
    }

    public Short getFkey3() {
        return fkey3;
    }

    public void setFkey3(Short fkey3) {
        this.fkey3 = fkey3;
    }

    public Short getFkey4() {
        return fkey4;
    }

    public void setFkey4(Short fkey4) {
        this.fkey4 = fkey4;
    }

    public Short getFkey5() {
        return fkey5;
    }

    public void setFkey5(Short fkey5) {
        this.fkey5 = fkey5;
    }

    public Short getFkey6() {
        return fkey6;
    }

    public void setFkey6(Short fkey6) {
        this.fkey6 = fkey6;
    }

    public Short getFkey7() {
        return fkey7;
    }

    public void setFkey7(Short fkey7) {
        this.fkey7 = fkey7;
    }

    public Short getFkey8() {
        return fkey8;
    }

    public void setFkey8(Short fkey8) {
        this.fkey8 = fkey8;
    }

    public Short getFkey9() {
        return fkey9;
    }

    public void setFkey9(Short fkey9) {
        this.fkey9 = fkey9;
    }

    public Short getFkey10() {
        return fkey10;
    }

    public void setFkey10(Short fkey10) {
        this.fkey10 = fkey10;
    }

    public Short getFkey11() {
        return fkey11;
    }

    public void setFkey11(Short fkey11) {
        this.fkey11 = fkey11;
    }

    public Short getFkey12() {
        return fkey12;
    }

    public void setFkey12(Short fkey12) {
        this.fkey12 = fkey12;
    }

    public Short getFkey13() {
        return fkey13;
    }

    public void setFkey13(Short fkey13) {
        this.fkey13 = fkey13;
    }

    public Short getFkey14() {
        return fkey14;
    }

    public void setFkey14(Short fkey14) {
        this.fkey14 = fkey14;
    }

    public Short getFkey15() {
        return fkey15;
    }

    public void setFkey15(Short fkey15) {
        this.fkey15 = fkey15;
    }

    public Short getFkey16() {
        return fkey16;
    }

    public void setFkey16(Short fkey16) {
        this.fkey16 = fkey16;
    }

    public Short getRkey1() {
        return rkey1;
    }

    public void setRkey1(Short rkey1) {
        this.rkey1 = rkey1;
    }

    public Short getRkey2() {
        return rkey2;
    }

    public void setRkey2(Short rkey2) {
        this.rkey2 = rkey2;
    }

    public Short getRkey3() {
        return rkey3;
    }

    public void setRkey3(Short rkey3) {
        this.rkey3 = rkey3;
    }

    public Short getRkey4() {
        return rkey4;
    }

    public void setRkey4(Short rkey4) {
        this.rkey4 = rkey4;
    }

    public Short getRkey5() {
        return rkey5;
    }

    public void setRkey5(Short rkey5) {
        this.rkey5 = rkey5;
    }

    public Short getRkey6() {
        return rkey6;
    }

    public void setRkey6(Short rkey6) {
        this.rkey6 = rkey6;
    }

    public Short getRkey7() {
        return rkey7;
    }

    public void setRkey7(Short rkey7) {
        this.rkey7 = rkey7;
    }

    public Short getRkey8() {
        return rkey8;
    }

    public void setRkey8(Short rkey8) {
        this.rkey8 = rkey8;
    }

    public Short getRkey9() {
        return rkey9;
    }

    public void setRkey9(Short rkey9) {
        this.rkey9 = rkey9;
    }

    public Short getRkey10() {
        return rkey10;
    }

    public void setRkey10(Short rkey10) {
        this.rkey10 = rkey10;
    }

    public Short getRkey11() {
        return rkey11;
    }

    public void setRkey11(Short rkey11) {
        this.rkey11 = rkey11;
    }

    public Short getRkey12() {
        return rkey12;
    }

    public void setRkey12(Short rkey12) {
        this.rkey12 = rkey12;
    }

    public Short getRkey13() {
        return rkey13;
    }

    public void setRkey13(Short rkey13) {
        this.rkey13 = rkey13;
    }

    public Short getRkey14() {
        return rkey14;
    }

    public void setRkey14(Short rkey14) {
        this.rkey14 = rkey14;
    }

    public Short getRkey15() {
        return rkey15;
    }

    public void setRkey15(Short rkey15) {
        this.rkey15 = rkey15;
    }

    public Short getRkey16() {
        return rkey16;
    }

    public void setRkey16(Short rkey16) {
        this.rkey16 = rkey16;
    }
    
}
