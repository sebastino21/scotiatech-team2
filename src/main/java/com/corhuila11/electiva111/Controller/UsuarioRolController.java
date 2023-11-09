package com.corhuila11.electiva111.Controller;

import com.corhuila11.electiva111.IService.ICiudadService;
import com.corhuila11.electiva111.IService.IUsuarioRolService;
import com.corhuila11.electiva111.entity.UsuarioRol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/UsuarioRol")

public class UsuarioRolController extends BaseController <UsuarioRol,IUsuarioRolService>{

    public UsuarioRolController (IUsuarioRolService service) {super(service,"UsuarioRol");}
}