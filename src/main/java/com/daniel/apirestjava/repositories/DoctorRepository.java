package com.daniel.apirestjava.repositories;

import com.daniel.apirestjava.models.DoctorModel;
import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<DoctorModel, Long> {
}
