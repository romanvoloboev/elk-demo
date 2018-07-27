package com.romanvoloboev.elkdemo;

import net.logstash.logback.encoder.LogstashEncoder;
import net.logstash.logback.fieldnames.LogstashFieldNames;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElkDemoApplication {

    private static Logger logger = LoggerFactory.getLogger(ElkDemoApplication.class.getName());

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ElkDemoApplication.class, args);

//        LogstashEncoder logstashEncoder = new LogstashEncoder();
//
//        LogstashFieldNames logstashFieldNames = new LogstashFieldNames();
//        logstashFieldNames.setStackTrace("");
//
//        logstashEncoder.setFieldNames();



        do {
            MDC.put("user.id", "1");
            MDC.put("user.name", "userName_kek");
            MDC.put("service.name", "test-app");
            MDC.put("service.node", "1");
            logger.info("Info test");
            try {
                throw new IllegalArgumentException("exception message");
            } catch (Exception e) {
                logger.error("some exception", e);
            }
            Thread.sleep(5000);
            MDC.clear();
        } while (true);


    }
}
