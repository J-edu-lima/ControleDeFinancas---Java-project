package com.controladordefinancas.repository;

import com.controladordefinancas.entity.UsuarioEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<UsuarioEntity, Long> {
}
