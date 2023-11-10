package com.corhuila11.electiva111.Controller;


import com.corhuila11.electiva111.DTO.ApiResponseDto;
import com.corhuila11.electiva111.DTO.IListarContactoDto;
import com.corhuila11.electiva111.DTO.IListarInformacionClienteDto;
import com.corhuila11.electiva111.IService.ICiudadService;
import com.corhuila11.electiva111.IService.IContactoService;
import com.corhuila11.electiva111.entity.Contacto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Contacto")
public class ContactoController extends BaseController <Contacto, IContactoService>{

    public ContactoController (IContactoService service) {super(service,"Contacto");}

    @GetMapping("/get-list-informacion-Contacto")
    public ResponseEntity<ApiResponseDto<List<IListarContactoDto>>> getListaContacto(){
        try {
            return ResponseEntity.ok(new ApiResponseDto<List<IListarContactoDto>>("Datos obtenidos", service.getListaContacto(), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IListarContactoDto>>(e.getMessage(), null, false));
        }
    }


}
