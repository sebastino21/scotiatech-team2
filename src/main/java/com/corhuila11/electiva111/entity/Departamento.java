package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Table(name = "departamento")
public class Departamento extends Auditoria {



        @Column(name = "nombre",nullable = true, unique = false, length = 50)
        private String nombre;


        @ManyToOne
        @JoinColumn(name = "id_pais")
        private Pais paisId;


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public Pais getPaisId() {
			return paisId;
		}


		public void setPaisId(Pais paisId) {
			this.paisId = paisId;
		}
    }

