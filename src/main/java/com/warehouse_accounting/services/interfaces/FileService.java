package com.warehouse_accounting.services.interfaces;

import com.warehouse_accounting.models.File;
import com.warehouse_accounting.models.dto.FileDto;

import java.util.List;

public interface FileService {
    List<FileDto> getAll();

    FileDto getById(Long id);

    File create(FileDto fileDto);

    File update(FileDto fileDto);

    void delete(Long id);
}
