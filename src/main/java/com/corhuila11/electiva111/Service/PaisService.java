package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.IRepository.IBaseRepository;
import com.corhuila11.electiva111.IRepository.ICiudadRepository;
import com.corhuila11.electiva111.IRepository.IPaisRepository;
import com.corhuila11.electiva111.IService.IPaisService;
import com.corhuila11.electiva111.entity.Ciudad;
import com.corhuila11.electiva111.entity.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisService extends BaseService <Pais> implements IPaisService {

    @Override
    protected IBaseRepository<Pais, Long> getRepository()  {
        return repository;
    }

    @Autowired
    private IPaisRepository repository;
}
