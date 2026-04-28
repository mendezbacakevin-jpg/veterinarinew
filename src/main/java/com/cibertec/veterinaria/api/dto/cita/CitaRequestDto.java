package com.cibertec.veterinaria.api.dto.cita;
import java.time.LocalDate;
import java.time.LocalTime;

public record CitaRequestDto(

        // 🔹 datos que el usuario envía para registrar una cita
        Integer idUsuario,
        String nombreMascota,
        String tipoMascota,
        LocalDate fecha,
        LocalTime hora,
        String motivo

) {}
