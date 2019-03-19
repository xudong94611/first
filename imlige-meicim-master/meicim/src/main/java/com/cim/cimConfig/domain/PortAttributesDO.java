package com.cim.cimConfig.domain;

import java.io.Serializable;

public class PortAttributesDO implements Serializable {
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
    private String faceDepth;
    //
    private String inOrOut;

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

    public String getFaceDepth() {
        return faceDepth;
    }

    public void setFaceDepth(String faceDepth) {
        this.faceDepth = faceDepth;
    }

    public String getInOrOut() {
        return inOrOut;
    }

    public void setInOrOut(String inOrOut) {
        this.inOrOut = inOrOut;
    }
}
