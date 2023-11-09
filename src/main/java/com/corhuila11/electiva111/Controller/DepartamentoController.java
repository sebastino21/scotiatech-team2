package com.corhuila11.electiva111.Controller;

import com.corhuila11.electiva111.IService.ICiudadService;
import com.corhuila11.electiva111.IService.IDepartamentoService;

import com.corhuila11.electiva111.entity.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Departamento")

public class DepartamentoController extends BaseController <Departamento,IDepartamentoService>{

    public DepartamentoController (IDepartamentoService service) {super(service,"Departamento");}
}
