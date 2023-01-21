package com.eldorado.academia.HHZZE.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("hhzze-cad-peso-altura")
public class HhzzeDataEntity {

    @Id
    private UUID id;

    private double weight;

    private double height;

    private LocalDateTime dateMeasure;


}
