package com.microservices.email_service.kafka;

import com.microservices.base_domain.dto.OrderEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaEmailConsumer {

    @KafkaListener(
            topics = "${spring.kafka.topic.name}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume(OrderEvent event){
        log.info(String.format("Order event received in email service => %s", event.toString()));
        // send an email to the customer
    }

}
