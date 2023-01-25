package com.example.spring.comsumer.service;

import com.example.spring.comsumer.dto.Message;

public interface ConsumerService {

    void action(Message message) throws Exception;
}
