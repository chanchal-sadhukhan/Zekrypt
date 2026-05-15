package com.zekrypt.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "files")
public class FileRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;

    public FileRecord() {
    }

    public FileRecord(String fileName) {
        this.fileName = fileName;
    }

    public Long getId() {
        return id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
