package com.strucify.projects.Lovable_clone.service.project;

import com.strucify.projects.Lovable_clone.dto.projects.ProjectRequestDto;
import com.strucify.projects.Lovable_clone.dto.projects.ProjectResponseDto;
import com.strucify.projects.Lovable_clone.dto.projects.ProjectSummaryResponseDto;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponseDto> getAllProjects(Long userId);

    ProjectResponseDto getProjectDetails(Long projectid);

    ProjectResponseDto createProject(ProjectRequestDto projectRequestDto,Long userid);

    ProjectResponseDto updateProject(Long projectId,Long userid);

    void deleteProject(Long projectId,Long userid);
}
