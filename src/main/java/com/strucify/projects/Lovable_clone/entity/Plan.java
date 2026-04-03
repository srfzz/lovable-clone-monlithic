package com.strucify.projects.Lovable_clone.entity;


import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {

    Long id;
    String name;
    String stripePriceId;
    Integer maxProjects;
    Integer maxPreviews;
    Boolean unlimitedAi;
    Boolean active;

}
