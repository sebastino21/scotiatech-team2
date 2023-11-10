package com.corhuila11.electiva111.Controller;


import com.corhuila11.electiva111.DTO.ApiResponseDto;
import com.corhuila11.electiva111.DTO.IInsertaDto;
import com.corhuila11.electiva111.DTO.ILoginDto;
import com.corhuila11.electiva111.DTO.IUsuarioDto;
import com.corhuila11.electiva111.IService.IUsuarioService;
import com.corhuila11.electiva111.entity.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Usuario")

public class UsuarioController extends BaseController <Usuario,IUsuarioService>{

    public UsuarioController (IUsuarioService service) {super(service,"Usuario");}

    @GetMapping ("/get-list-persona-usuario")
    public ResponseEntity<ApiResponseDto<List<IUsuarioDto>>> getListPersonaUsuario() {
        try {
            return ResponseEntity.ok(new ApiResponseDto<List<IUsuarioDto>>("Datos obtenidos", service.getListPersonaUsuario(), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IUsuarioDto>>(e.getMessage(), null, false));
        }
    }
    
    @PostMapping("/InsertarDatos")
	public ResponseEntity<ApiResponseDto<IInsertaDto>> saveInsertaDatosUser(@RequestBody IInsertaDto iInsertaDto) {
		try {
			service.saveInsertaDatosUser(iInsertaDto);
			return ResponseEntity.ok(new ApiResponseDto<IInsertaDto>("Datos actualizados", null, true));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body(new ApiResponseDto<IInsertaDto>(e.getMessage(), null, false));
		}
	}


    @GetMapping("get-login")
    public ResponseEntity<ApiResponseDto<List<ILoginDto>>> getLogin(@RequestParam String nombre, @RequestParam String contrasena) {
        try {
            return ResponseEntity.ok(new ApiResponseDto<List<ILoginDto>>("Datos obtenidos", service.getLogin(nombre, contrasena), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<ILoginDto>>(e.getMessage(), null, true));
        }
    }


}