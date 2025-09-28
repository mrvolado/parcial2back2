package com.example.parcial2;

import jakarta.persistence.*;

@Entity
@Table(name = "salas")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Integer capacidad;
    private String tipo; // 2D, 3D, IMAX...

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cine_id", nullable = false)
    private Cine cine;

    public Sala() {
    }

    public Sala(String nombre, Integer capacidad, String tipo) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cine getCine() {
        return cine;
    }

    public void setCine(Cine cine) {
        this.cine = cine;
    }
}
