package pe.com.paymentk.messages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import pe.com.paymentk.service.PaymeentService;
import pe.com.paymentk.utils.Topic;

@RequiredArgsConstructor
@Component
public class Recieve {

    private static final Logger logger = LoggerFactory.getLogger(Recieve.class);

    private final PaymeentService paymentService;
    private final Send kafkaProducer;

    @KafkaListener(topics = Topic.REQUEST_BUY, groupId = "group_id_gateway")
    public void consumeFormGateway(String param) {
        logger.info(" payment was inserted: " + param);

    }
}
