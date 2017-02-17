package com.sipingsoft.office.web.controller;

import java.io.IOException;

import javax.servlet.http.Part;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sipingsoft.office.core.exception.DuplicateSpittleException;
import com.sipingsoft.office.core.exception.SpittleNotFoundException;
import com.sipingsoft.office.web.entity.Spittler;
import com.sipingsoft.office.web.entity.User;
import com.sipingsoft.office.web.repository.UserMapper;

@Controller
public class SpittleController {
    
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/spittle/home")
    public String processRegistration(@Valid Spittler spittler, Errors errors, Model model){
        /*if(errors.hasErrors()){ // 使用spring的校验框架
            return "registerForm";
        }*/
        // TODO 保存数据
        // 测试重定向并传值,采取这种方式更加安全，但是这种方式只能传递简单的值
        model.addAttribute("spittleId", 1); 
        return "redirect:/spittle/{spittleId}";
    }
    
    @RequestMapping("/spittle/home2")
    public String processRegistration2(RedirectAttributes model){
        //使用flash传递对象，可以在重定向时传递复杂的值
        Spittler spittler = new Spittler();
        spittler.setId(1l);
        spittler.setUsername("test redirect");
        model.addAttribute("spitter", spittler);
        return "redirect:/spittle/{spittleId}";
    }
    
    @RequestMapping(value="register", method = RequestMethod.GET)
    public String showRegistrationForm(Model model){
        model.addAttribute(new Spittler()); // key根据对象类型推断得到的
        User user = userMapper.selectByPrimaryKey(1l);
        model.addAttribute(user);
        return "registerForm";
    }
    
    @RequestMapping(value="fileUpload/form", method = RequestMethod.GET)
    public String showFileUpload(){
        return "fileUploadForm";
    }
    
    @RequestMapping(value="fileUpload", method = RequestMethod.POST)
    @ResponseBody
    public String fileUpload(@RequestPart("profilePicture") Part profilePicture){
        try {
            profilePicture.write("/data/"+profilePicture.getName() + ".jpg");
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
        return profilePicture.getName() + ".jpg";
    }
    
    // 测试异常处理-1
    @RequestMapping(value="/spittle/{spittleId}", method = RequestMethod.GET)
    @ResponseBody
    public String spittle (@PathVariable("spittleId") long spittleId, Model model) 
            throws SpittleNotFoundException, DuplicateSpittleException {
        if(spittleId == 2){
            throw new SpittleNotFoundException();
        } 
        if(spittleId == 3){
            throw new DuplicateSpittleException();
        } 
        if(!model.containsAttribute("spitter")){
            // 进行下一步动作
        }
        return "success !";
    }
    
    /**
     * ExceptionHandler注解：当抛出DuplicateSpittleException异常的时候将会委托该方法来处理
     * 它能处理同一个控制器中所有所有处理异常抛出的方法。如果想要应用到全部控制器可以参看@ControllerAdvice--控制器通知
     */
    /*@ExceptionHandler(DuplicateSpittleException.class)
    public String handleDuplicateSpittle(){
        
        return "error/duplicate";
    }*/
    /*
     *  这里在使用ResponseBody注解时，设置produces防止中文乱码。这种方式相对简单不需要做大量的配置，而且旧的配置方法有些类已经被废弃
     */
    @RequestMapping(value = "/test/user", method = RequestMethod.GET)
    @ResponseBody
    public String testDb(Model model){
        User user = userMapper.selectByPrimaryKey(1l);
        model.addAttribute(user);
        return "成功";
    }
}
