package com.koublis.api.wine.controllers.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CaveDTO {
    private UUID id;
    private String name;
    private List<WineDTO> wines;
}
