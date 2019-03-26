package com.cim.manageFile.domain;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

public class BaseStationDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Integer index;
    //
    private String province;
    //
    private String city;
    //
    private String district;
    //
    private String street;
    //
    private String baseNo;
    //
    private String name;
    //
    private String filePath;
    //
    private String token;
    //
    private String tokenTime;
    //
    private String versions;
    //
    private String longitude;
    //
    private String latitude;
    //
    private String address;
    //
    private String otherInfo;
    //
    private String baseFeature;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBaseNo() {
        return baseNo;
    }

    public void setBaseNo(String baseNo) {
        this.baseNo = baseNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTokenTime() {
        return tokenTime;
    }

    public void setTokenTime(String tokenTime) {
        this.tokenTime = tokenTime;
    }

    public String getVersions() {
        return versions;
    }

    public void setVersions(String versions) {
        this.versions = versions;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    public String getBaseFeature() {
        return baseFeature;
    }

    public void setBaseFeature(String baseFeature) {
        this.baseFeature = baseFeature;
    }

    public boolean isEmpty() {
        if (StringUtils.isEmpty(province)|| StringUtils.isEmpty(city)||StringUtils.isEmpty(district)|| StringUtils.isEmpty(name)|| StringUtils.isEmpty(filePath)|| StringUtils.isEmpty(address)|| StringUtils.isEmpty(baseFeature)) {
            return true;
        }
        return false;
    }
}
