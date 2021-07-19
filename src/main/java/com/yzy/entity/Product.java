package com.yzy.entity;

import java.math.BigDecimal;

public class Product {
    private Integer pid;
    private String pname;
    private BigDecimal pprice;
    private Integer pquantity;
    private Integer ppublisherid;
    private String pdescription;
    private String ptype;

    public Product() {
    }

    public Product(Integer pid, String pname, BigDecimal pprice, Integer pquantity, Integer ppublisherid, String pdescription, String ptype) {
        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;
        this.pquantity = pquantity;
        this.ppublisherid = ppublisherid;
        this.pdescription = pdescription;
        this.ptype = ptype;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public BigDecimal getPprice() {
        return pprice;
    }

    public void setPprice(BigDecimal pprice) {
        this.pprice = pprice;
    }

    public Integer getPquantity() {
        return pquantity;
    }

    public void setPquantity(Integer pquantity) {
        this.pquantity = pquantity;
    }

    public Integer getPpublisherid() {
        return ppublisherid;
    }

    public void setPpublisherid(Integer ppublisherid) {
        this.ppublisherid = ppublisherid;
    }

    public String getPdescription() {
        return pdescription;
    }

    public void setPdescription(String pdescription) {
        this.pdescription = pdescription;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }
}
