package com.jedu_lima.controladorDeFinancas.mapper;

import com.jedu_lima.controladorDeFinancas.entity.DespesaEntity;
import com.jedu_lima.controladorDeFinancas.model.CriarDespesaEntradaDTO;

public class DespesaMapper {

    public DespesaMapper(DespesaEntity despesa){
    }
    public static DespesaEntity paraEntidade(CriarDespesaEntradaDTO dto){

        return new DespesaEntity(dto.id(), dto.descricaco(), dto.valor(), dto.data(), dto.categoria());
    }
}
