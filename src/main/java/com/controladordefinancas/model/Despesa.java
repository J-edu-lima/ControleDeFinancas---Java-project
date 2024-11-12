package com.controladordefinancas.model;

import com.controladordefinancas.entity.enums.Categoria;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
public class Despesa {
    private String descricaco;
    private BigDecimal valor;
    private LocalDate data;
    private Categoria categoria;
}