package com.corhuila11.electiva111.IService;

import com.corhuila11.electiva111.DTO.IInsertaDto;
import com.corhuila11.electiva111.DTO.IUsuarioDto;

import com.corhuila11.electiva111.entity.Usuario;

import java.util.List;


public interface IUsuarioService extends IBaseService <Usuario>{

List <IUsuarioDto> getListPersonaUsuario();


    void saveInsertaDatosUser(IInsertaDto iInsertaDto) throws Exception;
}
