package com.eldorado.academia.HHZZE.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class HhzzeDataDto {

    private UUID id;

    private Double weight;

    private Double height;

    private LocalDateTime dayMeasure;

}
