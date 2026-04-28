package com.cibertec.veterinaria.api.controller;


import com.cibertec.veterinaria.domain.service.interfaces.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/servicio")
public class ServicioController {

    @Autowired
    private IServicioService servicioService;

    @GetMapping("/listar")
    public String listar(Model model) {

        model.addAttribute("servicios", servicioService.listarServicios());

        return "servicios";
    }
}