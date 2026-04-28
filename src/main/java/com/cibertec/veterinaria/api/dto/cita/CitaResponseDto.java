package com.cibertec.veterinaria.api.dto.cita;

import java.time.LocalDate;
import java.time.LocalTime;

public record CitaResponseDto(
        Integer idCita,
        String nombreMascota,
        LocalDate fecha,
        LocalTime hora,
        String estado
) {
}