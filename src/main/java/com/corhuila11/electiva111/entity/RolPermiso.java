package com.corhuila11.electiva111.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rol_permiso")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolPermiso extends Auditoria{



    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rolId;

    @ManyToOne
    @JoinColumn(name = "id_permiso")
    private Permiso permisoId;

    public Rol getRolId() {
        return rolId;
    }

    public void setRolId(Rol rolId) {
        this.rolId = rolId;
    }

    public Permiso getPermisoId() {
        return permisoId;
    }

    public void setPermisoId(Permiso permisoId) {
        this.permisoId = permisoId;
    }
}
