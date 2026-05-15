package com.zekrypt.backend.dto.request;

import jakarta.validation.constraints.NotBlank;

public class CreateFileRequest {

    @NotBlank(message = "File name is required")
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
