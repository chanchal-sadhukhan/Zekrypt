package com.zekrypt.backend.dto.response;

import java.io.Serializable;

public class FileResponse implements Serializable {

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
