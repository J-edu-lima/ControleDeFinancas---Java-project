package com.controladordefinancas.model.dto;

import com.controladordefinancas.entity.enums.Categoria;

import java.math.BigDecimal;

public record CriarDespesaEntradaDTO(
        String descricao,
        BigDecimal valor,
        Categoria categoria) {
}