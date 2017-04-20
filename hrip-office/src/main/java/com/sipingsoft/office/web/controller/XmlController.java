package com.sipingsoft.office.web.controller;

import java.io.IOException;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sipingsoft.office.web.entity.B2BWmsOrder;
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
    
    @RequestMapping(value="/wmsorder/jsonPrase", headers = {"content-type=application/json","content-type=application/xml"}) 
    @ResponseBody 
    public Object acptWMSOrder(@RequestBody B2BWmsOrder order) { 
       try {
           System.out.println("add test ..............");
        } catch (Exception e) {
            e.printStackTrace();
        }
            return new HashMap<String, String>().put("success", "true"); 
    } 
    
    // 上传到指定目录
    @RequestMapping(value="/wmsorder/fileUpload", method = RequestMethod.POST)
    @ResponseBody
    public String fileUpload(@RequestPart("file") MultipartFile file){
        try {
            file.transferTo(new java.io.File("C:\\Users\\xjkms\\Desktop\\" + file.getName()));
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
        return "success";
    }
}
