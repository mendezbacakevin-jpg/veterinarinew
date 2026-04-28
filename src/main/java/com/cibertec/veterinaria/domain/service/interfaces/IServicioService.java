package com.cibertec.veterinaria.domain.service.interfaces;


import com.cibertec.veterinaria.data.entity.Servicio;
import java.util.List;

public interface IServicioService {

    // 🔹 Devuelve lista de servicios desde BD
    List<Servicio> listarServicios();
}