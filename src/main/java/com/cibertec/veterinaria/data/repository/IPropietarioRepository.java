package com.cibertec.veterinaria.data.repository;

import com.cibertec.veterinaria.data.entity.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPropietarioRepository extends JpaRepository<Propietario, Integer> {

}
