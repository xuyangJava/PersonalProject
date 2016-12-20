package com.sipingsoft.office.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OfficeController {

    @RequestMapping("/excel")
    public ModelAndView excel(String pathName) {
        ModelAndView mav = new ModelAndView("/excelPreview");
        mav.addObject("pathName", pathName);
        return mav;
    }
    
    @RequestMapping("/index")
    public String office() {
        return "index";
    }
}
