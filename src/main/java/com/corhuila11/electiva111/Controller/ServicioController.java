package com.corhuila11.electiva111.Controller;

import com.corhuila11.electiva111.IService.ICiudadService;
import com.corhuila11.electiva111.IService.IServicioService;
import com.corhuila11.electiva111.entity.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Servicio")

public class ServicioController extends BaseController <Servicio,IServicioService>{

    public ServicioController (IServicioService service) {super(service,"Servicio");}
}