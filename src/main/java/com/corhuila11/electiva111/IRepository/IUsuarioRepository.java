package com.corhuila11.electiva111.IRepository;

import com.corhuila11.electiva111.DTO.IInsertaDto;
import com.corhuila11.electiva111.DTO.ILoginDto;
import com.corhuila11.electiva111.DTO.IUsuarioDto;
import com.corhuila11.electiva111.entity.Usuario;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUsuarioRepository extends IBaseRepository <Usuario,Long> {

    @Query(value = "SELECT CONCAT(p.primer_nombre,' ', p.segundo_nombre,' ', p.primer_apellido, ' ',p.segundo_apellido) AS persona, p.tipo_documento, p.identificacion, p.correo_electronico, p.direccion, c.nombre as ciudad, u.nombre as usuario, r.nombre as rol FROM persona AS p INNER JOIN usuario AS u JOIN ciudad as c on c.id= p.id_ciudad INNER JOIN usuario_rol as ur on u.id=ur.id_usuario INNER JOIN rol as r on r.id= ur.id_rol WHERE p.state=true and u.state=true and ur.state=true and r.state=true;", nativeQuery = true)
    List<IUsuarioDto> getListPersonaUsuario();
    @Modifying
    @Query(value = "INSERT INTO `persona`(`state`, `correo_electronico`, `direccion`, `genero`, `identificacion`, `primer_apellido`, `primer_nombre`, `segundo_apellido`, `segundo_nombre`, `tipo_documento`, `id_ciudad`)"+
            "VALUES (:#{#iInsertaDto.state}, :#{#iInsertaDto.correoElectronico}, :#{#iInsertaDto.direccion}, :#{#iInsertaDto.genero}, :#{#iInsertaDto.identificacion}, :#{#iInsertaDto.primerApellido}, :#{#iInsertaDto.primerNombre}, :#{#iInsertaDto.segundoApellido}, :#{#iInsertaDto.segundoNombre}, :#{#iInsertaDto.tipoDocumento}, :#{#iInsertaDto.idCiudad})",
            nativeQuery = true)
    IInsertaDto saveInsertaDatosUser(@Param("iInsertaDto") IInsertaDto iInsertaDto) throws Exception;


    @Query(value = "SELECT u.nombre AS Usuario, u.state AS autorizacion FROM usuario AS u WHERE u.nombre = :nombre AND u.contrasena = :contrasena", nativeQuery = true)
    List<ILoginDto> getLogin(@Param("nombre") String nombre, @Param("contrasena") String contrasena);






}
