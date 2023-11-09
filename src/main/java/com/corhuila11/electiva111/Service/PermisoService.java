package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.IRepository.IBaseRepository;
import com.corhuila11.electiva111.IRepository.ICiudadRepository;
import com.corhuila11.electiva111.IRepository.IPermisoRepository;
import com.corhuila11.electiva111.IService.IPermisoService;
import com.corhuila11.electiva111.entity.Ciudad;
import com.corhuila11.electiva111.entity.Permiso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PermisoService extends BaseService <Permiso> implements IPermisoService {

    @Override
    protected IBaseRepository<Permiso, Long> getRepository()  {
        return repository;
    }

    @Autowired
    private IPermisoRepository repository;
}
