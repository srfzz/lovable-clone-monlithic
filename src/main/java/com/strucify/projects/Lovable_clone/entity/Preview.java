package com.strucify.projects.Lovable_clone.entity;

import com.strucify.projects.Lovable_clone.entity.enums.PreviewStatus;

import java.time.Instant;

public class Preview {

    Long id;
    Project  project;
    String namespace;
    String prodName;
    String previewUrl;
    PreviewStatus status;
    Instant startedAt;
    Instant terminatedAt;
    Instant createdAt;
    Instant updatedAt;

}
