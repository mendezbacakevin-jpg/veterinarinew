package com.cibertec.veterinaria.repository;
import com.cibertec.veterinaria.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    // Buscar usuario por email (para login)
    Optional<Usuario> findByEmail(String email);

    // Buscar por username
    Optional<Usuario> findByUsername(String username);

    // Verificar si existe email (validación)
    boolean existsByEmail(String email);
}