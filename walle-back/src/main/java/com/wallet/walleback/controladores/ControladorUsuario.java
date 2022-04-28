package com.wallet.walleback.controladores;

import com.wallet.walleback.modelos.Usuario;
import com.wallet.walleback.servicios.ServicioUsiario;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@AllArgsConstructor
public class ControladorUsuario {

    private final ServicioUsiario servicioUsiario;

    @PostMapping
    public ResponseEntity crearUsuario(@RequestBody Usuario usuario){
        return new ResponseEntity(servicioUsiario.guardarUsuario(usuario) , HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity obtenerUsuario (@PathVariable("id") Long idUsuario){
        return new ResponseEntity(servicioUsiario.obtenerUsuario(idUsuario) , HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity editarUsuario(@PathVariable Long idUsuario , @RequestBody Usuario usuario){
        return new ResponseEntity(servicioUsiario.modificarUsuario(idUsuario , usuario) , HttpStatus.CREATED);
    }


    @DeleteMapping("{id}")
    public ResponseEntity eliminarUsuario(@PathVariable("id") Long idUsuario){
        boolean respuesta = servicioUsiario.eliminarUsuario(idUsuario);
        if(respuesta == true){
            return new ResponseEntity(HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
