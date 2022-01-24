package com.startaideia.pauta.api;

import com.startaideia.pauta.models.ConsultaVotoCreateInDto;
import com.startaideia.pauta.models.PautaCreateInDto;
import com.startaideia.pauta.models.ResultadoVoto;
import com.startaideia.pauta.services.PautaServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/")
@Api(value = "pauta")
public class PautaController {

    @Autowired
    private PautaServiceImpl pautaService;

    @ApiOperation(value = "Criar Pauta")
    @PostMapping(value = "/pauta", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void criarPauta(@RequestBody PautaCreateInDto pautaCreateInDto) {

        pautaService.criarPauta(pautaCreateInDto);
    }



}
