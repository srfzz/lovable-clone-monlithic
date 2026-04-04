package com.strucify.projects.Lovable_clone.controller;

import com.strucify.projects.Lovable_clone.dto.projects.FileContentResponseDto;
import com.strucify.projects.Lovable_clone.dto.projects.FileNodeDto;
import com.strucify.projects.Lovable_clone.service.files.FileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/projects/{projectId}/files")
@Slf4j
public class FileController {



    private final FileService fileService;

    public FileController(FileService fileService) {
        this.fileService = fileService;
    }


    @GetMapping
    public ResponseEntity<List<FileNodeDto>> getFileTree(@PathVariable("projectId") String projectId) {
        Long userId = 1L;
      return  ResponseEntity.ok().body(fileService.getFileTree(projectId,userId));
    }

    @GetMapping("/{*path}")
    public ResponseEntity<FileContentResponseDto> getFile(@PathVariable("projectId") Long projectId, @PathVariable String path)
    {
        Long userId = 1L;
        return ResponseEntity.ok().body(fileService.getfile(projectId,userId,path));
    }
}
