package com.daniel.apirestjava.models;

import javax.persistence.*;

@Entity
@Table(name = "doctor")
public class DoctorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private int id;
    private String nombreDoctor;
    private String correoDoctor;
    private int telefono;
    private String fechasDisponibles;
    private String especialidad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public String getCorreoDoctor() {
        return correoDoctor;
    }

    public void setCorreoDoctor(String correoDoctor) {
        this.correoDoctor = correoDoctor;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFechasDisponibles() {
        return fechasDisponibles;
    }

    public void setFechasDisponibles(String fechasDisponibles) {
        this.fechasDisponibles = fechasDisponibles;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
