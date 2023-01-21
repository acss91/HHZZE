package com.eldorado.academia.HHZZE.service;

import com.eldorado.academia.HHZZE.domain.model.HhzzeDataEntity;
import com.eldorado.academia.HHZZE.dto.HhzzeDataDto;
import com.eldorado.academia.HHZZE.domain.repository.HhzzeDataRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;
@Service
@RequiredArgsConstructor
@Slf4j
public class HhzzeDataService {
    private final HhzzeDataRepository hhzzeDataRepository;

    public static final String MC_S_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S = "MC: %s\n Classificação: %s\n Nivel de Obesidade: %s";

    public HhzzeDataDto saveWeightandHeight(HhzzeDataDto hhzzeDataDto) {

        var hhzzeDataEntity = HhzzeDataEntity.builder()
                .id(UUID.randomUUID())
                .dateMeasure(LocalDateTime.now())
                .height(hhzzeDataDto.getHeight())
                .weight(hhzzeDataDto.getWeight()).build();

        var hhzzeDataEntitySave = hhzzeDataRepository.save(hhzzeDataEntity);

        log.info("Weight and Height SAVED WITH SUCESSEFUL {}", hhzzeDataEntitySave);
        hhzzeDataDto.setId(hhzzeDataEntitySave.getId());

        return hhzzeDataDto;
    }
    public HhzzeDataDto  updateImc(UUID id,HhzzeDataDto hhzzeNewDataDto){
      Optional <HhzzeDataEntity> ent=hhzzeDataRepository.findById(id);
        var hhzzeDataEntity = HhzzeDataEntity.builder()
                .id(id)
                .dateMeasure(LocalDateTime.now())
                .height(hhzzeNewDataDto.getHeight())
                .weight(hhzzeNewDataDto.getWeight()).build();

        var hhzzeDataEntitySave = hhzzeDataRepository.save(hhzzeDataEntity);
        log.info("Weight and Height SAVED WITH SUCESSEFUL {}", hhzzeDataEntitySave);
        hhzzeNewDataDto.setId(hhzzeDataEntitySave.getId());

        return hhzzeNewDataDto;
    }
    public String   getImc(UUID id){
        Optional <HhzzeDataEntity> ent=hhzzeDataRepository.findById(id);
        HhzzeDataEntity entity =ent.get();
        double imc = entity.getHeight()/(entity.getWeight()*entity.getWeight());


            if (imc < 18.5) {
                return String.format(MC_S_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S, imc, " Magresa", "0");
            } else if (imc < 25) {
                return String.format(MC_S_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S, imc, " Normal", "0");
            } else if (imc < 30) {
                return String.format(MC_S_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S, imc, " Sobrepeso", "I");
            } else if (imc < 40) {
                return String.format(MC_S_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S, imc, " Obesidade ", "II");
            } else {
                return String.format(MC_S_CLASSIFICACAO_S_NIVEL_DE_OBESIDADE_S, imc, " Obesidade Grave", "III");
            }
        }




}
