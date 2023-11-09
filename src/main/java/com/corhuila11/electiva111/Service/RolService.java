package com.corhuila11.electiva111.Service;


import com.corhuila11.electiva111.IRepository.IBaseRepository;
import com.corhuila11.electiva111.IRepository.ICiudadRepository;
import com.corhuila11.electiva111.IRepository.IRolRepository;
import com.corhuila11.electiva111.IService.IRolService;

import com.corhuila11.electiva111.entity.Ciudad;
import com.corhuila11.electiva111.entity.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class RolService extends BaseService <Rol> implements IRolService {

    @Override
    protected IBaseRepository<Rol, Long> getRepository()  {
        return repository;
    }

    @Autowired
    private IRolRepository repository;
}
