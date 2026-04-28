package com.cibertec.veterinaria.api.dto.usuario;

public record UsuarioResponseDto(
        Integer id,
        String username,
        String email
) {}