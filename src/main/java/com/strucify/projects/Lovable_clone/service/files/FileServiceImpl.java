package com.strucify.projects.Lovable_clone.service.files;

import com.strucify.projects.Lovable_clone.dto.projects.FileContentResponseDto;
import com.strucify.projects.Lovable_clone.dto.projects.FileNodeDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class FileServiceImpl implements FileService {
    @Override
    public List<FileNodeDto> getFileTree(String projectId, Long userId) {
        return List.of();
    }

    @Override
    public FileContentResponseDto getfile(Long projectId, Long userId, String path) {
        return null;
    }
}
