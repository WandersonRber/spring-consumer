package com.example.spring.comsumer.amqp;

public interface AmqpConsumer<T> {

    void consumer(T t);
}
