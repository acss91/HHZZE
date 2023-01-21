package com.eldorado.academia.HHZZE.service;

import com.eldorado.academia.HHZZE.domain.model.HhzzeEntity;
import com.eldorado.academia.HHZZE.domain.repository.HhzzeRepository;
import com.eldorado.academia.HHZZE.dto.HhzzeBaseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class HhzzeService {
    private final HhzzeRepository hhzzeRepository;

    public HhzzeBaseDto saveRegistration(HhzzeBaseDto hhzzeBaseDto) {

        var hhzzeEntity = HhzzeEntity.builder()
                .id(UUID.randomUUID())
                .birthDay(hhzzeBaseDto.getBirthDay())
                .name(hhzzeBaseDto.getName())
                .idenfication(hhzzeBaseDto.getIdenfication())
                .phoneNumber(hhzzeBaseDto.getPhoneNumber())
                .frequency(hhzzeBaseDto.getFrequency())
                .address(hhzzeBaseDto.getAddress())
                .build();

        var hhzzeEntitySave = hhzzeRepository.save(hhzzeEntity);

        log.info(" SAVED WITH SUCESSEFUL {}", hhzzeEntitySave);
        hhzzeBaseDto.setId(hhzzeEntitySave.getId());

        return hhzzeBaseDto;
    }

}
