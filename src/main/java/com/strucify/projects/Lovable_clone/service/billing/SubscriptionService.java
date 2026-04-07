package com.strucify.projects.Lovable_clone.service.billing;

import com.strucify.projects.Lovable_clone.dto.subscription.CheckOutRequest;
import com.strucify.projects.Lovable_clone.dto.subscription.CheckOutResponseDto;
import com.strucify.projects.Lovable_clone.dto.subscription.SubscriptionResponseDto;

public interface SubscriptionService {
    SubscriptionResponseDto fetchSubscriptions(Long userId);

    CheckOutResponseDto createCheckoutSessionUrl(CheckOutRequest request, Long userId);

    CheckOutResponseDto openCustomerPortal(Long userId);
}
