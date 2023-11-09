package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario_rol")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioRol extends Auditoria{


    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuarioId;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rolId;
}
