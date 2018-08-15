package com.romanvoloboev.elkdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MyService {
    public void doSmth() {
        log.info("Do smth method called");

        new Thread(() -> doSmth_2("heLLO runnable!")).start();
        //doSmth_2("GGggg");
        log.info("DONE");

    }

    @Async
    void doSmth_2(String msg) {
        log.info("Dosmth_2: {}", msg);
        try {
            int a = 2/0;
        } catch (Exception e) {
            log.error("error: {}", e);
        }
    }
}
