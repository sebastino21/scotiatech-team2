package com.corhuila11.electiva111.Controller;


import com.corhuila11.electiva111.IService.ICiudadService;
import com.corhuila11.electiva111.IService.IRolPermisoService;
import com.corhuila11.electiva111.entity.RolPermiso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/RolPermiso")

public class RolPermisoController extends BaseController <RolPermiso,IRolPermisoService>{

    public RolPermisoController (IRolPermisoService service) {super(service,"RolPermiso");}
}
