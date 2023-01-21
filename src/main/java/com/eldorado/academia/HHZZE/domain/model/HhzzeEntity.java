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
@Document("hhzze-cadastro")
public class HhzzeEntity {
    @Id
    private UUID id;

    private String name;

    private String idenfication;

    private LocalDateTime birthDay;

    private Integer frequency;

    private String phoneNumber;

    private String address;

    private char lgpd;

}
