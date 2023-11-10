package com.corhuila11.electiva111.IRepository;

import com.corhuila11.electiva111.DTO.IProductoDto;
import com.corhuila11.electiva111.entity.Producto;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductoRepository extends IBaseRepository <Producto,Long> {

@Query(value = "SELECT p.precio,p.tipo,p.descripcion FROM producto as p WHERE p.state=true;",nativeQuery = true)
List<IProductoDto> getListProducto();
}
