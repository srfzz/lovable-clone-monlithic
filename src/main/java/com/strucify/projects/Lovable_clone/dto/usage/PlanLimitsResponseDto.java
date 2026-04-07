package com.strucify.projects.Lovable_clone.dto.usage;

public record PlanLimitsResponseDto(
        String planName,
        int maxTokensperDay,
        int maxProjcets,
        boolean unlimitedAi
) {
}
