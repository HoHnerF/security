package com.ge.pojo;

public class tb_admin {
    private Integer id;

    private String loginName;

    private String password;

    private String status;

    public tb_admin(Integer id, String loginName, String password, String status) {
        this.id = id;
        this.loginName = loginName;
        this.password = password;
        this.status = status;
    }

    public tb_admin() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}