package com.startaideia.pauta.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@Table(name="pauta")
public class Pauta implements Serializable {

        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        private int codPauta;

        private Date dtInicioVotacao;

        private Date dtFimVotacao;

        private String nomePauta;


        public Pauta() {

        }

        public Pauta(Date dtInicioVotacao, Date dtFimVotacao, String nomePauta) {
                this.dtInicioVotacao = dtInicioVotacao;
                this.dtFimVotacao = dtFimVotacao;
                this.nomePauta = nomePauta;
        }
}
