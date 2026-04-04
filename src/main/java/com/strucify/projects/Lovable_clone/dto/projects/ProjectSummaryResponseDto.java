package com.strucify.projects.Lovable_clone.dto.projects;

import java.time.Instant;

public record ProjectSummaryResponseDto(
        Long id,
        String name,
        Instant createdAt
) {
}
