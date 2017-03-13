package com.sipingsoft.office.web.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace="http://B2B_WMS_ORDER",name="B2B_WMS_ORDER")
public class XmlBean implements Serializable {

    private static final long serialVersionUID = 5016733397986386514L;
    private String name;
    private String value;
    public String getName() {
        return name;
    }
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }
    public String getValue() {
        return value;
    }
    @XmlElement
    public void setValue(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "XmlBean [name=" + name + ", value=" + value + "]";
    }
    
}
