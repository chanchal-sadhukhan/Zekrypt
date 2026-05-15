package com.zekrypt.backend.dto.response;

public class FileResponse {

    private final Long id;
    private final String fileName;

    public FileResponse(Long id, String fileName) {
        this.id = id;
        this.fileName = fileName;
    }

    public Long getId() {
        return id;
    }

    public String getFileName() {
        return fileName;
    }
}
