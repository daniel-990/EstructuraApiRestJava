package com.daniel.apirestjava.controllers;

import com.daniel.apirestjava.models.UsuarioModel;
import com.daniel.apirestjava.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id){
        return this.usuarioService.obtenerUsuarioPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<UsuarioModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.usuarioService.obtenerUsuarioPorPrioridad(prioridad);
    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarUsuarioPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.eliminarUsuarioPorId(id);
        if(ok){
            return "el usuario se elimino " + id;
        }else{
            return "el usuario no se elimino " + id;
        }
    }

}
