package com.daniel.apirestjava.controllers;

import com.daniel.apirestjava.models.DoctorModel;
import com.daniel.apirestjava.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @GetMapping
    public ArrayList<DoctorModel> obtenerDoctores(){
        return doctorService.obtenerDoctor();
    }

    @PostMapping
    public DoctorModel guardarDoctor(@RequestBody DoctorModel doctor){
        return this.doctorService.guardarDoctor(doctor);
    }

}
