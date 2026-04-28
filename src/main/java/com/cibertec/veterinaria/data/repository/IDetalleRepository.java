package com.cibertec.veterinaria.data.repository;

import com.cibertec.veterinaria.data.entity.DetalleCita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalleRepository extends JpaRepository<DetalleCita, Integer> {

}