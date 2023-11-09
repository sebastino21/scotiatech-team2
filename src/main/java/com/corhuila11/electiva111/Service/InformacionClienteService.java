package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.IRepository.IBaseRepository;
import com.corhuila11.electiva111.IRepository.ICiudadRepository;
import com.corhuila11.electiva111.IRepository.IInformacionClienteRepository;
import com.corhuila11.electiva111.IService.IInformacionClienteService;
import com.corhuila11.electiva111.entity.Ciudad;
import com.corhuila11.electiva111.entity.InformacionCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Service
public class InformacionClienteService extends BaseService <InformacionCliente> implements IInformacionClienteService {

    @Override
    protected IBaseRepository<InformacionCliente, Long> getRepository()  {
        return repository;
    }

    @Autowired
    private IInformacionClienteRepository repository;
}
