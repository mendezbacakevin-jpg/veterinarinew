package com.cibertec.veterinaria.domain.service.interfaces;

import com.cibertec.veterinaria.data.entity.Usuario;

public interface IUsuarioService {

    void actualizar(Usuario reg);

    Usuario buscarPorEmail(String email);


    void actualizarPerfil(Usuario usuario, String email, String password);
}
