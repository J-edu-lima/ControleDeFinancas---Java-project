package com.jedu_lima.controladorDeFinancas.repository;

import com.jedu_lima.controladorDeFinancas.entity.DespesaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DespesaRepository extends MongoRepository<DespesaEntity, Long> {
}
