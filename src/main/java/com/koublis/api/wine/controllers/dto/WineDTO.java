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
public class WineDTO {

    private UUID id;
    private Integer count;
    private String name;
    private Integer vintage;
    private String country;
    private String color;
    private List<String> regions;
    private String classification;
    private Boolean primeur;

}
