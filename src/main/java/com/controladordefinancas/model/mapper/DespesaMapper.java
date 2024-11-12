package com.controladordefinancas.model.mapper;

import com.controladordefinancas.model.Despesa;
import com.controladordefinancas.model.dto.CriarDespesaEntradaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDate;

@Mapper(componentModel = "spring", imports = { LocalDate.class })
public interface DespesaMapper {

    @Mapping(target = "data", expression = "java(LocalDate.now())")
    Despesa paraEntidade(CriarDespesaEntradaDTO dto);
}