package com.eldorado.academia.HHZZE.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("hhzze-registration")
public class HhzzeEntity {
    @Id
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
