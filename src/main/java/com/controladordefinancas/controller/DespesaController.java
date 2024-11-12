package com.controladordefinancas.controller;

import com.controladordefinancas.model.mapper.DespesaMapper;
import com.controladordefinancas.model.dto.CriarDespesaEntradaDTO;
import com.controladordefinancas.service.DespesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/despesa")
public class DespesaController {

    private final DespesaService despesaService;
    private final DespesaMapper despesaMapper;

    @Autowired
    public DespesaController(DespesaService despesaService, DespesaMapper despesaMapper) {
        this.despesaService = despesaService;
        this.despesaMapper = despesaMapper;
    }

    @PostMapping
    public ResponseEntity<Void> criar(@RequestBody CriarDespesaEntradaDTO dto) {
        despesaService.criar(despesaMapper.paraEntidade(dto));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}