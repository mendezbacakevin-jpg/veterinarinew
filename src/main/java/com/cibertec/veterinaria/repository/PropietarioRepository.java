package com.cibertec.veterinaria.repository;

import com.cibertec.veterinaria.entity.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PropietarioRepository extends JpaRepository<Propietario, Integer> {

    // 🔍 Buscar por nombre
    List<Propietario> findByNombre(String nombre);

    // 🔍 Buscar por gmail
    Optional<Propietario> findByGmail(String gmail);

    // 🔍 Buscar por código
    Optional<Propietario> findByCodigo(String codigo);

    // 🔍 Validar si ya existe gmail
    boolean existsByGmail(String gmail);

}