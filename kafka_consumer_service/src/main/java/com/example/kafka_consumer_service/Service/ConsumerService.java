/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.kafka_consumer_service.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    
    @KafkaListener(topics = "output-topic", groupId = "kafka-consumer-group")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}
