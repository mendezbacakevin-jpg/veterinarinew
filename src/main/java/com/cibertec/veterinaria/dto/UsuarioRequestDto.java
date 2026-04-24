package com.cibertec.veterinaria.dto;

public record UsuarioRequestDto(
        String username,
        String email,
        String password
) {
}