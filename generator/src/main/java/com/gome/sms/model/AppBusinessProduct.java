package com.gome.sms.model;

import java.util.Date;

public class AppBusinessProduct {
    private String serno;

    private String customerApplyCode;

    private String merId;

    private String isAddInfo;

    private String merName;

    private String productType;

    private String status;

    private String orderMoney;

    private Date crtDate;

    private Date mdfDate;

    private String crtUser;

    private String mdfUser;

    private String term;

    private String dataFlag;

    private String isAdd;

    public String getSerno() {
        return serno;
    }

    public void setSerno(String serno) {
        this.serno = serno == null ? null : serno.trim();
    }

    public String getCustomerApplyCode() {
        return customerApplyCode;
    }

    public void setCustomerApplyCode(String customerApplyCode) {
        this.customerApplyCode = customerApplyCode == null ? null : customerApplyCode.trim();
    }

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId == null ? null : merId.trim();
    }

    public String getIsAddInfo() {
        return isAddInfo;
    }

    public void setIsAddInfo(String isAddInfo) {
        this.isAddInfo = isAddInfo == null ? null : isAddInfo.trim();
    }

    public String getMerName() {
        return merName;
    }

    public void setMerName(String merName) {
        this.merName = merName == null ? null : merName.trim();
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(String orderMoney) {
        this.orderMoney = orderMoney == null ? null : orderMoney.trim();
    }

    public Date getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(Date crtDate) {
        this.crtDate = crtDate;
    }

    public Date getMdfDate() {
        return mdfDate;
    }

    public void setMdfDate(Date mdfDate) {
        this.mdfDate = mdfDate;
    }

    public String getCrtUser() {
        return crtUser;
    }

    public void setCrtUser(String crtUser) {
        this.crtUser = crtUser == null ? null : crtUser.trim();
    }

    public String getMdfUser() {
        return mdfUser;
    }

    public void setMdfUser(String mdfUser) {
        this.mdfUser = mdfUser == null ? null : mdfUser.trim();
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }

    public String getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(String dataFlag) {
        this.dataFlag = dataFlag == null ? null : dataFlag.trim();
    }

    public String getIsAdd() {
        return isAdd;
    }

    public void setIsAdd(String isAdd) {
        this.isAdd = isAdd == null ? null : isAdd.trim();
    }
}