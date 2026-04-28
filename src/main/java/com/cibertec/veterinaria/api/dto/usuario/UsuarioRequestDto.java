package com.cibertec.veterinaria.api.dto.usuario;


public record UsuarioRequestDto(
        String email,
        String password
) {}