package com.startaideia.pauta.services;

import com.startaideia.pauta.models.ResultadoCpfBonus;
import com.startaideia.pauta.repository.UsuarioRepository;
import com.startaideia.pauta.util.ValidarCpf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ConsultaCpfBonusServiceImpl {


    @Autowired
    private UsuarioRepository usuarioRepository;

    public ResultadoCpfBonus consultarCpf(String cpf, int idUser) {


        boolean valida = ValidarCpf.isCPF(cpf);

        if(valida){
            var usuario = usuarioRepository.findAllByCodUsuario(idUser);

            if(usuario == null){

                ResultadoCpfBonus resultadoCpfBonusFalse = ResultadoCpfBonus.builder().status("UNABLE_TO_VOTE").coStatus(HttpStatus.OK).build();
                return resultadoCpfBonusFalse;
            }else{
                ResultadoCpfBonus resultadoCpfBonusTrue = ResultadoCpfBonus.builder().status("ABLE_TO_VOTE").coStatus(HttpStatus.OK).build();
                return resultadoCpfBonusTrue;
            }
        }else{

            ResultadoCpfBonus resultadoCpfBonus = ResultadoCpfBonus.builder().coStatus(HttpStatus.NOT_FOUND).build();
            return resultadoCpfBonus;
        }


    }
}
