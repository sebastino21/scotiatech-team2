package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "producto")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Producto extends Auditoria{



    @Column(name = "precio",nullable = false, unique = false)
    private Float precio;

    @Column(name = "tipo",nullable = false, unique = false, length = 100)
    private String tipo;

    @Column(name = "descripcion",nullable = true, unique = false)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_servicio")
    private Servicio servicioId;

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Servicio getServicioId() {
        return servicioId;
    }

    public void setServicioId(Servicio servicioId) {
        this.servicioId = servicioId;
    }
}
