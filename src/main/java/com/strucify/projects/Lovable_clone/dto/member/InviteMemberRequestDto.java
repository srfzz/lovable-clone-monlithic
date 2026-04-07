package com.strucify.projects.Lovable_clone.dto.member;

import com.strucify.projects.Lovable_clone.entity.enums.ProjectRole;

public record InviteMemberRequestDto(String email, ProjectRole projectRole, String invitedAt) {
}
