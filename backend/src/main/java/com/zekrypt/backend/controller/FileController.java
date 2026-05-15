package com.zekrypt.backend.controller;

import com.zekrypt.backend.entity.FileRecord;
import com.zekrypt.backend.repository.FileRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/files")
public class FileController {

    private final FileRepository fileRepository;

    public FileController(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @PostMapping
    public FileRecord createFile(@RequestBody FileRecord file) {
        return fileRepository.save(file);
    }

    @GetMapping
    public List<FileRecord> getFiles() {
        return fileRepository.findAll();
    }
}
