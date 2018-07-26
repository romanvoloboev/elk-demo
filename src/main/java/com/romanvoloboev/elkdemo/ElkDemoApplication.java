package com.romanvoloboev.elkdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElkDemoApplication {

    private static Logger logger = LoggerFactory.getLogger(ElkDemoApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(ElkDemoApplication.class, args);

        logger.info("Test hello");
        logger.info("Test hello");
        logger.info("Test hello");
        logger.info("Test hello");
        logger.info("Test hello");
    }
}
