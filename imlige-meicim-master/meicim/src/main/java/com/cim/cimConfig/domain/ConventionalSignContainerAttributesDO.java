package com.cim.cimConfig.domain;

import java.io.Serializable;

public class ConventionalSignContainerAttributesDO implements Serializable {
	private static final long serialVersionUID = 1L;

	//
	private Integer serial;
	//
	private String drawingType;
	//
	private String signTypeAll;
	//
	private String signCaptionAll;
	//
	private String signWidth;
	//
	private String captionWidth;
	//
	private String widthStep;
	//
	private String heightStep;
	//
	private String domainWidth;
	//
	private String domainHeight;
	//
	private String originalPoint;
	//
	private String titleFormatName;
	//
	private String contentFormatName;

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

	public String getSignTypeAll() {
		return signTypeAll;
	}

	public void setSignTypeAll(String signTypeAll) {
		this.signTypeAll = signTypeAll;
	}

	public String getSignCaptionAll() {
		return signCaptionAll;
	}

	public void setSignCaptionAll(String signCaptionAll) {
		this.signCaptionAll = signCaptionAll;
	}

	public String getSignWidth() {
		return signWidth;
	}

	public void setSignWidth(String signWidth) {
		this.signWidth = signWidth;
	}

	public String getCaptionWidth() {
		return captionWidth;
	}

	public void setCaptionWidth(String captionWidth) {
		this.captionWidth = captionWidth;
	}

	public String getWidthStep() {
		return widthStep;
	}

	public void setWidthStep(String widthStep) {
		this.widthStep = widthStep;
	}

	public String getHeightStep() {
		return heightStep;
	}

	public void setHeightStep(String heightStep) {
		this.heightStep = heightStep;
	}

	public String getDomainWidth() {
		return domainWidth;
	}

	public void setDomainWidth(String domainWidth) {
		this.domainWidth = domainWidth;
	}

	public String getDomainHeight() {
		return domainHeight;
	}

	public void setDomainHeight(String domainHeight) {
		this.domainHeight = domainHeight;
	}

	public String getOriginalPoint() {
		return originalPoint;
	}

	public void setOriginalPoint(String originalPoint) {
		this.originalPoint = originalPoint;
	}

	public String getTitleFormatName() {
		return titleFormatName;
	}

	public void setTitleFormatName(String titleFormatName) {
		this.titleFormatName = titleFormatName;
	}

	public String getContentFormatName() {
		return contentFormatName;
	}

	public void setContentFormatName(String contentFormatName) {
		this.contentFormatName = contentFormatName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
