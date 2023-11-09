package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pais")
public class Pais extends Auditoria{



    @Column(name = "nombre",nullable = true, unique = false, length = 50)
    private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    /**
     * relacion doble de pais a departamento
     * @ManyToOne
     *     @JoinColumn(name = "departamento")
     *     private DepartamentoEntity departamentoEntity;
     */


}
