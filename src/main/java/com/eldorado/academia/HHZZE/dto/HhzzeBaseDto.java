package com.eldorado.academia.HHZZE.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class HhzzeBaseDto {
     private UUID id;
    private String name;

    private String idenfication;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date birthDay;

    private Integer frequency;

    private String phoneNumber;

    private String address;

    //private char lgpd;


}
