package com.stackroute.controller;

import com.stackroute.domain.User;
import com.stackroute.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class ProducerController
{
     private ProducerService producerService;

     @Autowired
     ProducerController(ProducerService producerService)
     {
      this.producerService=producerService;
     }
     @PostMapping("producer/{message}")
     public ResponseEntity<String> sendMessage(@PathVariable String message)
     {
         ResponseEntity responseEntity;
         String status=producerService.send(message);
         responseEntity = new ResponseEntity<String>(status, HttpStatus.CREATED);
         return responseEntity;

     }
    @PostMapping("producerJson")
    public ResponseEntity<?> sendJson(@RequestBody User user)
    {
        ResponseEntity responseEntity;
        System.out.println(user);
        String status=producerService.sendJson(user);
        responseEntity = new ResponseEntity<String>(status, HttpStatus.CREATED);
        return responseEntity;

    }

}
