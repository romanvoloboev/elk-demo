package com.romanvoloboev.elkdemo;

import io.github.georgwittberger.extendmdc.annotation.ExtendMDC;
import io.github.georgwittberger.extendmdc.annotation.MDCValue;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Controller {


    @Autowired
    private MyService myService;

    @ExtendMDC
    @GetMapping("/test")
    public String test(@MDCValue("user.id")
                       @RequestHeader("userId") long id) {
        log.info("Controller");
        myService.doSmth();
        return "OK";
    }

}
