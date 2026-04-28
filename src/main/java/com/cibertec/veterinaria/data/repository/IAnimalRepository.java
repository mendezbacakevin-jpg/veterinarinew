package com.cibertec.veterinaria.data.repository;


import com.cibertec.veterinaria.data.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAnimalRepository extends JpaRepository<Animal, Integer> {

}