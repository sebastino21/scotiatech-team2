package com.corhuila11.electiva111.IService;


import com.corhuila11.electiva111.DTO.IListarInformacionClienteDto;
import com.corhuila11.electiva111.entity.InformacionCliente;


import java.util.List;

public interface IInformacionClienteService extends IBaseService <InformacionCliente>{

    List<IListarInformacionClienteDto> getListaInformacionCliente();
}
