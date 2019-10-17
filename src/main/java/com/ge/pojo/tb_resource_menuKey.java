package com.ge.pojo;

public class tb_resource_menuKey {
    private Integer resourceId;

    private String menuId;

    public tb_resource_menuKey(Integer resourceId, String menuId) {
        this.resourceId = resourceId;
        this.menuId = menuId;
    }

    public tb_resource_menuKey() {
        super();
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }
}