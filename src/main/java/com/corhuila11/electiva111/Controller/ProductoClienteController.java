package com.corhuila11.electiva111.Controller;

import com.corhuila11.electiva111.IService.ICiudadService;
import com.corhuila11.electiva111.IService.IProductoClienteService;

import com.corhuila11.electiva111.entity.ProductoCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/ProductoCliente")

public class ProductoClienteController extends BaseController <ProductoCliente,IProductoClienteService>{

    public ProductoClienteController (IProductoClienteService service) {super(service,"ProductoCliente");}
}