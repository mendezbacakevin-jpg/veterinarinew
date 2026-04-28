package com.cibertec.veterinaria.data.repository;

import com.cibertec.veterinaria.data.entity.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICitaRepository extends JpaRepository<Cita, Integer> {

}