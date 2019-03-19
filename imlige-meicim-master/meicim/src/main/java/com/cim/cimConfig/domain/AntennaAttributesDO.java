package com.cim.cimConfig.domain;

import java.io.Serializable;

public class AntennaAttributesDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Integer serial;
    //
    private String className;
    //
    private String modelNumber;
    //
    private String abbreviation;
    //
    private String description;
    //
    private String width;
    //
    private String depth;
    //
    private String height;
    //
    private String manufacture;
    //
    private String installationMode;
    //
    private String directivity;
    //
    private String weight;
    //
    private String bandArray;
    //
    private String horizontalHPBW;
    //
    private String verticalHPBW;
    //
    private String gain;
    //
    private String presetDownTilt;
    //
    private String isElectrical;
    //
    private String electricalDownTiltRange;
    //
    private String isSmart;

    /**
     * 设置：
     */
    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    /**
     * 获取：
     */
    public Integer getSerial() {
        return serial;
    }

    /**
     * 设置：
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * 获取：
     */
    public String getClassName() {
        return className;
    }

    /**
     * 设置：
     */
    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    /**
     * 获取：
     */
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * 设置：
     */
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    /**
     * 获取：
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * 设置：
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取：
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置：
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * 获取：
     */
    public String getWidth() {
        return width;
    }

    /**
     * 设置：
     */
    public void setDepth(String depth) {
        this.depth = depth;
    }

    /**
     * 获取：
     */
    public String getDepth() {
        return depth;
    }

    /**
     * 设置：
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * 获取：
     */
    public String getHeight() {
        return height;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getInstallationMode() {
        return installationMode;
    }

    public void setInstallationMode(String installationMode) {
        this.installationMode = installationMode;
    }

    public String getDirectivity() {
        return directivity;
    }

    public void setDirectivity(String directivity) {
        this.directivity = directivity;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBandArray() {
        return bandArray;
    }

    public void setBandArray(String bandArray) {
        this.bandArray = bandArray;
    }

    public String getHorizontalHPBW() {
        return horizontalHPBW;
    }

    public void setHorizontalHPBW(String horizontalHPBW) {
        this.horizontalHPBW = horizontalHPBW;
    }

    public String getVerticalHPBW() {
        return verticalHPBW;
    }

    public void setVerticalHPBW(String verticalHPBW) {
        this.verticalHPBW = verticalHPBW;
    }

    public String getGain() {
        return gain;
    }

    public void setGain(String gain) {
        this.gain = gain;
    }

    public String getPresetDownTilt() {
        return presetDownTilt;
    }

    public void setPresetDownTilt(String presetDownTilt) {
        this.presetDownTilt = presetDownTilt;
    }

    public String getIsElectrical() {
        return isElectrical;
    }

    public void setIsElectrical(String isElectrical) {
        this.isElectrical = isElectrical;
    }

    public String getElectricalDownTiltRange() {
        return electricalDownTiltRange;
    }

    public void setElectricalDownTiltRange(String electricalDownTiltRange) {
        this.electricalDownTiltRange = electricalDownTiltRange;
    }

    public String getIsSmart() {
        return isSmart;
    }

    public void setIsSmart(String isSmart) {
        this.isSmart = isSmart;
    }
}
