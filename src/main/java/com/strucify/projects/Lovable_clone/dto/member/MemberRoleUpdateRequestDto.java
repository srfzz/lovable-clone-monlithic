package com.strucify.projects.Lovable_clone.dto.member;

import com.strucify.projects.Lovable_clone.entity.enums.ProjectRole;
import lombok.Data;

import java.io.Serializable;


public record MemberRoleUpdateRequestDto(ProjectRole projectRole)  {
}
