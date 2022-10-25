package com.daniel.apirestjava.service;

import com.daniel.apirestjava.models.CalendarioModel;
import com.daniel.apirestjava.repositories.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CalendarioService {

    @Autowired
    CalendarioRepository calendarioRepository;

    public ArrayList<CalendarioModel> obtenerCalendario(){
        return (ArrayList<CalendarioModel>) calendarioRepository.findAll();
    }
    public CalendarioModel guardarCalendario(CalendarioModel calendario){
        return calendarioRepository.save(calendario);
    }
}
