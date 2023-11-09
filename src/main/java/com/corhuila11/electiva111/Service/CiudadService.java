package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.IRepository.IBaseRepository;
import com.corhuila11.electiva111.IRepository.ICiudadRepository;
import com.corhuila11.electiva111.IService.ICiudadService;
import com.corhuila11.electiva111.entity.Ciudad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CiudadService extends BaseService<Ciudad> implements ICiudadService {

    @Override
    protected IBaseRepository<Ciudad, Long> getRepository()  {
        return repository;
    }

    @Autowired
    private ICiudadRepository repository;
}

