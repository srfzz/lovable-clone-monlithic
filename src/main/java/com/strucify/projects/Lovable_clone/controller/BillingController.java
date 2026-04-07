package com.strucify.projects.Lovable_clone.controller;

import com.strucify.projects.Lovable_clone.dto.subscription.CheckOutRequest;
import com.strucify.projects.Lovable_clone.dto.subscription.CheckOutResponseDto;
import com.strucify.projects.Lovable_clone.dto.subscription.PlanResponseDto;
import com.strucify.projects.Lovable_clone.dto.subscription.SubscriptionResponseDto;
import com.strucify.projects.Lovable_clone.service.billing.PlanService;
import com.strucify.projects.Lovable_clone.service.billing.SubscriptionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@Slf4j
@RequiredArgsConstructor
public class BillingController {

    private final PlanService planService;
    private final SubscriptionService subscriptionService;


    @GetMapping("/api/plans")
    public ResponseEntity<List<PlanResponseDto>> fetchPlans() {
        return ResponseEntity.ok().body(planService.fetchActivePlans());
    }


    @GetMapping("/api/me/subscriptions")
    public ResponseEntity<SubscriptionResponseDto> fetchSubscriptions() {
        Long userId=1l;
        return ResponseEntity.ok().body(subscriptionService.fetchSubscriptions(userId));
    }

    @PostMapping("/api/stripe/chcekout")
    public ResponseEntity<CheckOutResponseDto> chcekout(@RequestBody CheckOutRequest request) {
        Long userId=1l;
        return ResponseEntity.ok().body(subscriptionService.createCheckoutSessionUrl(request,userId));

    }

    @PostMapping("/api/stripe/portal")
    public ResponseEntity<CheckOutResponseDto> openCustomerportal() {
        Long userId=1l;
        return ResponseEntity.ok().body(subscriptionService.openCustomerPortal(userId));
    }
}
