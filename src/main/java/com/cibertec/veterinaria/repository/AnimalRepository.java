package com.cibertec.veterinaria.repository;
import com.cibertec.veterinaria.entity.Animal;
import com.cibertec.veterinaria.entity.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    // 🔍 Buscar por nombre
    List<Animal> findByNombre(String nombre);

    // 🔍 Buscar por especie (Perro, Gato, etc.)
    List<Animal> findByEspecie(String especie);

    // 🔍 Buscar por raza
    List<Animal> findByRaza(String raza);

    // 🔍 Buscar por propietario
    List<Animal> findByPropietario(Propietario propietario);

    // 🔍 Buscar por nombre y propietario
    List<Animal> findByNombreAndPropietario(String nombre, Propietario propietario);

}
