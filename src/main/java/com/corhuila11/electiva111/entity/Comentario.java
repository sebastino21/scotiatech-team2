package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.*;
import org.w3c.dom.Text;

import java.util.List;

@Entity
@Table(name = "comentario")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Comentario extends Auditoria {



    @Column(name = "nombre_asesor",nullable = true, unique = false, length = 50)
    private String nombreAsesor;

    @Column(name = "solucion",nullable = true, unique = false, length = 250)
    private String solucion;

    @Column(name = "calificacion",nullable = true, unique = false, length = 250)
    private String calificacion;

    @Column(name = "sugerencia",nullable = true, unique = false, length = 250)
    private String sugerencia;

    @ManyToOne
    @JoinColumn(name = "id_informacion_cliente")
    private InformacionCliente informacionClienteId;

    public String getNombreAsesor() {
        return nombreAsesor;
    }

    public void setNombreAsesor(String nombreAsesor) {
        this.nombreAsesor = nombreAsesor;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getSugerencia() {
        return sugerencia;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }

    public InformacionCliente getInformacionClienteId() {
        return informacionClienteId;
    }

    public void setInformacionClienteId(InformacionCliente informacionClienteId) {
        this.informacionClienteId = informacionClienteId;
    }
}
