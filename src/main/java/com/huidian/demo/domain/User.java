package com.huidian.demo.domain;


import javax.persistence.Entity;

public class User{
    private Integer uid;
    private  String uusername;
    private String upassword;

    public User(Integer uid, String uusername, String upassword) {
        this.uid = uid;
        this.uusername = uusername;
        this.upassword = upassword;
    }

    public User() {
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUusername() {
        return uusername;
    }

    public void setUusername(String uusername) {
        this.uusername = uusername;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uusername='" + uusername + '\'' +
                ", upassword='" + upassword + '\'' +
                '}';
    }
}
