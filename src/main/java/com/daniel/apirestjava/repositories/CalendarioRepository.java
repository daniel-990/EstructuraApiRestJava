package com.daniel.apirestjava.repositories;

import com.daniel.apirestjava.models.CalendarioModel;
import org.springframework.data.repository.CrudRepository;

public interface CalendarioRepository extends CrudRepository<CalendarioModel, Long> {
}
