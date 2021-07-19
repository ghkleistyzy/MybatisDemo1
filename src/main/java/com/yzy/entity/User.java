package com.yzy.entity;

public class User {
    private Integer uid;
    private String uname;
    private String uaddress;
    private String uphone;

    public User() {
    }

    public User(Integer uid, String uname, String uaddress, String uphone) {
        this.uid = uid;
        this.uname = uname;
        this.uaddress = uaddress;
        this.uphone = uphone;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }
}
