package com.corhuila11.electiva111.Controller;

import com.corhuila11.electiva111.IService.ICiudadService;
import com.corhuila11.electiva111.IService.IRolService;
import com.corhuila11.electiva111.entity.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Rol")

public class RolController extends BaseController <Rol,IRolService>{

    public RolController (IRolService service) {super(service,"Rol");}
}