package com.startaideia.pauta.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class PautaCreateInDto {

    private int codPauta;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date dtInicioVotacao;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date dtFimVotacao;

    private String nomePauta;
}
