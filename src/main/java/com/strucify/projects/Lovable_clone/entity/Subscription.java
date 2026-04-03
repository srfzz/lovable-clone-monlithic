package com.strucify.projects.Lovable_clone.entity;


import com.strucify.projects.Lovable_clone.entity.enums.SubscriptionStatus;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {
    Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    User subscriber;

    Plan plan;
    String stripeCustomerId;
    String stripeSubscriptionId;
    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Instant cancelAtPeriodEnd;
    SubscriptionStatus status;
    Instant createdAt;
    Instant updatedAt;
}
