package com.corhuila11.electiva111.IService;

import com.corhuila11.electiva111.DTO.IInsertaDto;
import com.corhuila11.electiva111.DTO.ILoginDto;
import com.corhuila11.electiva111.DTO.IUsuarioDto;

import com.corhuila11.electiva111.entity.Usuario;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface IUsuarioService extends IBaseService <Usuario>{

List <IUsuarioDto> getListPersonaUsuario();

List<ILoginDto> getLogin(String nombre,String contrasena) throws Exception;



    void saveInsertaDatosUser(IInsertaDto iInsertaDto) throws Exception;
}
