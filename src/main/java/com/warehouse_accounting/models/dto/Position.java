package com.warehouse_accounting.models.dto;

import lombok.Data;

@Data
public class Position {
    private Long id;
    private String name;
    private String sortNumber;

    public Position(String name, String sortNumber) {
        this.name = name;
        this.sortNumber = sortNumber;
    }
}
