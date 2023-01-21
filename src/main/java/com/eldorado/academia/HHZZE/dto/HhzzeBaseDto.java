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
public class HhzzeBaseDto {

    private UUID id;

    private String name;

    private String idenfication;

    private LocalDateTime birthDay;

    private Integer frequency;

    private String phoneNumber;

    private String address;

    private char lgpd;


}
