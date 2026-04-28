package com.cibertec.veterinaria.data.repository;

import com.cibertec.veterinaria.data.entity.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVeterinarioRepository extends JpaRepository<Veterinario, Integer> {

}