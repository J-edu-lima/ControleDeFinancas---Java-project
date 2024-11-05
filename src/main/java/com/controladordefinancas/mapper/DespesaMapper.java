package com.controladordefinancas.mapper;

import com.controladordefinancas.entity.DespesaEntity;
import com.controladordefinancas.model.CriarDespesaEntradaDTO;

public class DespesaMapper {

    public DespesaMapper(DespesaEntity despesa){
    }
    public static DespesaEntity paraEntidade(CriarDespesaEntradaDTO dto){

        return new DespesaEntity(dto.id(), dto.descricaco(), dto.valor(), dto.data(), dto.categoria());
    }
}
