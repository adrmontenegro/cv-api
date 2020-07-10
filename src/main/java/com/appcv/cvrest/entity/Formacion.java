package com.appcv.cvrest.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity(name = "formaciones")
public class Formacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String detalle;
    private LocalDate fechaFin;
    private Boolean visible;
    @ManyToOne
    private TipoFormacion tipo;
}
