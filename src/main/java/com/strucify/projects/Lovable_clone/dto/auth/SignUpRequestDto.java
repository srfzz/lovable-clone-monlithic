package com.strucify.projects.Lovable_clone.dto.auth;

import lombok.Builder;

@Builder
public record SignUpRequestDto(String email, String name, String avatarUrl,String password) {
}
