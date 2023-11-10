package com.corhuila11.electiva111.IService;

import com.corhuila11.electiva111.DTO.IProductoDto;
import com.corhuila11.electiva111.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService extends IBaseService <Producto>{

    List<IProductoDto> getListProducto();
}
