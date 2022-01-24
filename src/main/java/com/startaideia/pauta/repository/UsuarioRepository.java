package com.startaideia.pauta.repository;

import com.startaideia.pauta.models.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    @Query("SELECT u FROM Usuario u where u.idUser = ?1 ")
    public Usuario findAllByCodUsuario(int idUser);
}
