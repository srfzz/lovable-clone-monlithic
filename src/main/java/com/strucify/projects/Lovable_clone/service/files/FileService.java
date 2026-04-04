package com.strucify.projects.Lovable_clone.service.files;

import com.strucify.projects.Lovable_clone.dto.projects.FileContentResponseDto;
import com.strucify.projects.Lovable_clone.dto.projects.FileNodeDto;

import java.util.List;

public interface FileService {

    List<FileNodeDto> getFileTree(String projectId, Long userId);

    FileContentResponseDto getfile(Long projectId, Long userId, String path);
}
