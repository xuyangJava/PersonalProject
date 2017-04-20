package com.sipingsoft.office.web.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class WmsOrderHead implements Serializable {

    private static final long serialVersionUID = 8578338971786381038L;
    @XStreamAlias("ORDERNO")
    private String orderNo;
    @XStreamAlias("SYSCODE")
    private String sysCode;
    @XStreamAlias("WAREHSENO")
    private String warehseNo;
    @XStreamAlias("BARCODE")
    private String barcode;
    @XStreamAlias("ASNSONO")
    private String asnsono;
    @XStreamAlias("ACCEPTDATE")
    private Date acceptDate;
    @XStreamAlias("ORDERSTATUS")
    private String orderStatus;
    @XStreamAlias("I_E_FLAG")
    private String ieFlag;
    @XStreamAlias("PIECES")
    private Double pieces;
    @XStreamAlias("GROSS_WEIGHT")
    private Double grossWgight;
    @XStreamAlias("WEIGHT")
    private Double weight;
    @XStreamAlias("VOLUME")
    private String volume;
    @XStreamAlias("TOTLMENOY")
    private String totalMenoy;
    @XStreamAlias("WARP_TYPE")
    private String warpType;
    @XStreamAlias("AMOUNT")
    private Double amount;
    @XStreamAlias("VERDOR")
    private String verdor;
    @XStreamAlias("TRAF_MODE")
    private String trafMode;
    @XStreamAlias("TRADE_COUNTRY")
    private String tradeCountry;
    @XStreamAlias("DISTINATE_PORT")
    private String distinatePort;
    @XStreamAlias("BILL1")
    private String bill1;
    @XStreamAlias("BILL2")
    private String bill2;
    @XStreamAlias("SERVICECODE")
    private String serviceCode;
    @XStreamAlias("DEC_TYPE")
    private String decType;
    @XStreamAlias("REMARK")
    private String remark;
    @XStreamAlias("TAX_NO")
    private String taxNo;
    @XStreamAlias("CLOSETIME")
    private Date closeTime;
    @XStreamAlias("DEC_STATUS")
    private String decStatus;
    @XStreamAlias("GJ_STATUS")
    private String gjStatus;
    @XStreamAlias("ISEXCELIMP")
    private String isExcelimp;
    @XStreamAlias("TRANS_MODE")
    private String transMode;
    @XStreamAlias("ADDWHO")
    private String addWho;
    @XStreamAlias("ADDTS")
    private String addts;
    @XStreamAlias("EDITWHO")
    private String editWho;
    @XStreamAlias("EDITTS")
    private String editts;
    @XStreamAlias("STATUS")
    private String status;
    @XStreamAlias("GATEJOB_NO")
    private String gatejobNo;
    @XStreamAlias("OPERTION_ID")
    private String opertionId;
    @XStreamAlias("INVOICE_NO")
    private String invoiceNo;
    @XStreamAlias("PRE_ARRIVAL_DATE")
    private String preArrivalDate;
    @XStreamAlias("ISTRANS")
    private String istrans;
    @XStreamAlias("VESSEL_NAME")
    private String vesselName;
    @XStreamAlias("VOYAGE")
    private String voyage;
    @XStreamAlias("IMPORT_DATE")
    private Date importDate;
    @XStreamAlias("IMPORT_STATE")
    private String importState;
    @XStreamAlias("RESULT")
    private String result;
    @XStreamAlias("SOURCE_TYPE")
    private String sourceType;
    @XStreamAlias("INPUT_ER")
    private String inputEr;
    @XStreamAlias("INPUT_DATE")
    private Date inputDate;
    @XStreamAlias("UPDATE_ER")
    private String updateEr;
    @XStreamAlias("UPDATE_DATE")
    private String updateDate;
    @XStreamAlias("INPUT_CODE")
    private String inputCode;
    @XStreamAlias("INPUT_NAME")
    private String inputName;
    @XStreamAlias("OP_CODE")
    private String opCode;
    @XStreamAlias("OP_CODE_NAME>")
    private String opCodeName;
    @XStreamAlias("IMPORT_STATE_NAME")
    private String importStateName;
    @XStreamAlias("TRADE_CODE")
    private String tradeCode;
    @XStreamAlias("TRADE_NAME")
    private String tradeName;
    @XStreamAlias("DL_CODE")
    private String dlCode;
    @XStreamAlias("DL_NAME")
    private String dlName;
    @XStreamAlias("OTHER_CODE")
    private String otherCode;
    @XStreamAlias("OTHER_NAME")
    private String otherName;
    @XStreamAlias("EMS_NO")
    private String emsNo;
    @XStreamAlias("CUSTOMS_CODE")
    private String customsCode;
    @XStreamAlias("REGION_CODE>")
    private String regionCode;
    @XStreamAlias("BIZ_TYPE")
    private String bizType;

    @XStreamImplicit
    @XStreamAlias("B2B_WMS_ORDER_DETAIL")
    private List<WmsOrderDetail> wmsOrderDetail;

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public void setWarehseNo(String warehseNo) {
        this.warehseNo = warehseNo;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setAsnsono(String asnsono) {
        this.asnsono = asnsono;
    }

    public void setAcceptDate(Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setIeFlag(String ieFlag) {
        this.ieFlag = ieFlag;
    }

    public void setPieces(Double pieces) {
        this.pieces = pieces;
    }

    public void setGrossWgight(Double grossWgight) {
        this.grossWgight = grossWgight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setTotalMenoy(String totalMenoy) {
        this.totalMenoy = totalMenoy;
    }

    public void setWarpType(String warpType) {
        this.warpType = warpType;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setVerdor(String verdor) {
        this.verdor = verdor;
    }

    public void setTrafMode(String trafMode) {
        this.trafMode = trafMode;
    }

    public void setTradeCountry(String tradeCountry) {
        this.tradeCountry = tradeCountry;
    }

    public void setDistinatePort(String distinatePort) {
        this.distinatePort = distinatePort;
    }

    public void setBill1(String bill1) {
        this.bill1 = bill1;
    }

    public void setBill2(String bill2) {
        this.bill2 = bill2;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public void setDecType(String decType) {
        this.decType = decType;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public void setDecStatus(String decStatus) {
        this.decStatus = decStatus;
    }

    public void setGjStatus(String gjStatus) {
        this.gjStatus = gjStatus;
    }

    public void setIsExcelimp(String isExcelimp) {
        this.isExcelimp = isExcelimp;
    }

    public void setTransMode(String transMode) {
        this.transMode = transMode;
    }

    public void setAddWho(String addWho) {
        this.addWho = addWho;
    }

    public void setAddts(String addts) {
        this.addts = addts;
    }

    public void setEditWho(String editWho) {
        this.editWho = editWho;
    }

    public void setEditts(String editts) {
        this.editts = editts;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setGatejobNo(String gatejobNo) {
        this.gatejobNo = gatejobNo;
    }

    public void setOpertionId(String opertionId) {
        this.opertionId = opertionId;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public void setPreArrivalDate(String preArrivalDate) {
        this.preArrivalDate = preArrivalDate;
    }

    public void setIstrans(String istrans) {
        this.istrans = istrans;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public void setVoyage(String voyage) {
        this.voyage = voyage;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public void setImportState(String importState) {
        this.importState = importState;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public void setInputEr(String inputEr) {
        this.inputEr = inputEr;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    public void setUpdateEr(String updateEr) {
        this.updateEr = updateEr;
    }

    public void setOpCode(String opCode) {
        this.opCode = opCode;
    }

    public void setOpCodeName(String opCodeName) {
        this.opCodeName = opCodeName;
    }

    public void setImportStateName(String importStateName) {
        this.importStateName = importStateName;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public void setDlCode(String dlCode) {
        this.dlCode = dlCode;
    }

    public void setDlName(String dlName) {
        this.dlName = dlName;
    }

    public void setOtherCode(String otherCode) {
        this.otherCode = otherCode;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public void setEmsNo(String emsNo) {
        this.emsNo = emsNo;
    }

    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
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

    public Double getPieces() {
        return pieces;
    }

    public Double getGrossWgight() {
        return grossWgight;
    }

    public Double getWeight() {
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

    public Double getAmount() {
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

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode;
    }

    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    public List<WmsOrderDetail> getWmsOrderDetail() {
        return wmsOrderDetail;
    }

    public void setWmsOrderDetail(List<WmsOrderDetail> wmsOrderDetail) {
        this.wmsOrderDetail = wmsOrderDetail;
    }

}
