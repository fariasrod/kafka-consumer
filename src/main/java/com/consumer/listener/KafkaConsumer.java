package com.consumer.listener;

import com.consumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "restaurant", groupId = "group_json", containerFactory = "userKafkaListenerFactory")
    public void consumeUser(@Payload User user, @Headers MessageHeaders headers) {
        System.out.println("Consumed JSON Message: " + user.toString());
    }



}
