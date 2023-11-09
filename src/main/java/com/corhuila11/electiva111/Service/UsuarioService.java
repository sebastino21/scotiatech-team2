package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.DTO.IInsertaDto;
import com.corhuila11.electiva111.DTO.IUsuarioDto;
import com.corhuila11.electiva111.IRepository.IBaseRepository;
import com.corhuila11.electiva111.IRepository.IUsuarioRepository;
import com.corhuila11.electiva111.IService.IUsuarioService;
import com.corhuila11.electiva111.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService extends BaseService <Usuario>  implements IUsuarioService {
    @Override
    protected IBaseRepository<Usuario, Long> getRepository()  {
        return repository;
    }

    @Autowired
    private IUsuarioRepository repository;

    @Override
    public List <IUsuarioDto> getListPersonaUsuario()   {
        return repository.getListPersonaUsuario();
    }

    @Override
    public IInsertaDto saveInsertaDatosUser(IInsertaDto insertaDto)throws Exception{
        return repository.saveInsertaDatosUser(insertaDto);
    }
}
