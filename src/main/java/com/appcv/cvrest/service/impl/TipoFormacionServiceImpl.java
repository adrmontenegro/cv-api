package com.appcv.cvrest.service.impl;

import com.appcv.cvrest.entity.Profesional;
import com.appcv.cvrest.entity.TipoFormacion;
import com.appcv.cvrest.repository.TipoFormacionRepository;
import com.appcv.cvrest.service.TipoFormacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TipoFormacionServiceImpl implements TipoFormacionService {
    private final TipoFormacionRepository tipoFormacionRepository;

    @Override
    public List<TipoFormacion> findAll() {
        List<TipoFormacion> result = new ArrayList<>();
        tipoFormacionRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public TipoFormacion save(TipoFormacion tipoFormacion) {
        return tipoFormacionRepository.save(tipoFormacion);
    }

    @Override
    public TipoFormacion delete(Integer id) {
        Optional<TipoFormacion> tipoFormacion = tipoFormacionRepository.findById(id);
        if (tipoFormacion.isPresent()) {
            tipoFormacionRepository.delete(tipoFormacion.get());
            return tipoFormacion.get();
        } else {
            return null;
        }
    }
}
