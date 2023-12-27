package com.example.chatlogserver.service;

import com.example.chatlogserver.model.ChatMessage;

import java.util.List;

public interface ChatLogService {

    String addChatMessage(String user, ChatMessage message);

    List<ChatMessage> getChatLogs(String user, int limit, String start);

    void deleteChatLogs(String user);

    void deleteChatLogs(String user, String msgId);

}
