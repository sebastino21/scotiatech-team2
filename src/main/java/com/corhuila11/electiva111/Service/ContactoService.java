package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.DTO.IListarContactoDto;
import com.corhuila11.electiva111.IRepository.IBaseRepository;
import com.corhuila11.electiva111.IRepository.IContactoRepositoy;
import com.corhuila11.electiva111.IService.IContactoService;
import com.corhuila11.electiva111.entity.Contacto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoService extends BaseService<Contacto>implements IContactoService {

    @Override
    protected IBaseRepository<Contacto, Long> getRepository()  {return repository;
    }

    @Autowired
    private IContactoRepositoy repository;

    @Override
    public List<IListarContactoDto> getListaContacto() {
        return repository.getListaContacto();
    }
}
