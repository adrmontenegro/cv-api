package com.appcv.cvrest.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "profesionales")
public class Profesional {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombres;
    private String apellido;
    private String telefono;
    private String urlLinkedIn;
    private String datosRelevantes;
}
