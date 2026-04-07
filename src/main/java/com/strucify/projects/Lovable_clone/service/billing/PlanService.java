package com.strucify.projects.Lovable_clone.service.billing;

import com.strucify.projects.Lovable_clone.dto.subscription.PlanResponseDto;

import java.util.List;

public interface PlanService {
    List<PlanResponseDto> fetchActivePlans();
}
