package com.example.parcial2.repository;

import com.example.parcial2.DetalleCine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DetalleCineRepository extends JpaRepository<DetalleCine, Long> {

    // Consulta personalizada: buscar detalles por ciudad usando JPQL
    @Query("SELECT d FROM DetalleCine d WHERE d.ciudad = :ciudad")
    List<DetalleCine> findByCiudad(@Param("ciudad") String ciudad);
}
