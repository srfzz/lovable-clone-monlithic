package com.strucify.projects.Lovable_clone.service.billing;


import com.strucify.projects.Lovable_clone.dto.subscription.CheckOutRequest;
import com.strucify.projects.Lovable_clone.dto.subscription.CheckOutResponseDto;
import com.strucify.projects.Lovable_clone.dto.subscription.SubscriptionResponseDto;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponseDto fetchSubscriptions(Long userId) {
        return null;
    }

    @Override
    public CheckOutResponseDto createCheckoutSessionUrl(CheckOutRequest request, Long userId) {
        return null;
    }

    @Override
    public CheckOutResponseDto openCustomerPortal(Long userId) {
        return null;
    }
}
