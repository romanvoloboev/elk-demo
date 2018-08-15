package com.romanvoloboev.elkdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@SpringBootApplication
public class ElkDemoApplication {

    private static Logger logger = LoggerFactory.getLogger(ElkDemoApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(ElkDemoApplication.class, args);
    }
}
