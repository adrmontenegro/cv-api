package com.appcv.cvrest.service;

import com.appcv.cvrest.entity.Formacion;

import java.util.List;

public interface FormacionService {
    List<Formacion> findAll();
    Formacion save(Formacion formacion);
    Formacion delete(Long id);
}
