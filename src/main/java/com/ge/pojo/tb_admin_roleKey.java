package com.ge.pojo;

public class tb_admin_roleKey {
    private Integer adminId;

    private Integer roleId;

    public tb_admin_roleKey(Integer adminId, Integer roleId) {
        this.adminId = adminId;
        this.roleId = roleId;
    }

    public tb_admin_roleKey() {
        super();
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}