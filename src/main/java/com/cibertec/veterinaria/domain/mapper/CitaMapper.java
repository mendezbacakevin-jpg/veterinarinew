package com.cibertec.veterinaria.domain.mapper;

import com.cibertec.veterinaria.api.dto.cita.CitaRequestDto;
import com.cibertec.veterinaria.api.dto.cita.CitaResponseDto;
import com.cibertec.veterinaria.data.entity.Cita;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CitaMapper {

    Cita toEntity(CitaRequestDto dto);

    List<CitaResponseDto> toResponseDtoList(List<Cita> citas);

}