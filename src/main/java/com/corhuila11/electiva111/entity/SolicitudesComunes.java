package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.*;
import org.w3c.dom.Text;

@Entity
@Table(name = "solicitudes_comunes")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class SolicitudesComunes extends Auditoria {


    @Column(name = "descripcion",nullable = true, unique = false)
    private String descripcion;

    @Column(name = "posible_solucion",nullable = false, unique = false)
    private String posibleSolucion;

    @Column(name = "recomendacion",nullable = false, unique = false, length = 200)
    private String recomendacion;

    @ManyToOne
    @JoinColumn(name = "id_servicio")
    private Servicio servicioId;

}
