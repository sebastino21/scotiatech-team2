package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "producto_cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductoCliente extends Auditoria {



    @Column(name = "estado",nullable = false, unique = false)
    private Boolean estado;

    @Column(name = "numero_cuenta",nullable = false, unique = true, length = 50)
    private String numeroCuenta;

    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Persona personaId;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto productoId;

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Persona getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Persona personaId) {
        this.personaId = personaId;
    }

    public Producto getProductoId() {
        return productoId;
    }

    public void setProductoId(Producto productoId) {
        this.productoId = productoId;
    }
}
