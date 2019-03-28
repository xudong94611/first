package com.cim.cimConfig.domain;

import java.io.Serializable;

public class CableDefinitionsDO implements Serializable {
	private static final long serialVersionUID = 1L;

	//
	private Integer serial;
	//
	private String modelNumber;
	//
	private String type;
	//
	private String abbreviation;
	//
	private String description;
	//
	private String texture;
	//
	private String color;
	//
	private String minTurningRadius;
	//
	private String crossShapeType;
	//
	private String sideLengthArray;
	//
	private String coreArray;
	//
	private String coreCrossSectionAreas;
	//
	private String jointModels;
	//
	private String centerLocations;
	//
	private String width;
	//
	private String unitName;

	public Integer getSerial() {
		return serial;
	}

	public void setSerial(Integer serial) {
		this.serial = serial;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMinTurningRadius() {
		return minTurningRadius;
	}

	public void setMinTurningRadius(String minTurningRadius) {
		this.minTurningRadius = minTurningRadius;
	}

	public String getCrossShapeType() {
		return crossShapeType;
	}

	public void setCrossShapeType(String crossShapeType) {
		this.crossShapeType = crossShapeType;
	}

	public String getSideLengthArray() {
		return sideLengthArray;
	}

	public void setSideLengthArray(String sideLengthArray) {
		this.sideLengthArray = sideLengthArray;
	}

	public String getCoreArray() {
		return coreArray;
	}

	public void setCoreArray(String coreArray) {
		this.coreArray = coreArray;
	}

	public String getCoreCrossSectionAreas() {
		return coreCrossSectionAreas;
	}

	public void setCoreCrossSectionAreas(String coreCrossSectionAreas) {
		this.coreCrossSectionAreas = coreCrossSectionAreas;
	}

	public String getJointModels() {
		return jointModels;
	}

	public void setJointModels(String jointModels) {
		this.jointModels = jointModels;
	}

	public String getCenterLocations() {
		return centerLocations;
	}

	public void setCenterLocations(String centerLocations) {
		this.centerLocations = centerLocations;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
