package com.corhuila11.electiva111.IRepository;

import com.corhuila11.electiva111.DTO.IListarContactoDto;
import com.corhuila11.electiva111.entity.Contacto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IContactoRepositoy extends IBaseRepository <Contacto,Long>{

    @Query(value = "SELECT ci.nombre AS ciudad, d.nombre AS departamento, p.nombre AS pais,c.numero_telefono \n" +
            "FROM contacto AS c\n" +
            "INNER JOIN ciudad AS ci ON ci.id=c.id_ciudad\n" +
            "INNER JOIN departamento AS d ON d.id=ci.id_departamento\n" +
            "INNER JOIN pais AS p ON p.id=d.id_pais\n" +
            "WHERE c.state = true AND ci.state = true AND d.state = true AND p.state = true ;",nativeQuery = true)
    List<IListarContactoDto> getListaContacto();
}
