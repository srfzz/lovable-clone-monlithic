package com.strucify.projects.Lovable_clone.entity;

import com.strucify.projects.Lovable_clone.entity.enums.ProjectRole;

import java.time.Instant;

public class ProjectMember {
    ProjectMemberId id;
    ProjectRole role;
    Project project;
    User user;
    Instant inviteAt;
    Instant acceptedAt;

}
