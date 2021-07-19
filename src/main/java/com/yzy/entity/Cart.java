package com.yzy.entity;

import java.math.BigDecimal;
import java.util.List;

public class Cart {
    private Integer cid;
    private String cname;
    private BigDecimal cprice;
    private Integer cquantity;
//    private BigDecimal ctotalprice;
    private Integer uid;

    private Integer productMax;



    public Cart() {

    }

    public Cart(Integer cid, String cname, BigDecimal cprice, Integer cquantity, Integer uid, Integer productMax) {
        this.cid = cid;
        this.cname = cname;
        this.cprice = cprice;
        this.cquantity = cquantity;
//        this.ctotalprice = ctotalprice;
        this.uid = uid;
        this.productMax = productMax;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public BigDecimal getCprice() {
        return cprice;
    }

    public void setCprice(BigDecimal cprice) {
        this.cprice = cprice;
    }

    public Integer getCquantity() {
        return cquantity;
    }

    public void setCquantity(Integer cquantity) {
        this.cquantity = cquantity;
    }

//    public BigDecimal getCtotalprice() {
//        return ctotalprice;
//    }
//
//    public void setCtotoalprice(BigDecimal ctotalprice) {
//        this.ctotalprice = ctotalprice;
//    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getProductMax() {
        return productMax;
    }

    public void setProductMax(Integer productMax) {
        this.productMax = productMax;
    }


}
