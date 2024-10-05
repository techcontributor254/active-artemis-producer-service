package com.kalicoders.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenderController {

    @Autowired
    SenderMessageService senderMessageService;

    @PostMapping(value = "queue/sendMessage")
    public void sendMessage(@RequestParam("message") String message) {
        System.out.println("Message is:" +message);
        senderMessageService.sendMsg(message);
    }
}
