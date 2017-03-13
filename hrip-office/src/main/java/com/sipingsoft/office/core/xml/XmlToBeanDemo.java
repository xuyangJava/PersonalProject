package com.sipingsoft.office.core.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.sipingsoft.office.web.entity.XmlBean;

public class XmlToBeanDemo {

    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\xjkms\\Desktop\\test.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(XmlBean.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            XmlBean customer = (XmlBean) jaxbUnmarshaller.unmarshal(file);
            System.out.println(customer);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
