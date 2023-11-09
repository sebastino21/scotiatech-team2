package com.corhuila11.electiva111.Service;


import com.corhuila11.electiva111.IRepository.IBaseRepository;
import com.corhuila11.electiva111.IRepository.ICiudadRepository;
import com.corhuila11.electiva111.IRepository.IUsuarioRolRepository;

import com.corhuila11.electiva111.IService.IUsuarioRolService;
import com.corhuila11.electiva111.entity.Ciudad;
import com.corhuila11.electiva111.entity.UsuarioRol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsuarioRolService extends BaseService <UsuarioRol> implements IUsuarioRolService {

    @Override
    protected IBaseRepository<UsuarioRol, Long> getRepository()  {
        return repository;
    }

    @Autowired
    private IUsuarioRolRepository repository;

}
