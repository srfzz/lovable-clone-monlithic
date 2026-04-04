package com.strucify.projects.Lovable_clone.controller;

import com.strucify.projects.Lovable_clone.dto.projects.ProjectRequestDto;
import com.strucify.projects.Lovable_clone.dto.projects.ProjectResponseDto;
import com.strucify.projects.Lovable_clone.dto.projects.ProjectSummaryResponseDto;
import com.strucify.projects.Lovable_clone.service.project.ProjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@Slf4j
public class ProjectController {

    private final ProjectService  projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping()
    public ResponseEntity<List<ProjectSummaryResponseDto>> getAllProjects() {
        long userId=1l;
        return ResponseEntity.ok().body(projectService.getAllProjects(userId));
    }

    @GetMapping("/{projectId}")
    public ResponseEntity<ProjectResponseDto> getProject(@PathVariable("projectid") Long projectid) {
            return ResponseEntity.ok().body(projectService.getProjectDetails(projectid));
    }

    @PostMapping()
    public ResponseEntity<ProjectResponseDto> createProject(ProjectRequestDto projectRequestDto)
    {
        Long userId=1l;
        return ResponseEntity.ok().body(projectService.createProject(projectRequestDto,userId));
    }
    @PatchMapping("/{projectId}")
    public ResponseEntity<ProjectResponseDto> updateProject(ProjectRequestDto projectRequestDto, @PathVariable("projectId") Long projectId) {
      Long userId=1l;
        return  ResponseEntity.ok().body(projectService.updateProject(projectId,userId));
    }

    @DeleteMapping("/{projectId}")
    public ResponseEntity<Void> deleteProject(@PathVariable("projectId") Long projectId) {
        Long userId=1l;
        projectService.deleteProject(projectId,userId);
        return  ResponseEntity.noContent().build();
    }
}
