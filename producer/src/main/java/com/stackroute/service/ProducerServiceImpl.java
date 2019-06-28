package com.stackroute.service;

import com.stackroute.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements ProducerService {

     @Autowired
     KafkaTemplate<String,String > kafkaTemplate;

    @Autowired
    KafkaTemplate<String,User> kafkaTemplate1;



    private static String topic= "testTopic";
    private static String topic1="testTopic_Json";

    @Override
    public String send(String message) {

        kafkaTemplate.send(topic,message);

        return "published successfully";

    }

    @Override
    public String sendJson(User user) {

        kafkaTemplate1.send(topic1,user);

        return "returned json successfully";
    }
}
