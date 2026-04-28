package com.cibertec.veterinaria.data.repository;

import com.cibertec.veterinaria.data.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

    // Buscar usuario por email (clave para login)
    Usuario findByEmail(String email);
}