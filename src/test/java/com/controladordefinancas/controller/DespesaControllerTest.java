package com.controladordefinancas.controller;

import com.controladordefinancas.entity.enums.Categoria;
import com.controladordefinancas.model.mapper.DespesaMapper;
import com.controladordefinancas.model.dto.CriarDespesaEntradaDTO;
import com.controladordefinancas.service.DespesaService;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import java.math.BigDecimal;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DespesaControllerTest {

    @LocalServerPort
    private int port;

    @Mock
    private DespesaService service;

    @Mock
    private DespesaMapper mapper;

    private DespesaController despesaController;

    @BeforeEach
    void setUp() {
        this.despesaController = new DespesaController(service, mapper);

        RestAssured.port = port;
    }

    @Test
    @DisplayName("Ao realizar chamada externamente deve conseguir estabelecer conexão")
    void aoRealizarChamadaExternamenteDeveConseguirEstabelecerConexao() {
        int status = given()
                .contentType(ContentType.JSON)
                .body(montarDadosDeEntrada())
                .when()
                .post("/api/v1/despesa")
                .then()
                .extract()
                .statusCode();

        assertEquals(201, status);
    }




    private static CriarDespesaEntradaDTO montarDadosDeEntrada() {
        return new CriarDespesaEntradaDTO(
                "Conta de água",
                new BigDecimal("200.00"),
                Categoria.MORADIA);
    }
}