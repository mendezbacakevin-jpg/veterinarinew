package com.cibertec.veterinaria.domain.service.interfaces;

import com.cibertec.veterinaria.api.dto.usuario.UsuarioRequestDto;
import com.cibertec.veterinaria.api.dto.usuario.UsuarioResponseDto;

public interface IAuthService {

    UsuarioResponseDto login(UsuarioRequestDto dto);
}