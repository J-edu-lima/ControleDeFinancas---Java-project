package com.jedu_lima.controladorDeFinancas.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "usuario")
public class UsuarioEntity implements Serializable {

    private Long id;
    private String login;
    private String senha;
}
