package com.cibertec.veterinaria.api.controller;

import com.cibertec.veterinaria.domain.service.interfaces.ICitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/propietario")
public class PropietarioController {

    @Autowired
    private ICitaService citaService;

}