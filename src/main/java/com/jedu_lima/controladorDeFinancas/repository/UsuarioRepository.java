package com.jedu_lima.controladorDeFinancas.repository;

import com.jedu_lima.controladorDeFinancas.entity.UsuarioEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<UsuarioEntity, Long> {
}
