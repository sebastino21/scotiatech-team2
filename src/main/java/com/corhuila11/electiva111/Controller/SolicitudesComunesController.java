package com.corhuila11.electiva111.Controller;


import com.corhuila11.electiva111.IService.ICiudadService;
import com.corhuila11.electiva111.IService.ISolicitudesComunesService;
import com.corhuila11.electiva111.entity.SolicitudesComunes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/SolicitudesComunes")

public class SolicitudesComunesController extends BaseController <SolicitudesComunes,ISolicitudesComunesService>{

    public SolicitudesComunesController (ISolicitudesComunesService service) {super(service,"SolicitudesComunes");}
}