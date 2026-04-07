package com.strucify.projects.Lovable_clone.dto.subscription;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public record PlanResponseDto(
        Long id,
        String name,
        String stripePriceId,
        Integer maxProjects,
        Integer maxPreviews,
        Boolean unlimitedAi,
        String price
) {
}
