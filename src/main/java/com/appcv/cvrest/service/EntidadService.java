package com.appcv.cvrest.service;

import com.appcv.cvrest.entity.Entidad;

import java.util.List;

public interface EntidadService {
    List<Entidad> findAll();

    Entidad findById(Long id);

    Entidad save(Entidad entidad);

    Entidad delete(Long id);
}
