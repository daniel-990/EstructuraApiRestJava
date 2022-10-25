package com.daniel.apirestjava.repositories;

import com.daniel.apirestjava.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    public abstract ArrayList<UsuarioModel> findByprioridad(Integer prioridad);
}
