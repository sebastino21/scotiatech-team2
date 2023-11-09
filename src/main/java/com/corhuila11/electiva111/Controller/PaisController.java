package com.corhuila11.electiva111.Controller;

import com.corhuila11.electiva111.IService.ICiudadService;
import com.corhuila11.electiva111.IService.IPaisService;
import com.corhuila11.electiva111.entity.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Pais")

public class PaisController extends BaseController <Pais,IPaisService>{

    public PaisController (IPaisService service) {super(service,"Pais");}
}

