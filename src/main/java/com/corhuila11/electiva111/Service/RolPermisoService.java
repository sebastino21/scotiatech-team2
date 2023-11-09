package com.corhuila11.electiva111.Service;


import com.corhuila11.electiva111.IRepository.IBaseRepository;
import com.corhuila11.electiva111.IRepository.ICiudadRepository;
import com.corhuila11.electiva111.IRepository.IRolPermisoRepository;
import com.corhuila11.electiva111.IService.IRolPermisoService;
import com.corhuila11.electiva111.entity.Ciudad;
import com.corhuila11.electiva111.entity.Producto;
import com.corhuila11.electiva111.entity.RolPermiso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RolPermisoService extends BaseService <RolPermiso> implements IRolPermisoService {

    @Override
    protected IBaseRepository<RolPermiso, Long> getRepository()  {
        return repository;
    }

    @Autowired
    private IRolPermisoRepository repository;
}
