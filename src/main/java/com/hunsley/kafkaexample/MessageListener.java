package com.hunsley.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @KafkaListener(topics = "${kafka.topic}", groupId = "${kafka.groupId}", containerFactory = "kafkaListenerContainerFactory")
    public void listenGroupMessage(final String message) {
        System.out.println(message);
    }
}
