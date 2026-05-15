package com.zekrypt.backend.service.interfaces;

import com.zekrypt.backend.dto.request.CreateFileRequest;
import com.zekrypt.backend.dto.response.FileResponse;

import java.util.List;

public interface FileService {

    FileResponse createFile(CreateFileRequest request);

    List<FileResponse> getFiles();
}
