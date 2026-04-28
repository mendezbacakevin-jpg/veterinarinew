package com.cibertec.veterinaria.domain.service.impl;

import com.cibertec.veterinaria.data.entity.Servicio;
import com.cibertec.veterinaria.data.repository.IServicioRepository;
import com.cibertec.veterinaria.domain.service.interfaces.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioService implements IServicioService {

    @Autowired
    private IServicioRepository repoServicio;

    @Override
    public List<Servicio> listarServicios() {
        return repoServicio.findAll();
    }
}