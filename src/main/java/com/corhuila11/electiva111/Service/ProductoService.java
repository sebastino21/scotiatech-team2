package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.DTO.IProductoDto;
import com.corhuila11.electiva111.IRepository.IBaseRepository;
import com.corhuila11.electiva111.IRepository.ICiudadRepository;
import com.corhuila11.electiva111.IRepository.IProductoRepository;
import com.corhuila11.electiva111.IService.IProductoService;
import com.corhuila11.electiva111.entity.Ciudad;
import com.corhuila11.electiva111.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoService extends BaseService <Producto> implements IProductoService {

    @Override
    protected IBaseRepository<Producto, Long> getRepository()  {
        return repository;
    }

    @Autowired
    private IProductoRepository repository;

    @Override
    public List<IProductoDto> getListProducto() {
        return repository.getListProducto();
    }
}
