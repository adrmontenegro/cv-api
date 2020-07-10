package com.appcv.cvrest.service;

import com.appcv.cvrest.entity.Experiencia;

import java.util.List;

public interface ExperienciaService {
    List<Experiencia> findAll();
    Experiencia save(Experiencia experiencia);
    Experiencia delete(Long id);
}
