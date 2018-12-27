package com.example.demo3h.model;

public class RecruitType {
    private Integer rtid;

    private String rtname;

    public Integer getRtid() {
        return rtid;
    }

    public void setRtid(Integer rtid) {
        this.rtid = rtid;
    }

    public String getRtname() {
        return rtname;
    }

    public void setRtname(String rtname) {
        this.rtname = rtname == null ? null : rtname.trim();
    }
}