package com.strucify.projects.Lovable_clone.service.usage;

import com.strucify.projects.Lovable_clone.dto.usage.PlanLimitsResponseDto;
import com.strucify.projects.Lovable_clone.dto.usage.UsageTodayReponseDto;

public interface UsageService {
    UsageTodayReponseDto getTodayUsage(Long userId);

    PlanLimitsResponseDto getCurrentSubscriptionlimitofUser(Long userId);
}
