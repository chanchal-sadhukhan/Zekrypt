package com.zekrypt.backend.service.impl;

import com.zekrypt.backend.dto.request.CreateFileRequest;
import com.zekrypt.backend.dto.response.FileResponse;
import com.zekrypt.backend.entity.FileRecord;
import com.zekrypt.backend.repository.FileRepository;
import com.zekrypt.backend.service.interfaces.FileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {

    private final FileRepository fileRepository;

    public FileServiceImpl(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @Override
    public FileResponse createFile(CreateFileRequest request) {

        FileRecord file = new FileRecord();
        file.setFileName(request.getFileName());

        FileRecord saved = fileRepository.save(file);

        return new FileResponse(
                saved.getId(),
                saved.getFileName()
        );
    }

    @Override
    public List<FileResponse> getFiles() {

        return fileRepository.findAll()
                .stream()
                .map(file -> new FileResponse(
                        file.getId(),
                        file.getFileName()
                ))
                .toList();
    }
}
