package com.startaideia.pauta.repository;

import com.startaideia.pauta.models.Pauta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PautaRepository extends CrudRepository<Pauta, Long> {

    @Query("SELECT p FROM Pauta p where p.codPauta = ?1 ")
    public Pauta findAllByCodPauta(int codPauta);

}
