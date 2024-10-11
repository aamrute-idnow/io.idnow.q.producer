package com.example.rabbitmqdemo.controller;

import com.example.rabbitmqdemo.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/send")
    public String sendMessage() {
        messageService.sendMessage("Hello, RabbitMQ!");
        return "Message sent to RabbitMQ!";
    }
}
