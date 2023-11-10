package com.corhuila11.electiva111.Controller;

import com.corhuila11.electiva111.DTO.ApiResponseDto;
import com.corhuila11.electiva111.DTO.IProductoDto;

import com.corhuila11.electiva111.IService.IProductoService;
import com.corhuila11.electiva111.entity.Producto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Producto")

public class ProductoController extends BaseController <Producto,IProductoService>{

    public ProductoController (IProductoService service) {super(service,"Producto");}

    @GetMapping ("/get-list-producto")
    public ResponseEntity<ApiResponseDto<List<IProductoDto>>> getListProducto() {
        try {
            return ResponseEntity.ok(new ApiResponseDto<List<IProductoDto>>("Datos obtenidos", service.getListProducto(), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IProductoDto>>(e.getMessage(), null, false));
        }
    }
}