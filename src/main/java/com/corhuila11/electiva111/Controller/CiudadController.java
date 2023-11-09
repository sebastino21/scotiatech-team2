package com.corhuila11.electiva111.Controller;

import com.corhuila11.electiva111.IService.ICiudadService;
import com.corhuila11.electiva111.entity.Ciudad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


    @CrossOrigin(origins = "*")
    @RestController
    @RequestMapping("v1/api/Ciudad")

    public class CiudadController extends  BaseController <Ciudad,ICiudadService>{

        public CiudadController (ICiudadService service) {super(service,"Ciudad");}

    }
