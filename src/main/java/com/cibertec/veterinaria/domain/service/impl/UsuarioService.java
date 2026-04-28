package com.cibertec.veterinaria.domain.service.impl;

import com.cibertec.veterinaria.data.entity.Usuario;
import com.cibertec.veterinaria.data.repository.IUsuarioRepository;
import com.cibertec.veterinaria.domain.service.interfaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public void actualizar(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void actualizarPerfil(Usuario usuario, String email, String password) {

        Usuario buscado = usuarioRepository.findById(usuario.getId()).orElse(null);

        if (buscado != null) {
            buscado.setEmail(email);
            buscado.setPassword(password);

            usuarioRepository.save(buscado);
        }
    }

    @Override
    public Usuario buscarPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }
}