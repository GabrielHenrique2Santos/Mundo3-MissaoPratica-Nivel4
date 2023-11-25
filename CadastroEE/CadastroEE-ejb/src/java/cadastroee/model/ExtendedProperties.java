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
@Table(name = "extended_properties")
@NamedQueries({
    @NamedQuery(name = "ExtendedProperties.findAll", query = "SELECT e FROM ExtendedProperties e"),
    @NamedQuery(name = "ExtendedProperties.findByClass1", query = "SELECT e FROM ExtendedProperties e WHERE e.class1 = :class1"),
    @NamedQuery(name = "ExtendedProperties.findByClassDesc", query = "SELECT e FROM ExtendedProperties e WHERE e.classDesc = :classDesc"),
    @NamedQuery(name = "ExtendedProperties.findByMajorId", query = "SELECT e FROM ExtendedProperties e WHERE e.majorId = :majorId"),
    @NamedQuery(name = "ExtendedProperties.findByMinorId", query = "SELECT e FROM ExtendedProperties e WHERE e.minorId = :minorId"),
    @NamedQuery(name = "ExtendedProperties.findByName", query = "SELECT e FROM ExtendedProperties e WHERE e.name = :name"),
    @NamedQuery(name = "ExtendedProperties.findByValue", query = "SELECT e FROM ExtendedProperties e WHERE e.value = :value")})
public class ExtendedProperties implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "class")
    private short class1;
    @Column(name = "class_desc")
    private String classDesc;
    @Basic(optional = false)
    @Column(name = "major_id")
    private int majorId;
    @Basic(optional = false)
    @Column(name = "minor_id")
    private int minorId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "value")
    private Serializable value;

    public ExtendedProperties() {
    }

    public short getClass1() {
        return class1;
    }

    public void setClass1(short class1) {
        this.class1 = class1;
    }

    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }

    public int getMajorId() {
        return majorId;
    }

    public void setMajorId(int majorId) {
        this.majorId = majorId;
    }

    public int getMinorId() {
        return minorId;
    }

    public void setMinorId(int minorId) {
        this.minorId = minorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serializable getValue() {
        return value;
    }

    public void setValue(Serializable value) {
        this.value = value;
    }
    
}
