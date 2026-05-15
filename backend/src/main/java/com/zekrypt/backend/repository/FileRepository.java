package com.zekrypt.backend.repository;

import com.zekrypt.backend.entity.FileRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<FileRecord, Long> {
}
