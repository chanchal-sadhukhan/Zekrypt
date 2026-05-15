package com.zekrypt.backend.controller.v1;

import com.zekrypt.backend.dto.request.CreateFileRequest;
import com.zekrypt.backend.dto.response.FileResponse;
import com.zekrypt.backend.service.interfaces.FileService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/files")
public class FileController {

    private final FileService fileService;

    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @PostMapping
    public FileResponse createFile(
            @Valid @RequestBody CreateFileRequest request
    ) {
        return fileService.createFile(request);
    }

    @GetMapping
    public List<FileResponse> getFiles() {
        return fileService.getFiles();
    }
}
