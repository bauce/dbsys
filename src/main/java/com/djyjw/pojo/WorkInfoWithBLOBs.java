package com.djyjw.pojo;

public class WorkInfoWithBLOBs extends WorkInfo {
    private String info;

    private String lcomment;

    private String ocomment;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getLcomment() {
        return lcomment;
    }

    public void setLcomment(String lcomment) {
        this.lcomment = lcomment == null ? null : lcomment.trim();
    }

    public String getOcomment() {
        return ocomment;
    }

    public void setOcomment(String ocomment) {
        this.ocomment = ocomment == null ? null : ocomment.trim();
    }
}