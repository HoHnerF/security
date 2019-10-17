package com.ge.pojo;

public class tb_resource {
    private Integer id;

    private String resKey;

    private String resName;

    private Integer parentId;

    public tb_resource(Integer id, String resKey, String resName, Integer parentId) {
        this.id = id;
        this.resKey = resKey;
        this.resName = resName;
        this.parentId = parentId;
    }

    public tb_resource() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResKey() {
        return resKey;
    }

    public void setResKey(String resKey) {
        this.resKey = resKey == null ? null : resKey.trim();
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName == null ? null : resName.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}