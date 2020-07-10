package com.appcv.cvrest.service.impl;

import com.appcv.cvrest.entity.Entidad;
import com.appcv.cvrest.repository.EntidadRepository;
import com.appcv.cvrest.service.EntidadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EntidadServiceImpl implements EntidadService {
    private final EntidadRepository entidadRepository;

    @Override
    public List<Entidad> findAll() {
        List<Entidad> result = new ArrayList<>();
        entidadRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Entidad save(Entidad entidad) {
        return entidadRepository.save(entidad);
    }

    @Override
    public Entidad delete(Long id) {
        Optional<Entidad> entidad = entidadRepository.findById(id);
        if (entidad.isPresent()) {
            entidadRepository.delete(entidad.get());
            return entidad.get();
        } else {
            return null;
        }
    }
}
