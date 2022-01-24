package com.startaideia.pauta.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Builder
@AllArgsConstructor
@Table(name="usuario")
public class Usuario implements Serializable {

        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        private int idUser;

        private String nomeUsuario;


        public Usuario() {

        }

        public Usuario(int idUser, String nomeUsuario) {
                this.idUser = idUser;
                this.nomeUsuario = nomeUsuario;
        }
}
