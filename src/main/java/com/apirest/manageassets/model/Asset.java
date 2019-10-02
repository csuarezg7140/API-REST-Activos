/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.manageassets.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author csuar
 */
@Entity
@Table(name = "asset")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asset.findAll", query = "SELECT a FROM Asset a"),
    @NamedQuery(name = "Asset.findByAssetName", query = "SELECT a FROM Asset a WHERE a.assetName = :assetName"),
    @NamedQuery(name = "Asset.findByAssetDescription", query = "SELECT a FROM Asset a WHERE a.assetDescription = :assetDescription"),
    @NamedQuery(name = "Asset.findByAssetType", query = "SELECT a FROM Asset a WHERE a.assetType = :assetType"),
    @NamedQuery(name = "Asset.findByAssetSerial", query = "SELECT a FROM Asset a WHERE a.assetSerial = :assetSerial"),
    @NamedQuery(name = "Asset.findByInternalInventoryNumber", query = "SELECT a FROM Asset a WHERE a.internalInventoryNumber = :internalInventoryNumber"),
    @NamedQuery(name = "Asset.findByAssetWeight", query = "SELECT a FROM Asset a WHERE a.assetWeight = :assetWeight"),
    @NamedQuery(name = "Asset.findByAssetTall", query = "SELECT a FROM Asset a WHERE a.assetTall = :assetTall"),
    @NamedQuery(name = "Asset.findByAssetWidth", query = "SELECT a FROM Asset a WHERE a.assetWidth = :assetWidth"),
    @NamedQuery(name = "Asset.findByAssetLong", query = "SELECT a FROM Asset a WHERE a.assetLong = :assetLong"),
    @NamedQuery(name = "Asset.findByPurchaseValue", query = "SELECT a FROM Asset a WHERE a.purchaseValue = :purchaseValue"),
    @NamedQuery(name = "Asset.findByPurchaseDate", query = "SELECT a FROM Asset a WHERE a.purchaseDate = :purchaseDate"),
    @NamedQuery(name = "Asset.findByOutDate", query = "SELECT a FROM Asset a WHERE a.outDate = :outDate"),
    @NamedQuery(name = "Asset.findByActualState", query = "SELECT a FROM Asset a WHERE a.actualState = :actualState"),
    @NamedQuery(name = "Asset.findByAssetColor", query = "SELECT a FROM Asset a WHERE a.assetColor = :assetColor")})
public class Asset implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ASSET_NAME")
    private String assetName;
    @Basic(optional = false)
    @Column(name = "ASSET_DESCRIPTION")
    private String assetDescription;
    @Basic(optional = false)
    @Column(name = "ASSET_TYPE")
    private String assetType;
    @Id
    @Basic(optional = false)
    @Column(name = "ASSET_SERIAL")
    private String assetSerial;
    @Basic(optional = false)
    @Column(name = "INTERNAL_INVENTORY_NUMBER")
    private int internalInventoryNumber;
    @Basic(optional = false)
    @Column(name = "ASSET_WEIGHT")
    private int assetWeight;
    @Basic(optional = false)
    @Column(name = "ASSET_TALL")
    private int assetTall;
    @Basic(optional = false)
    @Column(name = "ASSET_WIDTH")
    private int assetWidth;
    @Basic(optional = false)
    @Column(name = "ASSET_LONG")
    private int assetLong;
    @Basic(optional = false)
    @Column(name = "PURCHASE_VALUE")
    private int purchaseValue;
    @Basic(optional = false)
    @Column(name = "PURCHASE_DATE")
    @Temporal(TemporalType.DATE)
    private Date purchaseDate;
    @Column(name = "OUT_DATE")
    @Temporal(TemporalType.DATE)
    private Date outDate;
    @Basic(optional = false)
    @Column(name = "ACTUAL_STATE")
    private String actualState;
    @Basic(optional = false)
    @Column(name = "ASSET_COLOR")
    private String assetColor;
    @JoinColumn(name = "AREA_ID", referencedColumnName = "AREA_ID")
    @ManyToOne
    private Area areaId;
    @JoinColumn(name = "PERSON_ID", referencedColumnName = "PERSON_ID")
    @ManyToOne
    private Person personId;

    public Asset() {
    }

    public Asset(String assetSerial) {
        this.assetSerial = assetSerial;
    }

    public Asset(String assetSerial, String assetName, String assetDescription, String assetType, int internalInventoryNumber, int assetWeight, int assetTall, int assetWidth, int assetLong, int purchaseValue, Date purchaseDate, String actualState, String assetColor) {
        this.assetSerial = assetSerial;
        this.assetName = assetName;
        this.assetDescription = assetDescription;
        this.assetType = assetType;
        this.internalInventoryNumber = internalInventoryNumber;
        this.assetWeight = assetWeight;
        this.assetTall = assetTall;
        this.assetWidth = assetWidth;
        this.assetLong = assetLong;
        this.purchaseValue = purchaseValue;
        this.purchaseDate = purchaseDate;
        this.actualState = actualState;
        this.assetColor = assetColor;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getAssetDescription() {
        return assetDescription;
    }

    public void setAssetDescription(String assetDescription) {
        this.assetDescription = assetDescription;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getAssetSerial() {
        return assetSerial;
    }

    public void setAssetSerial(String assetSerial) {
        this.assetSerial = assetSerial;
    }

    public int getInternalInventoryNumber() {
        return internalInventoryNumber;
    }

    public void setInternalInventoryNumber(int internalInventoryNumber) {
        this.internalInventoryNumber = internalInventoryNumber;
    }

    public int getAssetWeight() {
        return assetWeight;
    }

    public void setAssetWeight(int assetWeight) {
        this.assetWeight = assetWeight;
    }

    public int getAssetTall() {
        return assetTall;
    }

    public void setAssetTall(int assetTall) {
        this.assetTall = assetTall;
    }

    public int getAssetWidth() {
        return assetWidth;
    }

    public void setAssetWidth(int assetWidth) {
        this.assetWidth = assetWidth;
    }

    public int getAssetLong() {
        return assetLong;
    }

    public void setAssetLong(int assetLong) {
        this.assetLong = assetLong;
    }

    public int getPurchaseValue() {
        return purchaseValue;
    }

    public void setPurchaseValue(int purchaseValue) {
        this.purchaseValue = purchaseValue;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public String getActualState() {
        return actualState;
    }

    public void setActualState(String actualState) {
        this.actualState = actualState;
    }

    public String getAssetColor() {
        return assetColor;
    }

    public void setAssetColor(String assetColor) {
        this.assetColor = assetColor;
    }

    public Area getAreaId() {
        return areaId;
    }

    public void setAreaId(Area areaId) {
        this.areaId = areaId;
    }

    public Person getPersonId() {
        return personId;
    }

    public void setPersonId(Person personId) {
        this.personId = personId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (assetSerial != null ? assetSerial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asset)) {
            return false;
        }
        Asset other = (Asset) object;
        if ((this.assetSerial == null && other.assetSerial != null) || (this.assetSerial != null && !this.assetSerial.equals(other.assetSerial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apirest.manageassets.model.Asset[ assetSerial=" + assetSerial + " ]";
    }
    
}
