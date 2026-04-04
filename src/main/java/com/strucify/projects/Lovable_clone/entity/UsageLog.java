package com.strucify.projects.Lovable_clone.entity;

import java.time.Instant;

public class UsageLog {
    Long id;
    User user;
    Project project;
    String action;
    Integer tokenUsed;
    Integer durationms;
    String metaData;
    Instant createdAt;

}
