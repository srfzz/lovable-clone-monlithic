package com.strucify.projects.Lovable_clone.service.billing;

import com.strucify.projects.Lovable_clone.dto.subscription.PlanResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    @Override
    public List<PlanResponseDto> fetchActivePlans() {
        return List.of();
    }
}
