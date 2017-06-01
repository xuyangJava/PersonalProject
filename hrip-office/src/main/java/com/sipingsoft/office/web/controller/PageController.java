package com.sipingsoft.office.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/common/page")
    public String getUserList(String path){
        return path;
    }
}
