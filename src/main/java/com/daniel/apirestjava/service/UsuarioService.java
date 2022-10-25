package com.daniel.apirestjava.service;

import com.daniel.apirestjava.models.UsuarioModel;
import com.daniel.apirestjava.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }
    public Optional<UsuarioModel> obtenerUsuarioPorId(Long id){
        return usuarioRepository.findById(id);
    }
    public ArrayList<UsuarioModel> obtenerUsuarioPorPrioridad(Integer prioridad){
        return usuarioRepository.findByprioridad(prioridad);
    }
    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }
    public boolean eliminarUsuarioPorId(Long id){
        try {
            usuarioRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }

}
