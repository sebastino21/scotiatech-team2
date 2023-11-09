package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.IRepository.IBaseRepository;
import com.corhuila11.electiva111.IRepository.ICiudadRepository;
import com.corhuila11.electiva111.IRepository.IProductoClienteRepository;
import com.corhuila11.electiva111.IService.IProductoClienteService;
import com.corhuila11.electiva111.entity.Ciudad;
import com.corhuila11.electiva111.entity.ProductoCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoClienteService extends BaseService <ProductoCliente> implements IProductoClienteService {

    @Override
    protected IBaseRepository<ProductoCliente, Long> getRepository()  {
        return repository;
    }

    @Autowired
    private IProductoClienteRepository repository;
}
