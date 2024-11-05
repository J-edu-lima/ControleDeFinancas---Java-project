package com.controladordefinancas.repository;

import com.controladordefinancas.entity.DespesaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DespesaRepository extends MongoRepository<DespesaEntity, Long> {
}
