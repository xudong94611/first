package com.cim.cimConfig.domain;

import java.io.Serializable;

public class CaptionArrayDefinitionDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Integer serial;
    //
    private String drawingType;
    //
    private String projectManager;
    //
    private String majorManager;
    //
    private String designer;
    //
    private String proofreader;
    //
    private String approver;
    //
    private String lengthUnit;
    //
    private String scaling;
    //
    private String date;
    //
    private String drawingName;
    //
    private String drawingIdentifier;
    //
    private String end;
	public Integer getSerial() {
		return serial;
	}
	public void setSerial(Integer serial) {
		this.serial = serial;
	}
	public String getDrawingType() {
		return drawingType;
	}
	public void setDrawingType(String drawingType) {
		this.drawingType = drawingType;
	}
	public String getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}
	public String getMajorManager() {
		return majorManager;
	}
	public void setMajorManager(String majorManager) {
		this.majorManager = majorManager;
	}
	public String getDesigner() {
		return designer;
	}
	public void setDesigner(String designer) {
		this.designer = designer;
	}
	public String getProofreader() {
		return proofreader;
	}
	public void setProofreader(String proofreader) {
		this.proofreader = proofreader;
	}
	public String getApprover() {
		return approver;
	}
	public void setApprover(String approver) {
		this.approver = approver;
	}
	public String getLengthUnit() {
		return lengthUnit;
	}
	public void setLengthUnit(String lengthUnit) {
		this.lengthUnit = lengthUnit;
	}
	public String getScaling() {
		return scaling;
	}
	public void setScaling(String scaling) {
		this.scaling = scaling;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDrawingName() {
		return drawingName;
	}
	public void setDrawingName(String drawingName) {
		this.drawingName = drawingName;
	}
	public String getDrawingIdentifier() {
		return drawingIdentifier;
	}
	public void setDrawingIdentifier(String drawingIdentifier) {
		this.drawingIdentifier = drawingIdentifier;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
