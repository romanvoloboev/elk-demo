package com.romanvoloboev.elkdemo;

import io.github.georgwittberger.extendmdc.annotation.ExtendMDC;
import io.github.georgwittberger.extendmdc.annotation.MDCValue;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Controller {


    @ExtendMDC
    @GetMapping("/test")
    public String test(@MDCValue("user.id") @RequestHeader("id") long id) {


        log.info("TEST REQUEST called: {}", id);

        log.info("MDC GET: {}", MDC.get("user.id"));

        return "OK";
    }

}
