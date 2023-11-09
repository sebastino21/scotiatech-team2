package com.corhuila11.electiva111.Service;

import com.corhuila11.electiva111.DTO.IInsertaDto;
import com.corhuila11.electiva111.DTO.IUsuarioDto;
import com.corhuila11.electiva111.IRepository.IBaseRepository;
import com.corhuila11.electiva111.IRepository.ICiudadRepository;
import com.corhuila11.electiva111.IRepository.IPersonaRepository;
import com.corhuila11.electiva111.IRepository.IUsuarioRepository;
import com.corhuila11.electiva111.IService.IUsuarioService;
import com.corhuila11.electiva111.entity.Persona;
import com.corhuila11.electiva111.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UsuarioService extends BaseService <Usuario>  implements IUsuarioService {
    @Override
    protected IBaseRepository<Usuario, Long> getRepository()  {
        return repository;
    }

    @Autowired
    private IUsuarioRepository repository;
    
    @Autowired
    private IPersonaRepository repositoryPerson;
    
    @Autowired
    private ICiudadRepository repositoryCiudad;

    @Override
    public List <IUsuarioDto> getListPersonaUsuario()   {
        return repository.getListPersonaUsuario();
    }

    @Override
    public void saveInsertaDatosUser(IInsertaDto insertaDto)throws Exception{
        Persona persona = new Persona();
        persona.setPrimerNombre(insertaDto.getPrimerNombre()); 
        persona.setSegundoNombre(insertaDto.getSegundoNombre()); 
        persona.setPrimerApellido(insertaDto.getPrimerApellido()); 
        persona.setSegundoApellido(insertaDto.getSegundoApellido()); 
        persona.setTipoDocumento(insertaDto.getTipoIdentificacion());
        persona.setIdentificacion(insertaDto.getIdentificacion());       
        persona.setCorreoElectronico(insertaDto.getCorreoElectronico());
        persona.setGenero(insertaDto.getGenero());
        persona.setCreatedAt(LocalDateTime.now());
        persona.getState();
        //persona.setCiudadId(repositoryCiudad.findById(insertaDto.getCiudadId()).get());
        //repositoryPerson.save(persona);        
    	this.repositoryPerson.save(persona);
    	
    	
    }
}
