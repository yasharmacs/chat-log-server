package com.example.chatlogserver.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {
    @JsonIgnore
    private String id;
    private String message;
    private long timestamp;
    private boolean isSent;
}