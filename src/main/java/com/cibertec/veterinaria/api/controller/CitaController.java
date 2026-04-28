package com.cibertec.veterinaria.api.controller;

import com.cibertec.veterinaria.data.entity.*;
import com.cibertec.veterinaria.domain.service.interfaces.ICitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;


@Controller
@RequestMapping("/api/cita")
public class CitaController {

    @Autowired
    private ICitaService citaService;

    @GetMapping("/citas")
    public String listar(Model model) {

        model.addAttribute("citas", citaService.listarCitas());

        return "listarRegistro";
    }

    @GetMapping("/form-cita")
    public String form(Model model) {

        Cita cita = new Cita();
        cita.setPrecio_cita(new BigDecimal("50.00"));
        cita.setTotal(new BigDecimal("50.00"));

        model.addAttribute("cita", cita);

        return "form-cita";
    }

    @PostMapping("/grabar")
    public String grabar(@ModelAttribute Cita cita, Model model) {

        citaService.guardarCita(cita);

        model.addAttribute("mensaje", "Cita registrada correctamente");

        return "form-cita";
    }
}
