package com.appcv.cvrest.service.impl;

import com.appcv.cvrest.entity.Ocupacion;
import com.appcv.cvrest.repository.OcupacionRepository;
import com.appcv.cvrest.service.OcupacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OcupacionServiceImpl implements OcupacionService {
    private final OcupacionRepository ocupacionRepository;

    @Override
    public List<Ocupacion> findAll() {
        List<Ocupacion> result = new ArrayList<>();
        ocupacionRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Ocupacion findById(Long id) {
        Optional<Ocupacion> ocupacion = ocupacionRepository.findById(id);
        return ocupacion.isPresent() ? ocupacion.get() : null;
    }

    @Override
    public Ocupacion save(Ocupacion ocupacion) {
        return ocupacionRepository.save(ocupacion);
    }

    @Override
    public Ocupacion delete(Long id) {
        Optional<Ocupacion> ocupacion = ocupacionRepository.findById(id);
        if (ocupacion.isPresent()) {
            ocupacionRepository.delete(ocupacion.get());
            return ocupacion.get();
        } else {
            return null;
        }
    }
}
