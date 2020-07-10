package com.appcv.cvrest.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity(name = "Ocupaciones")
public class Ocupacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Boolean visible;

    @ManyToOne
    private Entidad entidad;
}
