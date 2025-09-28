package com.example.parcial2.repository;

import com.example.parcial2.Cine;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CineRepository extends JpaRepository<Cine, Long> {
    // Consulta personalizada: buscar cines por nombre (contenga, ignore case)
    List<Cine> findByNombreContainingIgnoreCase(String nombre);
}
