package com.cim.cimConfig.domain;

import java.io.Serializable;

public class ConstDO implements Serializable {
	private static final long serialVersionUID = 1L;

	//
	private Integer serial;
	//
	private String string;
	//
	private String value;
	public Integer getSerial() {
		return serial;
	}
	public void setSerial(Integer serial) {
		this.serial = serial;
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
