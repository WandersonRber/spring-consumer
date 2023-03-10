package com.example.spring.comsumer.implementation;

import com.example.spring.comsumer.amqp.AmqpConsumer;
import com.example.spring.comsumer.dto.Message;
import com.example.spring.comsumer.service.ConsumerService;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer  implements AmqpConsumer<Message> {

    @Autowired
    private ConsumerService consumerService;

    @Override
    @RabbitListener(queues = "${spring.rabbitmq.request.routing-key.producer}")
    public void consumer(Message message) {
        try {
            consumerService.action(message);
        }catch (Exception ex){
            throw new AmqpRejectAndDontRequeueException(ex);
        }
    }
}
