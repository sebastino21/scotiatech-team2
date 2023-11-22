package com.corhuila11.electiva111.IRepository;

import com.corhuila11.electiva111.DTO.IListarInformacionClienteDto;
import com.corhuila11.electiva111.entity.InformacionCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IInformacionClienteRepository extends IBaseRepository <InformacionCliente,Long> {


    @Query(value = "SELECT ic.id,ic.estado as estado_informacion_cliente,ic.tipo_solicitud,ic.titulo,ic.duracion_servicio,ic.numero_radicado,p.tipo,p.descripcion as descripcion_producto,p.precio,s.descripcion AS descripcion_servicio,pc.estado as estado_producto_cliente,pc.numero_cuenta, CONCAT(pe.primer_nombre,' ', pe.segundo_nombre,' ', pe.primer_apellido, ' ',pe.segundo_apellido) AS persona,pe.correo_electronico,u.nombre as \n" +
            "            usuario,ic.descripcion as descripcion_informacion_cliente FROM informacion_cliente as ic\n" +
            "            INNER JOIN producto_cliente AS pc ON pc.id=ic.id_producto_cliente \n" +
            "            INNER JOIN producto AS p ON p.id=pc.id_producto \n" +
            "            INNER JOIN servicio AS s ON s.id=p.id_servicio \n" +
            "            INNER JOIN persona AS pe ON pe.id=pc.id_persona \n" +
            "            INNER JOIN usuario AS u ON pe.id=u.id_persona \n" +
            "            WHERE ic.state=true and pc.state=true and p.state=true and s.state=true and pe.state=true and u.state=true;",nativeQuery = true)
    List<IListarInformacionClienteDto> getListaInformacionCliente();
}
