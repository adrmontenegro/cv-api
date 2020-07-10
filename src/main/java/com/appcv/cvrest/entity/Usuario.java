package com.appcv.cvrest.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String correo;
    private String contrasena;
    private String rol;
    private Boolean estado;
    @OneToOne
    private Profesional perfil;
}
