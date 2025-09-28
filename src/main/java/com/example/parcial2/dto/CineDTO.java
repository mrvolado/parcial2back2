package com.example.parcial2.dto;

public class CineDTO {
    private Long id;
    private String nombre;
    private String nit;

    public CineDTO() {
    }

    public CineDTO(Long id, String nombre, String nit) {
        this.id = id;
        this.nombre = nombre;
        this.nit = nit;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
