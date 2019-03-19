package com.cim.cim.domain;

import java.io.Serializable;

public class CheckInDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Integer userId;
    //
    private String username;
    //
    private String password;
    //
    private String hardcode;
    //
    private String chsName;
    //
    private String checkers;
    //
    private Long loginCount;
    //
    private String part;
    //
    private String version;

    /**
     * 设置：
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取：
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置：
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取：
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置：
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取：
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置：
     */
    public void setHardcode(String hardcode) {
        this.hardcode = hardcode;
    }

    /**
     * 获取：
     */
    public String getHardcode() {
        return hardcode;
    }

    /**
     * 设置：
     */
    public void setChsName(String chsName) {
        this.chsName = chsName;
    }

    /**
     * 获取：
     */
    public String getChsName() {
        return chsName;
    }

    /**
     * 设置：
     */
    public void setCheckers(String checkers) {
        this.checkers = checkers;
    }

    /**
     * 获取：
     */
    public String getCheckers() {
        return checkers;
    }

    /**
     * 设置：
     */
    public void setLoginCount(Long loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * 获取：
     */
    public Long getLoginCount() {
        return loginCount;
    }

    /**
     * 设置：
     */
    public void setPart(String part) {
        this.part = part;
    }

    /**
     * 获取：
     */
    public String getPart() {
        return part;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
