package com.startaideia.pauta.models;

import lombok.Data;

@Data
public class VotoCreateInDto {

    private int idAssociado;

    private String voto;

    private int codPauta;
}
