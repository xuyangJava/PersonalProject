package com.sipingsoft.office.web.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sipingsoft.office.web.entity.Spittle;

@Controller
public class AlertController {

    @Autowired
    private AlertService service;
    
    @RequestMapping("/jms/send")
    @ResponseBody
    public String send() {
        Spittle s = new Spittle("HELLO WORLD!", null, null, null);
        service.sendSpittleAlert(s);
        return "success";
    }
    
    @RequestMapping("/jms/receive")
    @ResponseBody
    public Spittle receive() {
        return service.receiveAndConvert();
    }
}
