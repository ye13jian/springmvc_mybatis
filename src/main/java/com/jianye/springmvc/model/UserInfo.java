package com.jianye.springmvc.model;

public class UserInfo {
    private Integer id;

    private String uname;

    private Integer unumer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public Integer getUnumer() {
        return unumer;
    }

    public void setUnumer(Integer unumer) {
        this.unumer = unumer;
    }
}