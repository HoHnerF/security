package com.ge.pojo;

public class tb_role_resourceKey {
    private Integer roleId;

    private Integer resourceId;

    public tb_role_resourceKey(Integer roleId, Integer resourceId) {
        this.roleId = roleId;
        this.resourceId = resourceId;
    }

    public tb_role_resourceKey() {
        super();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }
}