package com.cibertec.veterinaria.repository;
import com.cibertec.veterinaria.entity.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Integer> {

    // 🔍 Buscar por nombre
    List<Veterinario> findByNombre(String nombre);

    // 🔍 Buscar por especialidad (Cirugía, Dermatología, etc.)
    List<Veterinario> findByEspecialidad(String especialidad);

    // 🔍 Buscar por nombre exacto (para validaciones o selección)
    Optional<Veterinario> findByNombreIgnoreCase(String nombre);

}