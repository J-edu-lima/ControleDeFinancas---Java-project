package com.controladordefinancas.model;

import com.controladordefinancas.entity.enums.Categoria;
import com.controladordefinancas.model.dto.CriarDespesaEntradaDTO;
import com.controladordefinancas.model.mapper.DespesaMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DespesaMapperTest {

    private DespesaMapper mapper;

    @BeforeEach
    void setup() {
        mapper = Mappers.getMapper(DespesaMapper.class);
    }

    @Test
    @DisplayName("Ao criar despesa a data deve ser montada em tempo de execução")
    void aoCriarDespesaADataDeveSerMontadaEmTempoDeExecucao() {
        Despesa despesa = mapper.paraEntidade(new CriarDespesaEntradaDTO(
                "Conta de luz",
                new BigDecimal("1000.0"),
                Categoria.MORADIA
        ));

        assertNotNull(despesa.getData());
    }
}