package com.ge.pojo;

public class tb_role {
    private Integer id;

    private String name;

    public tb_role(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public tb_role() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}