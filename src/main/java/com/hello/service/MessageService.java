package com.hello.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hello.Repository.MessageRepository;
import com.hello.entity.Message;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }
}
