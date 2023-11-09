package com.corhuila11.electiva111.IRepository;

import com.corhuila11.electiva111.entity.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServicioRepository extends IBaseRepository <Servicio,Long> {
}
