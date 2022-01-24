package com.startaideia.pauta.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResultadoVoto {


    private int votoSim;

    private int votoNao;


}
