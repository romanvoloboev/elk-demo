package com.romanvoloboev.elkdemo;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@EnableRabbit
public class AmqpConfig {

//    private static final String exchangeName = "logstash-exchange";
//    private static final String queueName = "logstash-queue";
//
//    @Autowired
//    private RabbitTemplate rabbitTemplate;
//
//
//    @Bean
//    public TopicExchange logstashExchange() {
//        return new TopicExchange(exchangeName, true, false);
//    }
//
//    @Bean
//    public Queue logstashQueue() {
//        return new Queue(queueName, true);
//    }
//
//    @Bean
//    public Binding queueBinding() {
//        return new Binding(queueName, Binding.DestinationType.QUEUE, exchangeName, "test-app", null);
//    }

}
