package com.strucify.projects.Lovable_clone.dto.projects;

import java.time.Instant;

public record FileNodeDto(String path, Instant modifiedDate, Long size, String type) {
}
