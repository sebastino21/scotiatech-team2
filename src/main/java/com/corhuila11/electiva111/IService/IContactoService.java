package com.corhuila11.electiva111.IService;

import com.corhuila11.electiva111.DTO.IListarContactoDto;
import com.corhuila11.electiva111.entity.Contacto;

import java.util.List;

public interface IContactoService extends IBaseService <Contacto>{
    List<IListarContactoDto> getListaContacto();
}
