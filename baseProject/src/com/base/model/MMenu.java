package com.base.model;

public class MMenu {
    private String uuid;

    private String mName;

    private String mType;

    private String mUrl;

    private String mHaveChild;

    private String mPid;

    private String mDatalevel;

    private Integer mSn;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType == null ? null : mType.trim();
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl == null ? null : mUrl.trim();
    }

    public String getmHaveChild() {
        return mHaveChild;
    }

    public void setmHaveChild(String mHaveChild) {
        this.mHaveChild = mHaveChild == null ? null : mHaveChild.trim();
    }

    public String getmPid() {
        return mPid;
    }

    public void setmPid(String mPid) {
        this.mPid = mPid == null ? null : mPid.trim();
    }

    public String getmDatalevel() {
        return mDatalevel;
    }

    public void setmDatalevel(String mDatalevel) {
        this.mDatalevel = mDatalevel == null ? null : mDatalevel.trim();
    }

    public Integer getmSn() {
        return mSn;
    }

    public void setmSn(Integer mSn) {
        this.mSn = mSn;
    }
}