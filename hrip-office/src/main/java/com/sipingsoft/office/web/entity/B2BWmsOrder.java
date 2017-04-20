package com.sipingsoft.office.web.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("B2B_WMS_ORDER")
public class B2BWmsOrder {

    @XStreamAlias("B2B_WMS_ORDER_HEAD")
    private WmsOrderHead wmsOrderHead;

    public WmsOrderHead getWmsOrderHead() {
        return wmsOrderHead;
    }

    public void setWmsOrderHead(WmsOrderHead wmsOrderHead) {
        this.wmsOrderHead = wmsOrderHead;
    }
}
