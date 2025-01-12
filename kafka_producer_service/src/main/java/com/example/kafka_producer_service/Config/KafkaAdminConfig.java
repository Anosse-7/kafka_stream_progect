package com.example.kafka_producer_service.Config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaAdminConfig {

    @Bean
    public AdminClient adminClient() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "172.28.48.8:9092");
        return AdminClient.create(configs);
    }

    @Bean
    public NewTopic createInputTopic() {
        return new NewTopic("input-topic", 1, (short) 1);
    }

    @Bean
    public NewTopic createOutputTopic() {
        return new NewTopic("output-topic", 1, (short) 1);
    }
}