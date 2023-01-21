package com.eldorado.academia.HHZZE.domain.repository;

import com.eldorado.academia.HHZZE.domain.model.HhzzeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface HhzzeRepository extends MongoRepository<HhzzeEntity, UUID> {

}
