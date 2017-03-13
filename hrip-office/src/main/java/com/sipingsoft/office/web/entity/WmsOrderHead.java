package com.sipingsoft.office.web.entity;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

public class WmsOrderHead implements Serializable {

    private static final long serialVersionUID = 8578338971786381038L;
    private String orderNo;
    private String sysCode;
    private String warehseNo;
    private String barcode;
    private String asnsono;
    private Date acceptDate;
    private String orderStatus;
    private String ieFlag;
    private String pieces;
    private String grossWgight;
    private String weight;
    private String volume;
    private String totalMenoy;
    private String warpType;
    private String amount;
    private String verdor;
    private String trafMode;
    private String tradeCountry;
    private String distinatePort;
    private String bill1;
    private String bill2;
    private String serviceCode;
    private String decType;
    private String remark;
    private String taxNo;
    private Date closeTime;
    private String decStatus;
    private String gjStatus;
    private String isExcelimp;
    private String transMode;
    private String addWho;
    private String addts;
    private String editWho;
    private String editts;
    private String status;
    private String gatejobNo;
    private String opertionId;
    private String invoiceNo;
    private String preArrivalDate;
    private String istrans;
    private String vesselName;
    private String voyage;
    private Date importDate;
    private String importState;
    private String result;
    private String sourceType;
    private String inputEr;
    private Date inputDate;
    private String updateEr;
    private String opCode;
    private String opCodeName;
    private String importStateName;
    private String tradeCode;
    private String tradeName;
    private String dlCode;
    private String dlName;
    private String otherCode;
    private String otherName;
    private String emsNo;
    private String customsCode;
    private String regionCode;
    private String bizType;
    private WmsOrderDetail wmsOrderDetail;
    
    @XmlElement(name="ORDERNO")
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
    @XmlElement(name="SYSCODE")
    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }
    @XmlElement(name="WAREHSENO")
    public void setWarehseNo(String warehseNo) {
        this.warehseNo = warehseNo;
    }
    @XmlElement(name="BARCODE")
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
    @XmlElement(name="ASNSONO")
    public void setAsnsono(String asnsono) {
        this.asnsono = asnsono;
    }
    @XmlElement(name="ACCEPTDATE")
    public void setAcceptDate(Date acceptDate) {
        this.acceptDate = acceptDate;
    }
    @XmlElement(name="ORDERSTATUS")
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    @XmlElement(name="I_E_FLAG")
    public void setIeFlag(String ieFlag) {
        this.ieFlag = ieFlag;
    }
    @XmlElement(name="PIECES")
    public void setPieces(String pieces) {
        this.pieces = pieces;
    }
    @XmlElement(name="GROSS_WEIGHT")
    public void setGrossWgight(String grossWgight) {
        this.grossWgight = grossWgight;
    }
    @XmlElement(name="WEIGHT")
    public void setWeight(String weight) {
        this.weight = weight;
    }
    @XmlElement(name="VOLUME")
    public void setVolume(String volume) {
        this.volume = volume;
    }
    @XmlElement(name="TOTALMENOY")
    public void setTotalMenoy(String totalMenoy) {
        this.totalMenoy = totalMenoy;
    }
    @XmlElement(name="WARP_TYPE")
    public void setWarpType(String warpType) {
        this.warpType = warpType;
    }
    @XmlElement(name="AMOUNT")
    public void setAmount(String amount) {
        this.amount = amount;
    }
    @XmlElement(name="VERDOR")
    public void setVerdor(String verdor) {
        this.verdor = verdor;
    }
    @XmlElement(name="TRAF_MODE")
    public void setTrafMode(String trafMode) {
        this.trafMode = trafMode;
    }
    @XmlElement(name="TRADE_COUNTRY")
    public void setTradeCountry(String tradeCountry) {
        this.tradeCountry = tradeCountry;
    }
    @XmlElement(name="DISTINATE_PORT")
    public void setDistinatePort(String distinatePort) {
        this.distinatePort = distinatePort;
    }
    @XmlElement(name="BILL1")
    public void setBill1(String bill1) {
        this.bill1 = bill1;
    }
    @XmlElement(name="BILL2")
    public void setBill2(String bill2) {
        this.bill2 = bill2;
    }
    @XmlElement(name="SERVICECODE")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }
    @XmlElement(name="DEC_TYPE")
    public void setDecType(String decType) {
        this.decType = decType;
    }
    @XmlElement(name="REMARK")
    public void setRemark(String remark) {
        this.remark = remark;
    }
    @XmlElement(name="TAX_NO")
    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }
    @XmlElement(name="CLOSETIME")
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }
    @XmlElement(name="DEC_STATUS")
    public void setDecStatus(String decStatus) {
        this.decStatus = decStatus;
    }
    @XmlElement(name="GJ_STATUS")
    public void setGjStatus(String gjStatus) {
        this.gjStatus = gjStatus;
    }
    @XmlElement(name="ISEXCELIMP")
    public void setIsExcelimp(String isExcelimp) {
        this.isExcelimp = isExcelimp;
    }
    @XmlElement(name="TRANS_MODE")
    public void setTransMode(String transMode) {
        this.transMode = transMode;
    }
    @XmlElement(name="ADDWHO")
    public void setAddWho(String addWho) {
        this.addWho = addWho;
    }
    @XmlElement(name="ADDTS")
    public void setAddts(String addts) {
        this.addts = addts;
    }
    @XmlElement(name="EDITWHO")
    public void setEditWho(String editWho) {
        this.editWho = editWho;
    }
    @XmlElement(name="EDITTS")
    public void setEditts(String editts) {
        this.editts = editts;
    }
    @XmlElement(name="STATUS")
    public void setStatus(String status) {
        this.status = status;
    }
    @XmlElement(name="GATEJOB_NO")
    public void setGatejobNo(String gatejobNo) {
        this.gatejobNo = gatejobNo;
    }
    @XmlElement(name="OPERTION_ID")
    public void setOpertionId(String opertionId) {
        this.opertionId = opertionId;
    }
    @XmlElement(name="INVOICE_NO")
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }
    @XmlElement(name="PRE_ARRIVAL_DATE")
    public void setPreArrivalDate(String preArrivalDate) {
        this.preArrivalDate = preArrivalDate;
    }
    @XmlElement(name="ISTRANS")
    public void setIstrans(String istrans) {
        this.istrans = istrans;
    }
    @XmlElement(name="VESSEL_NAME")
    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }
    @XmlElement(name="VOYAGE")
    public void setVoyage(String voyage) {
        this.voyage = voyage;
    }
    @XmlElement(name="IMPORT_DATE")
    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }
    @XmlElement(name="IMPORT_STATE")
    public void setImportState(String importState) {
        this.importState = importState;
    }
    @XmlElement(name="RESULT")
    public void setResult(String result) {
        this.result = result;
    }
    @XmlElement(name="SOURCE_TYPE")
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
    @XmlElement(name="INPUT_ER")
    public void setInputEr(String inputEr) {
        this.inputEr = inputEr;
    }
    @XmlElement(name="INPUT_DATE")
    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }
    @XmlElement(name="UPDATE_ER")
    public void setUpdateEr(String updateEr) {
        this.updateEr = updateEr;
    }
    @XmlElement(name="OP_CODE")
    public void setOpCode(String opCode) {
        this.opCode = opCode;
    }
    @XmlElement(name="OP_CODE_NAME")
    public void setOpCodeName(String opCodeName) {
        this.opCodeName = opCodeName;
    }
    @XmlElement(name="IMPORT_STATE_NAME")
    public void setImportStateName(String importStateName) {
        this.importStateName = importStateName;
    }
    @XmlElement(name="TRADE_CODE")
    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }
    @XmlElement(name="TRADE_NAME")
    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }
    @XmlElement(name="DL_CODE")
    public void setDlCode(String dlCode) {
        this.dlCode = dlCode;
    }
    @XmlElement(name="DL_NAME")
    public void setDlName(String dlName) {
        this.dlName = dlName;
    }
    @XmlElement(name="OTHER_CODE")
    public void setOtherCode(String otherCode) {
        this.otherCode = otherCode;
    }
    @XmlElement(name="OTHER_NAME")
    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }
    @XmlElement(name="EMS_NO")
    public void setEmsNo(String emsNo) {
        this.emsNo = emsNo;
    }
    @XmlElement(name="CUSTOMS_CODE")
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }
    @XmlElement(name="REGION_CODE")
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }
    @XmlElement(name="BIZ_TYPE")
    public void setBizType(String bizType) {
        this.bizType = bizType;
    }
    @XmlElement(name="B2B_WMS_ORDER_DETAIL")
    public void setWmsOrderDetail(WmsOrderDetail wmsOrderDetail) {
        this.wmsOrderDetail = wmsOrderDetail;
    }
    
    public String getOrderNo() {
        return orderNo;
    }
    public String getSysCode() {
        return sysCode;
    }
    public String getWarehseNo() {
        return warehseNo;
    }
    public String getBarcode() {
        return barcode;
    }
    public String getAsnsono() {
        return asnsono;
    }
    public Date getAcceptDate() {
        return acceptDate;
    }
    public String getOrderStatus() {
        return orderStatus;
    }
    public String getIeFlag() {
        return ieFlag;
    }
    public String getPieces() {
        return pieces;
    }
    public String getGrossWgight() {
        return grossWgight;
    }
    public String getWeight() {
        return weight;
    }
    public String getVolume() {
        return volume;
    }
    public String getTotalMenoy() {
        return totalMenoy;
    }
    public String getWarpType() {
        return warpType;
    }
    public String getAmount() {
        return amount;
    }
    public String getVerdor() {
        return verdor;
    }
    public String getTrafMode() {
        return trafMode;
    }
    public String getTradeCountry() {
        return tradeCountry;
    }
    public String getDistinatePort() {
        return distinatePort;
    }
    public String getBill1() {
        return bill1;
    }
    public String getBill2() {
        return bill2;
    }
    public String getServiceCode() {
        return serviceCode;
    }
    public String getDecType() {
        return decType;
    }
    public String getRemark() {
        return remark;
    }
    public String getTaxNo() {
        return taxNo;
    }
    public Date getCloseTime() {
        return closeTime;
    }
    public String getDecStatus() {
        return decStatus;
    }
    public String getGjStatus() {
        return gjStatus;
    }
    public String getIsExcelimp() {
        return isExcelimp;
    }
    public String getTransMode() {
        return transMode;
    }
    public String getAddWho() {
        return addWho;
    }
    public String getAddts() {
        return addts;
    }
    public String getEditWho() {
        return editWho;
    }
    public String getEditts() {
        return editts;
    }
    public String getStatus() {
        return status;
    }
    public String getGatejobNo() {
        return gatejobNo;
    }
    public String getOpertionId() {
        return opertionId;
    }
    public String getInvoiceNo() {
        return invoiceNo;
    }
    public String getPreArrivalDate() {
        return preArrivalDate;
    }
    public String getIstrans() {
        return istrans;
    }
    public String getVesselName() {
        return vesselName;
    }
    public String getVoyage() {
        return voyage;
    }
    public Date getImportDate() {
        return importDate;
    }
    public String getImportState() {
        return importState;
    }
    public String getResult() {
        return result;
    }
    public String getSourceType() {
        return sourceType;
    }
    public String getInputEr() {
        return inputEr;
    }
    public Date getInputDate() {
        return inputDate;
    }
    public String getUpdateEr() {
        return updateEr;
    }
    public String getOpCode() {
        return opCode;
    }
    public String getOpCodeName() {
        return opCodeName;
    }
    public String getImportStateName() {
        return importStateName;
    }
    public String getTradeCode() {
        return tradeCode;
    }
    public String getTradeName() {
        return tradeName;
    }
    public String getDlCode() {
        return dlCode;
    }
    public String getDlName() {
        return dlName;
    }
    public String getOtherCode() {
        return otherCode;
    }
    public String getOtherName() {
        return otherName;
    }
    public String getEmsNo() {
        return emsNo;
    }
    public String getCustomsCode() {
        return customsCode;
    }
    public String getRegionCode() {
        return regionCode;
    }
    public String getBizType() {
        return bizType;
    }
    public WmsOrderDetail getWmsOrderDetail() {
        return wmsOrderDetail;
    }
}
