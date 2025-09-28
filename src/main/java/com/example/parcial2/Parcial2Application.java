package com.example.parcial2;

import com.example.parcial2.service.CineService;
import com.example.parcial2.service.DetalleCineService;
import com.example.parcial2.service.SalaService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Parcial2Application {

    public static void main(String[] args) {
        SpringApplication.run(Parcial2Application.class, args);
    }

    @Bean
    CommandLineRunner runner(CineService cineService, DetalleCineService detalleService, SalaService salaService) {
        return args -> {
            // Crear cine
            Cine cine = new Cine("Cine Nova", "900123456-1");

            // Crear detalle
            DetalleCine detalle = new DetalleCine("Calle 49 #41-9", "Medellin", "(604)4808822");
            cine.setDetalle(detalle);

            // Crear salas
            Sala s1 = new Sala("Sala 1", 100, "2D");
            Sala s2 = new Sala("Sala IMAX", 250, "IMAX");
            cine.addSala(s1);
            cine.addSala(s2);

            cineService.save(cine);

            System.out.println("Cine guardado: " + cine.getNombre() + " con id=" + cine.getId());
        };
    }
}
