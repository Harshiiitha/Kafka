package com.stackroute.service;

import com.stackroute.domain.User;

public interface ProducerService
{
    public String send(String message);

    public String sendJson(User user);
}
