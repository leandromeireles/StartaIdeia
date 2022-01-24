package com.startaideia.pauta.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class ResultadoCpfBonus {

    private String status;

    private HttpStatus coStatus;
}
