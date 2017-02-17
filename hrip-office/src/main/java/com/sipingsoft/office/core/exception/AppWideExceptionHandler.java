package com.sipingsoft.office.core.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * ControllerAdvice应用场景是将所有@ExceptionHandler方法收集到一个类中，这样所有控制器的异常就能在一个
 * 地方进行一致的处理
 */
@ControllerAdvice
public class AppWideExceptionHandler {

    @ExceptionHandler(SpittleNotFoundException.class)
    public String duplicateSpittleHandler(){
        
        return "error/duplicate";
    }
}
