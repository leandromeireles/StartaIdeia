package com.startaideia.pauta.api;

import com.startaideia.pauta.models.ConsultaVotoCreateInDto;
import com.startaideia.pauta.models.ResultadoVoto;
import com.startaideia.pauta.models.VotoCreateInDto;
import com.startaideia.pauta.services.VotoServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/")
@Api(value = "voto")
public class VotoController {

    @Autowired
    private VotoServiceImpl votoService;

    @ApiOperation(value = "Inserir Voto")
    @PostMapping(value = "/voto", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> inserirVoto(@RequestBody VotoCreateInDto votoCreateInDto) {

       return new ResponseEntity<String>(votoService.inserirVoto(votoCreateInDto), HttpStatus.CREATED) ;
    }

    @ApiOperation(value = "Consultar Votação")
    @GetMapping(value = "/voto", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ResultadoVoto> consultarVoto(@RequestParam int codPauta) {

        return new ResponseEntity<>(votoService.consultarVoto(codPauta) , HttpStatus.OK);
    }

}
