package com.strucify.projects.Lovable_clone.controller;


import com.strucify.projects.Lovable_clone.dto.usage.PlanLimitsResponseDto;
import com.strucify.projects.Lovable_clone.dto.usage.UsageTodayReponseDto;
import com.strucify.projects.Lovable_clone.service.usage.UsageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usage")
@Slf4j
public class UsageController {


    private final UsageService usageService;

    public UsageController(UsageService usageService) {
        this.usageService = usageService;
    }

    @GetMapping("/today")
    public ResponseEntity<UsageTodayReponseDto> today() {
        Long userId=1l;
        return ResponseEntity.ok(usageService.getTodayUsage(userId));
    }

    @GetMapping("/limits")
    public ResponseEntity<PlanLimitsResponseDto> getPlanlimits() {
        Long userId=1l;
        return ResponseEntity.ok().body(usageService.getCurrentSubscriptionlimitofUser(userId));

    }
}
