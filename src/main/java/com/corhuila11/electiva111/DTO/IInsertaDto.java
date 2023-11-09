package com.corhuila11.electiva111.DTO;

import java.math.BigInteger;

public class IInsertaDto {

    private String primernombre;
    private String segundonombre;
    private String primerapellido;
    private String segundoapellido;
    private String correo_electronico;
    private String direccion;
    private String genero;
    private Boolean  state;
    private String identificacion;

    private String tipo_documento;

    private Integer id_ciudad;

    public IInsertaDto(String primernombre, String segundonombre, String primerapellido, String segundoapellido, String correo_electronico, String direccion, String genero, Boolean state, String identificacion, String tipo_documento, Integer id_ciudad) {
        this.primernombre = primernombre;
        this.segundonombre = segundonombre;
        this.primerapellido = primerapellido;
        this.segundoapellido = segundoapellido;
        this.correo_electronico = correo_electronico;
        this.direccion = direccion;
        this.genero = genero;
        this.state = state;
        this.identificacion = identificacion;
        this.tipo_documento = tipo_documento;
        this.id_ciudad = id_ciudad;
    }

    public String getPrimernombre() {
        return primernombre;
    }

    public void setPrimernombre(String primernombre) {
        this.primernombre = primernombre;
    }

    public String getSegundonombre() {
        return segundonombre;
    }

    public void setSegundonombre(String segundonombre) {
        this.segundonombre = segundonombre;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public Integer getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(Integer id_ciudad) {
        this.id_ciudad = id_ciudad;
    }
}
