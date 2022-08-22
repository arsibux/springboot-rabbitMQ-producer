package com.rabbitmq.producer.apiResource;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class MessageController {

    private final AmqpTemplate rabbitTemplate;

    public MessageController(AmqpTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @GetMapping("/send/{message}")
    @ResponseBody
    public ResponseEntity<String> publish(@PathVariable(value = "message") String message) {
        rabbitTemplate.convertAndSend("MESSAGE-QUEUE", message);
        return new ResponseEntity<>("Mesage successfully published to RabbitMQ.", HttpStatus.CREATED);
    }
}
