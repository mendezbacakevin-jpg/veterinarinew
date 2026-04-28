package com.cibertec.veterinaria.domain.service.impl;


import com.cibertec.veterinaria.api.dto.usuario.UsuarioRequestDto;
import com.cibertec.veterinaria.api.dto.usuario.UsuarioResponseDto;
import com.cibertec.veterinaria.data.entity.Usuario;
import com.cibertec.veterinaria.data.repository.IUsuarioRepository;
import com.cibertec.veterinaria.domain.mapper.UsuarioMapper;
import com.cibertec.veterinaria.domain.service.interfaces.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements IAuthService {

    @Autowired
    private IUsuarioRepository repoUsuario;

    @Autowired
    private UsuarioMapper mapper;

    @Override
    public UsuarioResponseDto login(UsuarioRequestDto dto) {

        // 🔹 1. Buscar usuario en BD
        Usuario usuario = repoUsuario.findByEmail(dto.email());

        // 🔹 2. Validar credenciales
        if (usuario == null || !usuario.getPassword().equals(dto.password())) {
            throw new RuntimeException("Credenciales incorrectas");
        }

        // 🔹 3. Convertir ENTITY → DTO usando MapStruct
        return mapper.toResponseDto(usuario);
    }
}