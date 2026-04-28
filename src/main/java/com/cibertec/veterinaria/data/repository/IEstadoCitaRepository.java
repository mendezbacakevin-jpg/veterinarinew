package com.cibertec.veterinaria.data.repository;

import com.cibertec.veterinaria.data.entity.EstadoCita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstadoCitaRepository extends JpaRepository<EstadoCita, Integer> {

}
