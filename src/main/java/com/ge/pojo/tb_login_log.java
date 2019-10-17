package com.ge.pojo;

import java.util.Date;

public class tb_login_log {
    private Integer id;

    private String loginName;

    private String ip;

    private String browserName;

    private String location;

    private Date loginTime;

    public tb_login_log(Integer id, String loginName, String ip, String browserName, String location, Date loginTime) {
        this.id = id;
        this.loginName = loginName;
        this.ip = ip;
        this.browserName = browserName;
        this.location = location;
        this.loginTime = loginTime;
    }

    public tb_login_log() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName == null ? null : browserName.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}