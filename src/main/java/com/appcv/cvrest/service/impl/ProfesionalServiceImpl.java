package com.appcv.cvrest.service.impl;

import com.appcv.cvrest.entity.Ocupacion;
import com.appcv.cvrest.entity.Profesional;
import com.appcv.cvrest.repository.ProfesionalRepository;
import com.appcv.cvrest.service.ProfesionalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProfesionalServiceImpl implements ProfesionalService {
    private final ProfesionalRepository profesionalRepository;

    @Override
    public List<Profesional> findAll() {
        List<Profesional> result = new ArrayList<>();
        profesionalRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Profesional save(Profesional profesional) {
        return profesionalRepository.save(profesional);
    }

    @Override
    public Profesional delete(Long id) {
        Optional<Profesional> profesional = profesionalRepository.findById(id);
        if (profesional.isPresent()) {
            profesionalRepository.delete(profesional.get());
            return profesional.get();
        } else {
            return null;
        }
    }
}
