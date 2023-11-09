package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.DTO.IListarInformacionClienteDto;
import com.corhuila11.electiva111.IRepository.IBaseRepository;

import com.corhuila11.electiva111.IRepository.IInformacionClienteRepository;
import com.corhuila11.electiva111.IService.IInformacionClienteService;

import com.corhuila11.electiva111.entity.InformacionCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class InformacionClienteService extends BaseService <InformacionCliente> implements IInformacionClienteService {

    @Override
    protected IBaseRepository<InformacionCliente, Long> getRepository()  {
        return repository;
    }

    @Autowired
    private IInformacionClienteRepository repository;


    @Override
    public List<IListarInformacionClienteDto> getListaInformacionCliente() {
        return repository.getListaInformacionCliente();
    }
}
