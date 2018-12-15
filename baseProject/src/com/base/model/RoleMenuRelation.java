package com.base.model;

public class RoleMenuRelation {
    private String uuid;

    private String rUuid;

    private String mUuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getrUuid() {
        return rUuid;
    }

    public void setrUuid(String rUuid) {
        this.rUuid = rUuid == null ? null : rUuid.trim();
    }

    public String getmUuid() {
        return mUuid;
    }

    public void setmUuid(String mUuid) {
        this.mUuid = mUuid == null ? null : mUuid.trim();
    }
}