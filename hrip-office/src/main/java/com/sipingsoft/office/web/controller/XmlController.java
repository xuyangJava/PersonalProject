package com.sipingsoft.office.web.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sipingsoft.office.web.entity.XmlBean;

/**
 * 接收XML并转化为bean对象
 */
@Controller
public class XmlController {

    @RequestMapping(value="/jsonPrase", headers = {"content-type=application/json","content-type=application/xml"}) 
    @ResponseBody 
    public Object addUser(@RequestBody XmlBean bean) { 
       try {
           System.out.println("add test ..............");
           System.out.println(bean.getName()+ " == " + bean.getValue()); 
    } catch (Exception e) {
        e.printStackTrace();
    }
        return new HashMap<String, String>().put("success", "true"); 
    } 
}
