package com.example.demo3h.model;

import java.util.Date;

public class Productdeal {
    private Integer productdealid;

    private Integer uid;

    private Integer proid;

    private Date dealtime;

    public Integer getProductdealid() {
        return productdealid;
    }

    public void setProductdealid(Integer productdealid) {
        this.productdealid = productdealid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public Date getDealtime() {
        return dealtime;
    }

    public void setDealtime(Date dealtime) {
        this.dealtime = dealtime;
    }
}