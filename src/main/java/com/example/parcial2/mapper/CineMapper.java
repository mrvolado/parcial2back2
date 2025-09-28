package com.example.parcial2.mapper;

import com.example.parcial2.Cine;
import com.example.parcial2.dto.CineDTO;

public class CineMapper {

    public static CineDTO toDto(Cine cine) {
        if (cine == null) return null;
        return new CineDTO(cine.getId(), cine.getNombre(), cine.getNit());
    }

    public static Cine toEntity(CineDTO dto) {
        if (dto == null) return null;
        Cine c = new Cine();
        c.setNombre(dto.getNombre());
        c.setNit(dto.getNit());
        return c;
    }
}
