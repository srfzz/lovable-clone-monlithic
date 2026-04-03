package com.strucify.projects.Lovable_clone.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Project {
    Long id;
    String name;
    User creator;
    Boolean isPublic;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;
}
