package com.base.model;

public class UserRoleRelation {
    private String uuid;

    private String uUuid;

    private String rUuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getuUuid() {
        return uUuid;
    }

    public void setuUuid(String uUuid) {
        this.uUuid = uUuid == null ? null : uUuid.trim();
    }

    public String getrUuid() {
        return rUuid;
    }

    public void setrUuid(String rUuid) {
        this.rUuid = rUuid == null ? null : rUuid.trim();
    }
}