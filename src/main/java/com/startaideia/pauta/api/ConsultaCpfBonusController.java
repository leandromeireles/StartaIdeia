package com.startaideia.pauta.api;

import com.startaideia.pauta.models.ResultadoCpfBonus;
import com.startaideia.pauta.models.ResultadoVoto;
import com.startaideia.pauta.services.ConsultaCpfBonusServiceImpl;
import com.startaideia.pauta.services.PautaServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/")
@Api(value = "cpf")
public class ConsultaCpfBonusController {

    @Autowired
    private ConsultaCpfBonusServiceImpl consultaCpfBonusService;

    @ApiOperation(value = "Consultar cpf valido Bonus")
    @GetMapping(value = "/cpf", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ResultadoCpfBonus> consultarCpf(@RequestParam String cpf, @RequestParam int codUser) {

        var resultado = consultaCpfBonusService.consultarCpf(cpf, codUser);

        return new ResponseEntity<>(resultado, resultado.getCoStatus());
    }





}
