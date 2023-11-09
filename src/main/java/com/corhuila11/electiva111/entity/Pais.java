package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pais")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Pais extends Auditoria{



    @Column(name = "nombre",nullable = true, unique = false, length = 50)
    private String nombre;

    /**
     * relacion doble de pais a departamento
     * @ManyToOne
     *     @JoinColumn(name = "departamento")
     *     private DepartamentoEntity departamentoEntity;
     */


}
