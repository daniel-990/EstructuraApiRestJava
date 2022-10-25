package com.daniel.apirestjava.controllers;

import com.daniel.apirestjava.models.CalendarioModel;
import com.daniel.apirestjava.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/calendario")
public class CalendarioController {

    @Autowired
    CalendarioService calendarioService;

    @GetMapping
    public ArrayList<CalendarioModel> obtenerCalendario(){
        return calendarioService.obtenerCalendario();
    }
    @PostMapping
    public CalendarioModel guardarCalendario(@RequestBody CalendarioModel calendario){
        return this.calendarioService.guardarCalendario(calendario);
    }
}
