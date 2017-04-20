package com.sipingsoft.office.web.entity;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("B2B_WMS_ORDER")
public class WmsOrderDetail implements Serializable {
    
    private static final long serialVersionUID = -3336507166305728394L;
    
    @XStreamAlias("GUID")
    private String guid;
    
    @XStreamAlias("ORDERNO")
    private String orderNo;
    
    @XStreamAlias("LINENUMBER")
    private Integer lineNumber;
    
    @XStreamAlias("SKU")
    private String sku;
    
    @XStreamAlias("SKUNAME")
    private String skuName;
    
    @XStreamAlias("PACKCODE")
    private String packcode;
    
    @XStreamAlias("AMOUNT")
    private Double amount;
    
    @XStreamAlias("UNITPRICE")
    private Double unitprice;
    
    @XStreamAlias("COUNTRY")
    private String country;
    
    @XStreamAlias("GROSS_WEIGHT")
    private Double grossWeight;
    
    @XStreamAlias("WEIGHT")
    private Double weight;
    
    @XStreamAlias("VOLUME")
    private String volume;
    
    @XStreamAlias("CONSIGNEE")
    private String consignee;
    
    @XStreamAlias("THIRDPARTY")
    private String thirdParty;
    
    @XStreamAlias("REMARK")
    private String remark;
    
    @XStreamAlias("CURRENCY")
    private String currency;
    
    @XStreamAlias("MONEY")
    private Double money;
    
    public String getGuid() {
        return guid;
    }
    public void setGuid(String guid) {
        this.guid = guid;
    }
    public String getOrderNo() {
        return orderNo;
    }
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
    public Integer getLineNumber() {
        return lineNumber;
    }
    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }
    public String getSku() {
        return sku;
    }
    public void setSku(String sku) {
        this.sku = sku;
    }
    public String getSkuName() {
        return skuName;
    }
    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }
    public String getPackcode() {
        return packcode;
    }
    public void setPackcode(String packcode) {
        this.packcode = packcode;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public Double getUnitprice() {
        return unitprice;
    }
    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public Double getGrossWeight() {
        return grossWeight;
    }
    public void setGrossWeight(Double grossWeight) {
        this.grossWeight = grossWeight;
    }
    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public String getVolume() {
        return volume;
    }
    public void setVolume(String volume) {
        this.volume = volume;
    }
    public String getConsignee() {
        return consignee;
    }
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }
    public String getThirdParty() {
        return thirdParty;
    }
    public void setThirdParty(String thirdParty) {
        this.thirdParty = thirdParty;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public Double getMoney() {
        return money;
    }
    public void setMoney(Double money) {
        this.money = money;
    }
}
