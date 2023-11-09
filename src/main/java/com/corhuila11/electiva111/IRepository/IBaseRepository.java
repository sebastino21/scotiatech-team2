package com.corhuila11.electiva111.IRepository;

import com.corhuila11.electiva111.entity.Auditoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBaseRepository <T extends Auditoria,ID>extends JpaRepository<T,ID> {
}
