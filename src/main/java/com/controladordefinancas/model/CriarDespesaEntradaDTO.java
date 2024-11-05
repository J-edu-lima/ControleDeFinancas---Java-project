package com.controladordefinancas.model;

import com.controladordefinancas.entity.enums.Categoria;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CriarDespesaEntradaDTO(Long id, String descricaco, BigDecimal valor, LocalDate data, Categoria categoria) {
}
