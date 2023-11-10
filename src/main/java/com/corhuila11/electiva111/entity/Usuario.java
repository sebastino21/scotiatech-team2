package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Usuario extends Auditoria{


    @Column(name = "nombre",nullable = false, unique = true, length = 50)
    private String nombre;

    @Column(name = "contrasena",nullable = false, unique = false, length = 50)
    private String contrasena;

    @OneToOne
    @JoinColumn(name = "id_persona",referencedColumnName = "id")
    private Persona personaId;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Persona getPersonaId() {
		return personaId;
	}

	public void setPersonaId(Persona personaId) {
		this.personaId = personaId;
	}
}
