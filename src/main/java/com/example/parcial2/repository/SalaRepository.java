package com.example.parcial2.repository;

import com.example.parcial2.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SalaRepository extends JpaRepository<Sala, Long> {
    // Consulta personalizada: buscar salas por tipo (p. ej. 'IMAX', '3D')
    List<Sala> findByTipoIgnoreCase(String tipo);
    // Otra consulta de ejemplo: capacidad mayor que
    List<Sala> findByCapacidadGreaterThan(Integer capacidad);
}
