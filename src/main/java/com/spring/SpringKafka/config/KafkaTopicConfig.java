package com.spring.SpringKafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Component;

@Component
public class KafkaTopicConfig {
    @Value("${spring.kafka.topic.name}")
    private String topicName;

    @Value("${spring.kafka.topic-json.name}")
    private String topicJsonName;

    public NewTopic kafkaTopic(){
        return TopicBuilder.name("Vaibhav").build();
    }
    @Bean
    public NewTopic javaguidesJsonTopic(){
        return TopicBuilder.name(topicJsonName)
                .build();
    }
}
