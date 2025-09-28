package com.example.parcial2.service;

import com.example.parcial2.Cine;
import com.example.parcial2.repository.CineRepository;
import org.springframework.stereotype.Service;

@Service
public class CineService {

    private final CineRepository cineRepository;

    public CineService(CineRepository cineRepository) {
        this.cineRepository = cineRepository;
    }

    // Guardar cine
    public Cine save(Cine cine) {
        return cineRepository.save(cine);
    }
}
