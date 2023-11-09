package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "persona")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Persona extends Auditoria{



    @Column(name = "primer_nombre",nullable = true, unique = false, length = 50)
    private String primerNombre;

    @Column(name = "segundo_nombre",nullable = false, unique = false, length = 50)
    private String segundoNombre;


    @Column(name = "primer_apellido",nullable = true, unique = false, length = 50)
    private String primerApellido;

    @Column(name = "segundo_apellido",nullable = false, unique = false, length = 50)
    private String segundoApellido;

    @Column(name = "tipo_documento",nullable = true, unique = false, length = 50)
    private String tipoDocumento;

    @Column(name = "identificacion",nullable = true, unique = true)
    private String identificacion;

    @Column(name = "genero",nullable = false, unique = false, length = 50)
    private String genero;

    @Column(name = "direccion",nullable = false, unique = false)
    private String direccion;

    @Column(name = "correo_electronico",nullable = true, unique = true)
    private String correoElectronico;

    @ManyToOne
    @JoinColumn(name = "id_ciudad")
    private Ciudad ciudadId;


	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public Ciudad getCiudadId() {
		return ciudadId;
	}

	public void setCiudadId(Ciudad ciudadId) {
		this.ciudadId = ciudadId;
	}

/**
 * @OneToMany(mappedBy = "personaEntity",cascade = CascadeType.ALL)
 *     private List<CiudadEntity> ciudadentity;
 *
 *     @ManyToOne
 *     @JoinColumn(name = "idCiudad")
 *     private CiudadEntity ciudadEntity;
 */
    
    

}
