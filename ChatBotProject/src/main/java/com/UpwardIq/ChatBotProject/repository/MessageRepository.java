package com.UpwardIq.ChatBotProject.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UpwardIq.ChatBotProject.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findBySenderIdOrReceiverIdOrderByTimestamp(String senderId, String receiverId);
}

