package com.corhuila11.electiva111.IRepository;

import com.corhuila11.electiva111.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaisRepository extends IBaseRepository <Pais,Long> {
}
