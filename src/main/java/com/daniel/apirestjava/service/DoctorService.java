package com.daniel.apirestjava.service;

import com.daniel.apirestjava.models.DoctorModel;
import com.daniel.apirestjava.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    public ArrayList<DoctorModel> obtenerDoctor(){
        return (ArrayList<DoctorModel>) doctorRepository.findAll();
    }
    public DoctorModel guardarDoctor(DoctorModel doctor){
        return doctorRepository.save(doctor);
    }
}
