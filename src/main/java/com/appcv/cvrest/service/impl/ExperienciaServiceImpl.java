package com.appcv.cvrest.service.impl;

import com.appcv.cvrest.entity.Entidad;
import com.appcv.cvrest.entity.Experiencia;
import com.appcv.cvrest.repository.ExperienciaRepository;
import com.appcv.cvrest.service.ExperienciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExperienciaServiceImpl implements ExperienciaService {
    private final ExperienciaRepository experienciaRepository;

    @Override
    public List<Experiencia> findAll() {
        List<Experiencia> result = new ArrayList<>();
        experienciaRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Experiencia save(Experiencia experiencia) {
        return experienciaRepository.save(experiencia);
    }

    @Override
    public Experiencia delete(Long id) {
        Optional<Experiencia> experiencia = experienciaRepository.findById(id);
        if (experiencia.isPresent()) {
            experienciaRepository.delete(experiencia.get());
            return experiencia.get();
        } else {
            return null;
        }
    }
}

