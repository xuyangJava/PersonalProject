package com.sipingsoft.office.core.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.sipingsoft.office.web.entity.B2BWmsOrder;
import com.sipingsoft.office.web.entity.WmsOrderHead;
import com.sipingsoft.office.web.entity.XmlBean;

public class BeanToXmlDemo {

    public static void main(String[] args) {
        XmlBean bean = new XmlBean();
        bean.setName("testXml");
        bean.setValue("test");
        
        
        B2BWmsOrder obj = new B2BWmsOrder();
        WmsOrderHead head = new WmsOrderHead();
        obj.setWmsOrderHead(head);
        try {
            File file = new File("C:\\Users\\xjkms\\Desktop\\test.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(B2BWmsOrder.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
            jaxbMarshaller.setProperty("com.sun.xml.bind.xmlHeaders","<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            // jaxbMarshaller.marshal(bean, file);
            jaxbMarshaller.marshal(obj, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
