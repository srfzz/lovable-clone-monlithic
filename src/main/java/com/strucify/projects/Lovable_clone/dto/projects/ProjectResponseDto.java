package com.strucify.projects.Lovable_clone.dto.projects;

import com.strucify.projects.Lovable_clone.dto.auth.UserProfileResponseDto;
import com.strucify.projects.Lovable_clone.entity.User;

import java.time.Instant;

public record ProjectResponseDto(
        Long id,
        String name,
        Instant createdAt,
        UserProfileResponseDto userProfileResponseDto
) {
}
