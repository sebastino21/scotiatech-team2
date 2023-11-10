package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.*;
import org.w3c.dom.Text;

@Entity
@Table(name = "informacion_cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InformacionCliente extends Auditoria {



    @Column(name = "numero_radicado",nullable = true, unique = true, length = 50)
    private String numeroRadicado;

    @Column(name = "titulo",nullable = true, unique = false, length = 150)
    private String titulo;

    @Column(name = "tipo_solicitud",nullable = true, unique = false, length = 150)
    private String tipoSolicitud;

    @Column(name = "descripcion",nullable = true, unique = false, length = 200)
    private String descripcion;

    @Column(name = "estado",nullable = true, unique = false, length = 50)
    private Boolean estado;

    @Column(name = "duracion_servicio",nullable = true, unique = false, length = 200)
    private String duracionServicio;

    @ManyToOne
    @JoinColumn(name = "id_producto_cliente")
    private ProductoCliente productoClienteId;


    public String getNumeroRadicado() {
        return numeroRadicado;
    }

    public void setNumeroRadicado(String numeroRadicado) {
        this.numeroRadicado = numeroRadicado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(String tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getDuracionServicio() {
        return duracionServicio;
    }

    public void setDuracionServicio(String duracionServicio) {
        this.duracionServicio = duracionServicio;
    }

    public ProductoCliente getProductoClienteId() {
        return productoClienteId;
    }

    public void setProductoClienteId(ProductoCliente productoClienteId) {
        this.productoClienteId = productoClienteId;
    }
}
