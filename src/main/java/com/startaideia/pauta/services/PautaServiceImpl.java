package com.startaideia.pauta.services;

import com.startaideia.pauta.models.Pauta;
import com.startaideia.pauta.models.PautaCreateInDto;
import com.startaideia.pauta.repository.PautaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PautaServiceImpl {

    @Autowired
    private PautaRepository pautaRepository;
    public void criarPauta(PautaCreateInDto pautaCreateInDto) {
        Pauta pauta = Pauta.builder().codPauta(pautaCreateInDto.getCodPauta()).dtInicioVotacao(pautaCreateInDto.getDtInicioVotacao()).dtFimVotacao(pautaCreateInDto.getDtFimVotacao()).nomePauta(pautaCreateInDto.getNomePauta()).build();
        pautaRepository.save(pauta);
    }
}
