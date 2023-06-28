package app.innov8r.emailservice.kafka;

import app.innov8r.basedomains.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EmailConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmailConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(OrderEvent event) {
        LOGGER.info(String.format("Order received by email consumer: %s", event.getOrder().toString()));
        LOGGER.info(String.format("Order event received by email consumer: %s", event.toString()));

        // TODO: Send email when the order is received
    }
}
