package com.appcv.cvrest.service;

import com.appcv.cvrest.entity.Ocupacion;
import com.appcv.cvrest.entity.Profesional;

import java.util.List;

public interface ProfesionalService {
    List<Profesional> findAll();

    Profesional findById(Long id);

    Profesional save(Profesional profesional);
    Profesional delete(Long id);
}
