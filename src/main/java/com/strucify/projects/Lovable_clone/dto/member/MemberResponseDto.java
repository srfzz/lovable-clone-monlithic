package com.strucify.projects.Lovable_clone.dto.member;

import com.strucify.projects.Lovable_clone.entity.enums.ProjectRole;

import java.time.Instant;

public record MemberResponseDto(
        Long userId,
        String email,
        String name,
        String avatarUrl,
        ProjectRole projectRole,
        Instant invitedAt

) {
}
