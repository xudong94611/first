package com.cim.cimConfig.domain;

import java.io.Serializable;

public class ModuleAndEquipmentContainerDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Integer serial;
    //
    private String hostModelNumber;
    //
    private String type;
    //
    private String name;
    //
    private String allowedModelNumbers;
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
    private String extraAttributes;
    //
    private String slotNo;

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public String getHostModelNumber() {
        return hostModelNumber;
    }

    public void setHostModelNumber(String hostModelNumber) {
        this.hostModelNumber = hostModelNumber;
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

    public String getAllowedModelNumbers() {
        return allowedModelNumbers;
    }

    public void setAllowedModelNumbers(String allowedModelNumbers) {
        this.allowedModelNumbers = allowedModelNumbers;
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

    public String getExtraAttributes() {
        return extraAttributes;
    }

    public void setExtraAttributes(String extraAttributes) {
        this.extraAttributes = extraAttributes;
    }

    public String getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(String slotNo) {
        this.slotNo = slotNo;
    }
}
