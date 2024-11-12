package com.controladordefinancas.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Categoria {

    MORADIA("Moradia"),
    TRANSPORTE("Transporte"),
    ALIMENTACAO("Alimentação"),
    SAUDE("Saúde"),
    EDUCACAO("Educação"),
    OUTROS("Outros");

    private final String valor;
}