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
@Table(name="voto")
public class Voto implements Serializable {

        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        private int idAssociado;

        private String voto;

        private int codPauta;

        public Voto() {

        }

        public Voto(int idAssociado, String voto) {
                this.idAssociado = idAssociado;
                this.voto = voto;
        }
}
