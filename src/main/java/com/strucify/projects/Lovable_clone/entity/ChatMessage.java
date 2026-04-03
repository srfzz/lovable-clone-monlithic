package com.strucify.projects.Lovable_clone.entity;

import com.strucify.projects.Lovable_clone.entity.enums.MessageRole;

import java.time.Instant;

public class ChatMessage {
    Long id;
    ChatSession session;
    MessageRole role;
    String Content;
    String toolCalls;//json Array of tools calls
    Integer tokenUsed;
    Instant createdAt;

}
