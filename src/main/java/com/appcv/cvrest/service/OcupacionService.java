package com.appcv.cvrest.service;

import com.appcv.cvrest.entity.Ocupacion;

import java.util.List;

public interface OcupacionService {
    List<Ocupacion> findAll();

    Ocupacion findById(Long id);

    Ocupacion save(Ocupacion ocupacion);
    Ocupacion delete(Long id);
}
