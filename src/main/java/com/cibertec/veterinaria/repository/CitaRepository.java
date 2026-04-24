package com.cibertec.veterinaria.repository;
import com.cibertec.veterinaria.entity.Cita;
import com.cibertec.veterinaria.entity.Animal;
import com.cibertec.veterinaria.entity.Veterinario;
import com.cibertec.veterinaria.entity.EstadoCita;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

public interface CitaRepository extends JpaRepository<Cita, Integer> {

    // 🔍 Buscar citas por fecha
    List<Cita> findByFecha(Date fecha);

    // 🔍 Buscar citas por animal
    List<Cita> findByAnimal(Animal animal);

    // 🔍 Buscar citas por veterinario
    List<Cita> findByVeterinario(Veterinario veterinario);

    // 🔍 Buscar citas por estado
    List<Cita> findByEstadoCita(EstadoCita estadoCita);

    // 🔍 Buscar citas por fecha y veterinario
    List<Cita> findByFechaAndVeterinario(Date fecha, Veterinario veterinario);

    // 🔍 Buscar citas por animal y fecha
    List<Cita> findByAnimalAndFecha(Animal animal, Date fecha);

}