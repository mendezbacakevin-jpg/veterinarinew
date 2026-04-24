package com.cibertec.veterinaria.repository;
import com.cibertec.veterinaria.entity.EstadoCita;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstadoCitaRepository extends JpaRepository<EstadoCita, Integer> {

    // 🔍 Buscar por nombre del estado
    Optional<EstadoCita> findByNombreEstado(String nombre_estado);

}