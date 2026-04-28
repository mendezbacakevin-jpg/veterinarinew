package com.cibertec.veterinaria.domain.mapper;
import com.cibertec.veterinaria.api.dto.usuario.UsuarioResponseDto;
import com.cibertec.veterinaria.data.entity.Usuario;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    // 🔹 ENTITY → DTO
    UsuarioResponseDto toResponseDto(Usuario user);

    // 🔹 LISTA DE ENTITY → LISTA DTO
    List<UsuarioResponseDto> toResponseDtoList(List<Usuario> users);
}