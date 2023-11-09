package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.IRepository.IBaseRepository;
import com.corhuila11.electiva111.IRepository.ICiudadRepository;
import com.corhuila11.electiva111.IRepository.IServicioRepository;
import com.corhuila11.electiva111.IService.IServicioService;
import com.corhuila11.electiva111.entity.Ciudad;
import com.corhuila11.electiva111.entity.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioService extends BaseService <Servicio> implements IServicioService {

    @Override
    protected IBaseRepository<Servicio, Long> getRepository()  {
        return repository;
    }

    @Autowired
    private IServicioRepository repository;
}
