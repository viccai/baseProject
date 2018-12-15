package com.base.model;

public class MRole {
    private String uuid;

    private String rName;

    private String rType;

    private String rDatalevel;

    private String rRemark;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public String getrType() {
        return rType;
    }

    public void setrType(String rType) {
        this.rType = rType == null ? null : rType.trim();
    }

    public String getrDatalevel() {
        return rDatalevel;
    }

    public void setrDatalevel(String rDatalevel) {
        this.rDatalevel = rDatalevel == null ? null : rDatalevel.trim();
    }

    public String getrRemark() {
        return rRemark;
    }

    public void setrRemark(String rRemark) {
        this.rRemark = rRemark == null ? null : rRemark.trim();
    }
}