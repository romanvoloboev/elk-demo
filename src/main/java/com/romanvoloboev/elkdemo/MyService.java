package com.romanvoloboev.elkdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MyService {
    public void doSmth() {
        log.info("Do smth method called");
        doSmth_2("heLLO!");

    }

    private void doSmth_2(String msg) {
        log.info("Dosmth_2: {}", msg);

        try {
            int a = 2/0;
        } catch (Exception e) {
            log.error("error: ", e);
        }
    }
}
