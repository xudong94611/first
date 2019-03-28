package com.cim.cimConfig.domain;

import java.io.Serializable;

public class CableTrayAttributesDO implements Serializable {
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
	private String depth;
	//
	private String edgeDepth;
	//
	private String edgeHeight;
	//
	private String railDepth;
	//
	private String railHeight;
	//
	private String railDistance;
	//
	private String myMaterial;
	//
	private String railMaterial;
	//
	private String tunnelCount;

	public Integer getSerial() {
		return serial;
	}

	public void setSerial(Integer serial) {
		this.serial = serial;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
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

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getDepth() {
		return depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
	}

	public String getEdgeDepth() {
		return edgeDepth;
	}

	public void setEdgeDepth(String edgeDepth) {
		this.edgeDepth = edgeDepth;
	}

	public String getEdgeHeight() {
		return edgeHeight;
	}

	public void setEdgeHeight(String edgeHeight) {
		this.edgeHeight = edgeHeight;
	}

	public String getRailDepth() {
		return railDepth;
	}

	public void setRailDepth(String railDepth) {
		this.railDepth = railDepth;
	}

	public String getRailHeight() {
		return railHeight;
	}

	public void setRailHeight(String railHeight) {
		this.railHeight = railHeight;
	}

	public String getRailDistance() {
		return railDistance;
	}

	public void setRailDistance(String railDistance) {
		this.railDistance = railDistance;
	}

	public String getMyMaterial() {
		return myMaterial;
	}

	public void setMyMaterial(String myMaterial) {
		this.myMaterial = myMaterial;
	}

	public String getRailMaterial() {
		return railMaterial;
	}

	public void setRailMaterial(String railMaterial) {
		this.railMaterial = railMaterial;
	}

	public String getTunnelCount() {
		return tunnelCount;
	}

	public void setTunnelCount(String tunnelCount) {
		this.tunnelCount = tunnelCount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
