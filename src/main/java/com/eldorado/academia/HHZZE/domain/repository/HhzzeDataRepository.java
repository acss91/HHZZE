package com.eldorado.academia.HHZZE.domain.repository;

import com.eldorado.academia.HHZZE.domain.model.HhzzeDataEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface HhzzeDataRepository extends MongoRepository<HhzzeDataEntity, UUID> {
}
