package com.startaideia.pauta.repository;

import com.startaideia.pauta.models.Voto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VotoRepository extends CrudRepository<Voto, Long> {

    @Query("SELECT v FROM Voto v where v.codPauta = ?1 and v.voto = 'SIM' ")
    public List<Voto> getVotoSim(int codPauta);

    @Query("SELECT v FROM Voto v where v.codPauta = ?1 and v.voto = 'NAO' ")
    public List<Voto> getVotoNao(int codPauta);



}
