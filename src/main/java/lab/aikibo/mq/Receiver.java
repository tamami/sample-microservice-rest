package lab.aikibo.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by tamami on 15/06/17.
 */
@Component
public class Receiver {

    @RabbitListener(queues = "TestQ")
    public void processMessage(String content) {
        System.out.println(content);
    }

}
