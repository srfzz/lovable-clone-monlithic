package com.strucify.projects.Lovable_clone.service.usage;

import com.strucify.projects.Lovable_clone.dto.usage.PlanLimitsResponseDto;
import com.strucify.projects.Lovable_clone.dto.usage.UsageTodayReponseDto;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {
    @Override
    public UsageTodayReponseDto getTodayUsage(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponseDto getCurrentSubscriptionlimitofUser(Long userId) {
        return null;
    }
}
