package com.appcv.cvrest.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "experiencias")
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String logro;
    private Boolean visible;

    @ManyToOne
    private Entidad entidad;
    @OneToOne
    private Ocupacion ocupacion;
}
