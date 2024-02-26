package com.store.notification.component.implement;

import com.store.notification.component.RabbitMQComponent;
import com.store.notification.service.implement.EmailServiceImplement;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQComponentImplement implements RabbitMQComponent {
    @Value("${rabbitmq.queue.name}")
    private String queue;

    @RabbitListener(queues = "order_notification")
    public void handleMessage(String message) {
        String obj = EmailServiceImplement.convertToObject(message);
        String content = EmailServiceImplement.constructContent();
        EmailServiceImplement.sendEmail(content, obj);
//        TODO: Receber o dado
//        TODO: Identificar produto e usuário
//        TODO: Enviar um e-mail para o usuário
    }
}
