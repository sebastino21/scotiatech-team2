package com.corhuila11.electiva111.IRepository;

import com.corhuila11.electiva111.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends IBaseRepository <Rol,Long> {
}
