package com.strucify.projects.Lovable_clone.dto.subscription;

import com.strucify.projects.Lovable_clone.entity.Plan;

import java.time.Instant;

public record SubscriptionResponseDto(
        Plan plan,
        String status,
        Instant periodEnd,
        String tokenUsedthisCycle

) {
}
