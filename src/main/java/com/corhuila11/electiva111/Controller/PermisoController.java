package com.corhuila11.electiva111.Controller;


import com.corhuila11.electiva111.IService.ICiudadService;
import com.corhuila11.electiva111.IService.IPermisoService;
import com.corhuila11.electiva111.entity.Permiso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Permiso")

public class PermisoController extends BaseController <Permiso,IPermisoService>{

    public PermisoController (IPermisoService service) {super(service,"Permiso");}
}

