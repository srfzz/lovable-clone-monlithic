package com.strucify.projects.Lovable_clone.service.project;

import com.strucify.projects.Lovable_clone.dto.projects.ProjectRequestDto;
import com.strucify.projects.Lovable_clone.dto.projects.ProjectResponseDto;
import com.strucify.projects.Lovable_clone.dto.projects.ProjectSummaryResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProjectServiceImpl implements ProjectService {

    @Override
    public List<ProjectSummaryResponseDto> getAllProjects(Long userid) {
        return List.of();
    }

    @Override
    public ProjectResponseDto getProjectDetails(Long projectid) {
        return null;
    }

    @Override
    public ProjectResponseDto createProject(ProjectRequestDto projectRequestDto,Long userid) {
        return null;
    }

    @Override
    public ProjectResponseDto updateProject(Long projectId,Long userid) {
        return null;
    }

    @Override
    public void deleteProject(Long projectId,Long userid) {

    }
}
