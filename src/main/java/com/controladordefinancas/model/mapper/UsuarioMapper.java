package com.controladordefinancas.model.mapper;

import com.controladordefinancas.entity.UsuarioEntity;
import com.controladordefinancas.model.dto.CriarUsuarioEntradaDTO;

public class UsuarioMapper {

    public UsuarioMapper(UsuarioEntity usuario){
    }
    public static UsuarioEntity paraEntidade(CriarUsuarioEntradaDTO dto){

        return new UsuarioEntity(dto.id(), dto.login(), dto.senha());
    }

}
