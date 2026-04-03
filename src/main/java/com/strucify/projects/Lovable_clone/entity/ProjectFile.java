package com.strucify.projects.Lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@ToString
@FieldDefaults(level=AccessLevel.PRIVATE)
public class ProjectFile {
    Long id;
    Project project;
    String path;
    String miniObjectkey;
    String createdAt;
    String updatedAt;
    User createdBy;
    User updatedBy;
}
