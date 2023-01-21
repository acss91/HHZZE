package com.eldorado.academia.HHZZE.controller;

import com.eldorado.academia.HHZZE.dto.HhzzeBaseDto;
import com.eldorado.academia.HHZZE.dto.HhzzeDataDto;
import com.eldorado.academia.HHZZE.service.HhzzeDataService;
import com.eldorado.academia.HHZZE.service.HhzzeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/hhzze-cadastro")
@Slf4j
@RequiredArgsConstructor
public class HhzzeController{
    private final HhzzeDataService hhzzeDataService;
    private final HhzzeService hhzzeService ;
    ;

    @PostMapping
    public ResponseEntity<HhzzeBaseDto> saveRegistration(@RequestBody HhzzeBaseDto hhzzeBaseDto) {
        log.info("Registration Base {} ", hhzzeBaseDto);
        return ResponseEntity.ok(hhzzeService.saveRegistration(hhzzeBaseDto));
    }
    @PostMapping
    public ResponseEntity<HhzzeDataDto> saveRegistrationWeightandHeight(@RequestBody HhzzeDataDto hhzzeDataDto) {
        log.info("Registration Data Weight and Height {} ", hhzzeDataDto);
        return ResponseEntity.ok(hhzzeDataService.saveWeightandHeight(hhzzeDataDto));
    }


    @PutMapping("/{imcId}")
    public ResponseEntity<HhzzeDataDto> updateImc(@PathVariable UUID imcId,@RequestBody HhzzeDataDto hhzzeNewDataDto) {
        HhzzeDataDto hhzzeDataDto = hhzzeDataService.updateImc(imcId, hhzzeNewDataDto);

        log.warn("PUT IMC  IMPLEMENTED {}", imcId);

        return new ResponseEntity<HhzzeDataDto>(hhzzeDataDto, HttpStatus.OK);



    }



    @GetMapping("/{imcId}")
    public ResponseEntity<String>getImc(@PathVariable UUID imcId){
            String imc = hhzzeDataService.getImc(imcId);
            log.warn("GET IMC BY ID  IMPLEMENTED {}", imcId);
            return new ResponseEntity<String>(imc, HttpStatus.OK);


    }




}