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
    public String send(String msg) {
        Spittle s = new Spittle(msg, null, null, null);
        service.convertAndSendSpittleAlert(s);
        return "success";
    }
    
    @RequestMapping("/jms/receive")
    @ResponseBody
    public Spittle receive() {
        return service.receiveAndConvert();
    }
}
