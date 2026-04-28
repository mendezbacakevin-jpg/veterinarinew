package com.cibertec.veterinaria.api.controller;


import com.cibertec.veterinaria.domain.service.interfaces.ICitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/veterinario")
public class VeterinarioController {

    @Autowired
    private ICitaService citaService;

    @GetMapping("/listar")
    public String listar(Model model) {

        model.addAttribute("veterinarios", citaService.listarCitas());

        return "veterinarios";
    }
}