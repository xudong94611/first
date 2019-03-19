package com.cim.cimConfig.domain;

import java.io.Serializable;

public class ModuleAttributesDO implements Serializable {
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
    private String manufacture;
    //
    private String capacityArray;
    //
    private String price;
    //
    private String serviceLife;
    //
    private String width;
    //
    private String depth;
    //
    private String height;
    //
    private String faceDepth;
    //
    private String weight;
    //
    private String ratedPower;
    //
    private String label;
    //
    private String unitName;
    //
    private String quotaSerial;

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

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getCapacityArray() {
        return capacityArray;
    }

    public void setCapacityArray(String capacityArray) {
        this.capacityArray = capacityArray;
    }

    public String getServiceLife() {
        return serviceLife;
    }

    public void setServiceLife(String serviceLife) {
        this.serviceLife = serviceLife;
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

    public String getFaceDepth() {
        return faceDepth;
    }

    public void setFaceDepth(String faceDepth) {
        this.faceDepth = faceDepth;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getRatedPower() {
        return ratedPower;
    }

    public void setRatedPower(String ratedPower) {
        this.ratedPower = ratedPower;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getQuotaSerial() {
        return quotaSerial;
    }

    public void setQuotaSerial(String quotaSerial) {
        this.quotaSerial = quotaSerial;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
