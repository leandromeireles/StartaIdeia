package com.startaideia.pauta.services;

import com.startaideia.pauta.models.ResultadoVoto;
import com.startaideia.pauta.models.Voto;
import com.startaideia.pauta.models.VotoCreateInDto;
import com.startaideia.pauta.repository.PautaRepository;
import com.startaideia.pauta.repository.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class VotoServiceImpl {

    @Autowired
    private VotoRepository votoRepository;

    @Autowired
    private PautaRepository pautaRepository;

    public String inserirVoto(VotoCreateInDto votoCreateInDto) {
        Voto voto = Voto.builder().voto(votoCreateInDto.getVoto()).idAssociado(votoCreateInDto.getIdAssociado()).codPauta(votoCreateInDto.getCodPauta()).build();

        var pauta = pautaRepository.findAllByCodPauta(votoCreateInDto.getCodPauta());

        if(pauta.equals(null)){

            return "Pauta Inexistente";
        }

        Date dataAtual = new Date();

        if(dataAtual.getTime() > pauta.getDtInicioVotacao().getTime() && dataAtual.getTime() < pauta.getDtFimVotacao().getTime()){

            votoRepository.save(voto);
            return "Voto Computado com Sucesso";

        }else {

            return "Fora do Período de Votação";
        }

    }

    public ResultadoVoto consultarVoto(int codPauta) {

        var votoSim = votoRepository.getVotoSim(codPauta).size();

        var votoNao = votoRepository.getVotoNao(codPauta).size();

        ResultadoVoto resultadoVoto = ResultadoVoto.builder().votoSim(votoSim).votoNao(votoNao).build();

        return resultadoVoto;
    }
}
