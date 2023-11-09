package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.IRepository.IBaseRepository;
import com.corhuila11.electiva111.IRepository.ICiudadRepository;
import com.corhuila11.electiva111.IRepository.IDepartamentoRepository;
import com.corhuila11.electiva111.IService.IDepartamentoService;
import com.corhuila11.electiva111.entity.Ciudad;
import com.corhuila11.electiva111.entity.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService extends BaseService <Departamento> implements IDepartamentoService {

    @Override
    protected IBaseRepository<Departamento, Long> getRepository()  {
        return repository;
    }

    @Autowired
    private IDepartamentoRepository repository;
}
