package com.cibertec.veterinaria.data.repository;

import com.cibertec.veterinaria.data.entity.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServicioRepository extends JpaRepository<Servicio, Integer> {

}
	
	
	

