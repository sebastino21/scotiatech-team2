package com.corhuila11.electiva111.Controller;

import com.corhuila11.electiva111.IService.ICiudadService;
import com.corhuila11.electiva111.IService.IInformacionClienteService;

import com.corhuila11.electiva111.entity.InformacionCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/InformacionCliente")

public class InformacionClienteController extends BaseController <InformacionCliente,IInformacionClienteService>{

    public InformacionClienteController (IInformacionClienteService service) {super(service,"InformacionCliente");}
}

