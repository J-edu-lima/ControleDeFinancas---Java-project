package com.jedu_lima.controladorDeFinancas.mapper;

import com.jedu_lima.controladorDeFinancas.entity.UsuarioEntity;
import com.jedu_lima.controladorDeFinancas.model.CriarUsuarioEntradaDTO;

public class UsuarioMapper {

    public UsuarioMapper(UsuarioEntity usuario){
    }
    public static UsuarioEntity paraEntidade(CriarUsuarioEntradaDTO dto){

        return new UsuarioEntity(dto.id(), dto.login(), dto.senha());
    }

}
