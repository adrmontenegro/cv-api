package com.appcv.cvrest.service;

import com.appcv.cvrest.entity.TipoFormacion;

import java.util.List;

public interface TipoFormacionService {
    List<TipoFormacion> findAll();
    TipoFormacion save(TipoFormacion tipoFormacion);
    TipoFormacion delete(Integer id);
}
