package com.example.parcial2.service;

import com.example.parcial2.Sala;
import com.example.parcial2.repository.SalaRepository;
import org.springframework.stereotype.Service;

@Service
public class SalaService {

    private final SalaRepository salaRepository;

    public SalaService(SalaRepository salaRepository) {
        this.salaRepository = salaRepository;
    }

    // Guardar sala
    public Sala save(Sala sala) {
        return salaRepository.save(sala);
    }
}
