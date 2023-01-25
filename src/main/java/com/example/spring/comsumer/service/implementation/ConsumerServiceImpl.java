package com.example.spring.comsumer.service.implementation;

import com.example.spring.comsumer.dto.Message;
import com.example.spring.comsumer.service.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public void action(Message message) throws Exception {
        throw new Exception("Erro");
      //  System.out.println(message.getText());
    }
}
