package com.sipingsoft.office.web.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace="http://B2B_WMS_ORDER",name="B2B_WMS_ORDER")
public class B2BWmsOrder {

    private WmsOrderHead wmsOrderHead;

    public WmsOrderHead getWmsOrderHead() {
        return wmsOrderHead;
    }
    
    @XmlElement(name="B2B_WMS_ORDER_HEAD")
    public void setWmsOrderHead(WmsOrderHead wmsOrderHead) {
        this.wmsOrderHead = wmsOrderHead;
    }
}
