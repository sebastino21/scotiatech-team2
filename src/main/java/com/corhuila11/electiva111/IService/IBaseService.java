package com.corhuila11.electiva111.IService;

import com.corhuila11.electiva111.entity.Auditoria;

import java.util.List;

public interface IBaseService <T extends Auditoria>{

    List<T> all();
    List<T> findByStateTrue();
    T findById(Long id) throws Exception;
    T save(T entity) throws Exception;
    void update(Long id, T entity) throws Exception;
    void delete(Long id) throws Exception;
}
