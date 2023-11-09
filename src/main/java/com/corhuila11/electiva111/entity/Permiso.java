package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "permiso")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Permiso extends Auditoria{



    @Column(name = "descripcion", nullable = true, unique = false,length =255)
    private String descripcion;

    @Column(name = "estado", nullable = true, unique = false)
    private Boolean estado;
}
