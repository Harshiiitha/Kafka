package com.stackroute.service;

import com.stackroute.domain.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "testTopic",groupId = "Group_Id")
    public void consume(String message)
    {
        System.out.println("Consumed message   "+message);
    }

    @KafkaListener(topics = "testTopic_Json",groupId = "Group_Json",containerFactory = "UserListenerContainerFactory")
    public void consumeJson(@Payload User user)
    {
        System.out.println("Consumed user   "+user.toString());
    }
}
