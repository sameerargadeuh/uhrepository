/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unityhealth.getgeocodes.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Clinton
 */
@Entity
@Table(name = "tbladdress")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AddressEntity.findAll", query = "SELECT a FROM AddressEntity a")
    , @NamedQuery(name = "AddressEntity.findByIID", query = "SELECT a FROM AddressEntity a WHERE a.iID = :iID")
    , @NamedQuery(name = "AddressEntity.findByIGroupID", query = "SELECT a FROM AddressEntity a WHERE a.iGroupID = :iGroupID")
    , @NamedQuery(name = "AddressEntity.findByVCodeIMSBrick", query = "SELECT a FROM AddressEntity a WHERE a.vCodeIMSBrick = :vCodeIMSBrick")
    , @NamedQuery(name = "AddressEntity.findByVCodeIMS", query = "SELECT a FROM AddressEntity a WHERE a.vCodeIMS = :vCodeIMS")
    , @NamedQuery(name = "AddressEntity.findByVCodeDendrite", query = "SELECT a FROM AddressEntity a WHERE a.vCodeDendrite = :vCodeDendrite")
    , @NamedQuery(name = "AddressEntity.findByVCodeDendriteBrick", query = "SELECT a FROM AddressEntity a WHERE a.vCodeDendriteBrick = :vCodeDendriteBrick")
    , @NamedQuery(name = "AddressEntity.findByVLocName", query = "SELECT a FROM AddressEntity a WHERE a.vLocName = :vLocName")
    , @NamedQuery(name = "AddressEntity.findByVLocAddress1", query = "SELECT a FROM AddressEntity a WHERE a.vLocAddress1 = :vLocAddress1")
    , @NamedQuery(name = "AddressEntity.findByVLocAddress2", query = "SELECT a FROM AddressEntity a WHERE a.vLocAddress2 = :vLocAddress2")
    , @NamedQuery(name = "AddressEntity.findByVLocLocality1", query = "SELECT a FROM AddressEntity a WHERE a.vLocLocality1 = :vLocLocality1")
    , @NamedQuery(name = "AddressEntity.findByVLocRegion", query = "SELECT a FROM AddressEntity a WHERE a.vLocRegion = :vLocRegion")
    , @NamedQuery(name = "AddressEntity.findByVLocPostCode", query = "SELECT a FROM AddressEntity a WHERE a.vLocPostCode = :vLocPostCode")
    , @NamedQuery(name = "AddressEntity.findByVPhoneNumber", query = "SELECT a FROM AddressEntity a WHERE a.vPhoneNumber = :vPhoneNumber")
    , @NamedQuery(name = "AddressEntity.findByVFaxNumber", query = "SELECT a FROM AddressEntity a WHERE a.vFaxNumber = :vFaxNumber")
    , @NamedQuery(name = "AddressEntity.findByVPhoneNumberClean", query = "SELECT a FROM AddressEntity a WHERE a.vPhoneNumberClean = :vPhoneNumberClean")
    , @NamedQuery(name = "AddressEntity.findByVLocLocality2", query = "SELECT a FROM AddressEntity a WHERE a.vLocLocality2 = :vLocLocality2")
    , @NamedQuery(name = "AddressEntity.findByVLocCountry", query = "SELECT a FROM AddressEntity a WHERE a.vLocCountry = :vLocCountry")
    , @NamedQuery(name = "AddressEntity.findByVEmail", query = "SELECT a FROM AddressEntity a WHERE a.vEmail = :vEmail")
    , @NamedQuery(name = "AddressEntity.findByVABN", query = "SELECT a FROM AddressEntity a WHERE a.vABN = :vABN")
    , @NamedQuery(name = "AddressEntity.findByVEntityType", query = "SELECT a FROM AddressEntity a WHERE a.vEntityType = :vEntityType")
    , @NamedQuery(name = "AddressEntity.findByVEntityName", query = "SELECT a FROM AddressEntity a WHERE a.vEntityName = :vEntityName")
    , @NamedQuery(name = "AddressEntity.findByVTradingName", query = "SELECT a FROM AddressEntity a WHERE a.vTradingName = :vTradingName")
    , @NamedQuery(name = "AddressEntity.findByVBusName", query = "SELECT a FROM AddressEntity a WHERE a.vBusName = :vBusName")
    , @NamedQuery(name = "AddressEntity.findByVACN", query = "SELECT a FROM AddressEntity a WHERE a.vACN = :vACN")
    , @NamedQuery(name = "AddressEntity.findByVOwners", query = "SELECT a FROM AddressEntity a WHERE a.vOwners = :vOwners")
    , @NamedQuery(name = "AddressEntity.findByVManagers", query = "SELECT a FROM AddressEntity a WHERE a.vManagers = :vManagers")
    , @NamedQuery(name = "AddressEntity.findByVProprietors", query = "SELECT a FROM AddressEntity a WHERE a.vProprietors = :vProprietors")
    , @NamedQuery(name = "AddressEntity.findByVQCPP", query = "SELECT a FROM AddressEntity a WHERE a.vQCPP = :vQCPP")
    , @NamedQuery(name = "AddressEntity.findByVHeadPharmacist", query = "SELECT a FROM AddressEntity a WHERE a.vHeadPharmacist = :vHeadPharmacist")
    , @NamedQuery(name = "AddressEntity.findByIHeadPharmacistID", query = "SELECT a FROM AddressEntity a WHERE a.iHeadPharmacistID = :iHeadPharmacistID")
    , @NamedQuery(name = "AddressEntity.findByVAccountCode", query = "SELECT a FROM AddressEntity a WHERE a.vAccountCode = :vAccountCode")
    , @NamedQuery(name = "AddressEntity.findByIType", query = "SELECT a FROM AddressEntity a WHERE a.iType = :iType")
    , @NamedQuery(name = "AddressEntity.findByINumStaff", query = "SELECT a FROM AddressEntity a WHERE a.iNumStaff = :iNumStaff")
    , @NamedQuery(name = "AddressEntity.findByDtCheck", query = "SELECT a FROM AddressEntity a WHERE a.dtCheck = :dtCheck")
    , @NamedQuery(name = "AddressEntity.findByVStatus", query = "SELECT a FROM AddressEntity a WHERE a.vStatus = :vStatus")
    , @NamedQuery(name = "AddressEntity.findByLat", query = "SELECT a FROM AddressEntity a WHERE a.lat = :lat")
    , @NamedQuery(name = "AddressEntity.findByLng", query = "SELECT a FROM AddressEntity a WHERE a.lng = :lng")
    , @NamedQuery(name = "AddressEntity.findByType", query = "SELECT a FROM AddressEntity a WHERE a.type = :type")
    , @NamedQuery(name = "AddressEntity.findByGooglePlaceId", query = "SELECT a FROM AddressEntity a WHERE a.googlePlaceId = :googlePlaceId")
    , @NamedQuery(name = "AddressEntity.findByGeocodeString", query = "SELECT a FROM AddressEntity a WHERE a.geocodeString = :geocodeString"),
 @NamedQuery(name = "AddressEntity.findAllGeocodes", query = "SELECT a FROM AddressEntity a WHERE a.googlePlaceId IS NULL")})
public class AddressEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iID")
    private Integer iID;
    @Column(name = "iGroupID")
    private Integer iGroupID;
    @Column(name = "vCodeIMSBrick")
    private String vCodeIMSBrick;
    @Column(name = "vCodeIMS")
    private String vCodeIMS;
    @Column(name = "vCodeDendrite")
    private String vCodeDendrite;
    @Column(name = "vCodeDendriteBrick")
    private String vCodeDendriteBrick;
    @Column(name = "vLocName")
    private String vLocName;
    @Column(name = "vLocAddress1")
    private String vLocAddress1;
    @Column(name = "vLocAddress2")
    private String vLocAddress2;
    @Column(name = "vLocLocality1")
    private String vLocLocality1;
    @Column(name = "vLocRegion")
    private String vLocRegion;
    @Column(name = "vLocPostCode")
    private String vLocPostCode;
    @Column(name = "vPhoneNumber")
    private String vPhoneNumber;
    @Column(name = "vFaxNumber")
    private String vFaxNumber;
    @Column(name = "vPhoneNumberClean")
    private String vPhoneNumberClean;
    @Column(name = "vLocLocality2")
    private String vLocLocality2;
    @Column(name = "vLocCountry")
    private String vLocCountry;
    @Column(name = "vEmail")
    private String vEmail;
    @Column(name = "vABN")
    private String vABN;
    @Column(name = "vEntityType")
    private String vEntityType;
    @Column(name = "vEntityName")
    private String vEntityName;
    @Column(name = "vTradingName")
    private String vTradingName;
    @Column(name = "vBusName")
    private String vBusName;
    @Column(name = "vACN")
    private String vACN;
    @Column(name = "vOwners")
    private String vOwners;
    @Column(name = "vManagers")
    private String vManagers;
    @Column(name = "vProprietors")
    private String vProprietors;
    @Column(name = "vQCPP")
    private String vQCPP;
    @Column(name = "vHeadPharmacist")
    private String vHeadPharmacist;
    @Column(name = "iHeadPharmacistID")
    private Integer iHeadPharmacistID;
    @Column(name = "vAccountCode")
    private String vAccountCode;
    @Column(name = "iType")
    private Integer iType;
    @Column(name = "iNumStaff")
    private Integer iNumStaff;
    @Column(name = "dtCheck")
    @Temporal(TemporalType.DATE)
    private Date dtCheck;
    @Column(name = "vStatus")
    private String vStatus;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "lat")
    private Double lat;
    @Column(name = "lng")
    private Double lng;
    @Column(name = "type")
    private String type;
    @Column(name = "googlePlaceId")
    private String googlePlaceId;
    @Column(name = "geocodeString")
    private String geocodeString;

    public AddressEntity() {
    }

    public AddressEntity(Integer iID) {
        this.iID = iID;
    }

    public Integer getIID() {
        return iID;
    }

    public void setIID(Integer iID) {
        this.iID = iID;
    }

    public Integer getIGroupID() {
        return iGroupID;
    }

    public void setIGroupID(Integer iGroupID) {
        this.iGroupID = iGroupID;
    }

    public String getVCodeIMSBrick() {
        return vCodeIMSBrick;
    }

    public void setVCodeIMSBrick(String vCodeIMSBrick) {
        this.vCodeIMSBrick = vCodeIMSBrick;
    }

    public String getVCodeIMS() {
        return vCodeIMS;
    }

    public void setVCodeIMS(String vCodeIMS) {
        this.vCodeIMS = vCodeIMS;
    }

    public String getVCodeDendrite() {
        return vCodeDendrite;
    }

    public void setVCodeDendrite(String vCodeDendrite) {
        this.vCodeDendrite = vCodeDendrite;
    }

    public String getVCodeDendriteBrick() {
        return vCodeDendriteBrick;
    }

    public void setVCodeDendriteBrick(String vCodeDendriteBrick) {
        this.vCodeDendriteBrick = vCodeDendriteBrick;
    }

    public String getVLocName() {
        return vLocName;
    }

    public void setVLocName(String vLocName) {
        this.vLocName = vLocName;
    }

    public String getVLocAddress1() {
        return vLocAddress1;
    }

    public void setVLocAddress1(String vLocAddress1) {
        this.vLocAddress1 = vLocAddress1;
    }

    public String getVLocAddress2() {
        return vLocAddress2;
    }

    public void setVLocAddress2(String vLocAddress2) {
        this.vLocAddress2 = vLocAddress2;
    }

    public String getVLocLocality1() {
        return vLocLocality1;
    }

    public void setVLocLocality1(String vLocLocality1) {
        this.vLocLocality1 = vLocLocality1;
    }

    public String getVLocRegion() {
        return vLocRegion;
    }

    public void setVLocRegion(String vLocRegion) {
        this.vLocRegion = vLocRegion;
    }

    public String getVLocPostCode() {
        return vLocPostCode;
    }

    public void setVLocPostCode(String vLocPostCode) {
        this.vLocPostCode = vLocPostCode;
    }

    public String getVPhoneNumber() {
        return vPhoneNumber;
    }

    public void setVPhoneNumber(String vPhoneNumber) {
        this.vPhoneNumber = vPhoneNumber;
    }

    public String getVFaxNumber() {
        return vFaxNumber;
    }

    public void setVFaxNumber(String vFaxNumber) {
        this.vFaxNumber = vFaxNumber;
    }

    public String getVPhoneNumberClean() {
        return vPhoneNumberClean;
    }

    public void setVPhoneNumberClean(String vPhoneNumberClean) {
        this.vPhoneNumberClean = vPhoneNumberClean;
    }

    public String getVLocLocality2() {
        return vLocLocality2;
    }

    public void setVLocLocality2(String vLocLocality2) {
        this.vLocLocality2 = vLocLocality2;
    }

    public String getVLocCountry() {
        return vLocCountry;
    }

    public void setVLocCountry(String vLocCountry) {
        this.vLocCountry = vLocCountry;
    }

    public String getVEmail() {
        return vEmail;
    }

    public void setVEmail(String vEmail) {
        this.vEmail = vEmail;
    }

    public String getVABN() {
        return vABN;
    }

    public void setVABN(String vABN) {
        this.vABN = vABN;
    }

    public String getVEntityType() {
        return vEntityType;
    }

    public void setVEntityType(String vEntityType) {
        this.vEntityType = vEntityType;
    }

    public String getVEntityName() {
        return vEntityName;
    }

    public void setVEntityName(String vEntityName) {
        this.vEntityName = vEntityName;
    }

    public String getVTradingName() {
        return vTradingName;
    }

    public void setVTradingName(String vTradingName) {
        this.vTradingName = vTradingName;
    }

    public String getVBusName() {
        return vBusName;
    }

    public void setVBusName(String vBusName) {
        this.vBusName = vBusName;
    }

    public String getVACN() {
        return vACN;
    }

    public void setVACN(String vACN) {
        this.vACN = vACN;
    }

    public String getVOwners() {
        return vOwners;
    }

    public void setVOwners(String vOwners) {
        this.vOwners = vOwners;
    }

    public String getVManagers() {
        return vManagers;
    }

    public void setVManagers(String vManagers) {
        this.vManagers = vManagers;
    }

    public String getVProprietors() {
        return vProprietors;
    }

    public void setVProprietors(String vProprietors) {
        this.vProprietors = vProprietors;
    }

    public String getVQCPP() {
        return vQCPP;
    }

    public void setVQCPP(String vQCPP) {
        this.vQCPP = vQCPP;
    }

    public String getVHeadPharmacist() {
        return vHeadPharmacist;
    }

    public void setVHeadPharmacist(String vHeadPharmacist) {
        this.vHeadPharmacist = vHeadPharmacist;
    }

    public Integer getIHeadPharmacistID() {
        return iHeadPharmacistID;
    }

    public void setIHeadPharmacistID(Integer iHeadPharmacistID) {
        this.iHeadPharmacistID = iHeadPharmacistID;
    }

    public String getVAccountCode() {
        return vAccountCode;
    }

    public void setVAccountCode(String vAccountCode) {
        this.vAccountCode = vAccountCode;
    }

    public Integer getIType() {
        return iType;
    }

    public void setIType(Integer iType) {
        this.iType = iType;
    }

    public Integer getINumStaff() {
        return iNumStaff;
    }

    public void setINumStaff(Integer iNumStaff) {
        this.iNumStaff = iNumStaff;
    }

    public Date getDtCheck() {
        return dtCheck;
    }

    public void setDtCheck(Date dtCheck) {
        this.dtCheck = dtCheck;
    }

    public String getVStatus() {
        return vStatus;
    }

    public void setVStatus(String vStatus) {
        this.vStatus = vStatus;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGooglePlaceId() {
        return googlePlaceId;
    }

    public void setGooglePlaceId(String googlePlaceId) {
        this.googlePlaceId = googlePlaceId;
    }

    public String getGeocodeString() {
        return geocodeString;
    }

    public void setGeocodeString(String geocodeString) {
        this.geocodeString = geocodeString;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iID != null ? iID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AddressEntity)) {
            return false;
        }
        AddressEntity other = (AddressEntity) object;
        if ((this.iID == null && other.iID != null) || (this.iID != null && !this.iID.equals(other.iID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unityhealth.getgeocodes.domain.AddressEntity[ iID=" + iID + " ]";
    }
    
}
