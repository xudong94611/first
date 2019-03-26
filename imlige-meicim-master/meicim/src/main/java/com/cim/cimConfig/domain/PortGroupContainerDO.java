package com.cim.cimConfig.domain;

import java.io.Serializable;

public class PortGroupContainerDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Integer serial;
    //
    private String hostModuleNumber;
    //
    private String type;
    //
    private String name;
    //
    private String portNumber;
    //
    private String featureGroup;
    //
    private String connectionDemandGroup;
    //
    private String allowedModelNumbersGroup;
    //
    private String suggestedCableInfoGroupArray;
    //
    private String direction;
    //
    private String objectRotation;
    //
    private String locationPointXs;
    //
    private String locationPointYs;
    //
    private String locationPointZs;
    //
    private String cableLengthInside;
    //
    private String isVirtual;
    //
    private String description;

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public String getHostModuleNumber() {
        return hostModuleNumber;
    }

    public void setHostModuleNumber(String hostModuleNumber) {
        this.hostModuleNumber = hostModuleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getObjectRotation() {
        return objectRotation;
    }

    public void setObjectRotation(String objectRotation) {
        this.objectRotation = objectRotation;
    }

    public String getLocationPointXs() {
        return locationPointXs;
    }

    public void setLocationPointXs(String locationPointXs) {
        this.locationPointXs = locationPointXs;
    }

    public String getLocationPointYs() {
        return locationPointYs;
    }

    public void setLocationPointYs(String locationPointYs) {
        this.locationPointYs = locationPointYs;
    }

    public String getLocationPointZs() {
        return locationPointZs;
    }

    public void setLocationPointZs(String locationPointZs) {
        this.locationPointZs = locationPointZs;
    }

    public String getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(String portNumber) {
        this.portNumber = portNumber;
    }

    public String getFeatureGroup() {
        return featureGroup;
    }

    public void setFeatureGroup(String featureGroup) {
        this.featureGroup = featureGroup;
    }

    public String getConnectionDemandGroup() {
        return connectionDemandGroup;
    }

    public void setConnectionDemandGroup(String connectionDemandGroup) {
        this.connectionDemandGroup = connectionDemandGroup;
    }

    public String getAllowedModelNumbersGroup() {
        return allowedModelNumbersGroup;
    }

    public void setAllowedModelNumbersGroup(String allowedModelNumbersGroup) {
        this.allowedModelNumbersGroup = allowedModelNumbersGroup;
    }

    public String getSuggestedCableInfoGroupArray() {
        return suggestedCableInfoGroupArray;
    }

    public void setSuggestedCableInfoGroupArray(String suggestedCableInfoGroupArray) {
        this.suggestedCableInfoGroupArray = suggestedCableInfoGroupArray;
    }

    public String getCableLengthInside() {
        return cableLengthInside;
    }

    public void setCableLengthInside(String cableLengthInside) {
        this.cableLengthInside = cableLengthInside;
    }

    public String getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(String isVirtual) {
        this.isVirtual = isVirtual;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
