package com.cibertec.veterinaria.repository;

import com.cibertec.veterinaria.entity.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ServicioRepository extends JpaRepository<Servicio, Integer> {

    // 🔍 Buscar por nombre del servicio
    List<Servicio> findByNombreServicio(String nombre_servicio);

    // 🔍 Buscar uno exacto
    Optional<Servicio> findByNombreServicioIgnoreCase(String nombre_servicio);

}