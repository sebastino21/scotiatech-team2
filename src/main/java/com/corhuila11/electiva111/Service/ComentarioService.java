package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.IRepository.IBaseRepository;

import com.corhuila11.electiva111.IRepository.IComentarioRepository;
import com.corhuila11.electiva111.IService.IComentarioService;

import com.corhuila11.electiva111.entity.Comentario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ComentarioService extends BaseService <Comentario> implements IComentarioService {

    @Override
    protected IBaseRepository<Comentario, Long> getRepository()  {
        return repository;
    }

    @Autowired
    private IComentarioRepository repository;
}
