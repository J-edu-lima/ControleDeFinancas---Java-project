package com.jedu_lima.controladorDeFinancas.entity;

import com.jedu_lima.controladorDeFinancas.entity.enums.Categoria;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "despesa")
public class DespesaEntity implements Serializable {

    private Long id;
    private String descricao;
    private BigDecimal valor;
    private LocalDate data;
    private Categoria categoria;

}
