package com.appcv.cvrest.service.impl;

import com.appcv.cvrest.entity.Experiencia;
import com.appcv.cvrest.entity.Formacion;
import com.appcv.cvrest.repository.FormacionRepository;
import com.appcv.cvrest.service.FormacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FormacionServiceImpl implements FormacionService {
    private final FormacionRepository formacionRepository;

    @Override
    public List<Formacion> findAll() {
        List<Formacion> result = new ArrayList<>();
        formacionRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Formacion save(Formacion formacion) {
        return formacionRepository.save(formacion);
    }

    @Override
    public Formacion delete(Long id) {
        Optional<Formacion> formacion = formacionRepository.findById(id);
        if (formacion.isPresent()) {
            formacionRepository.delete(formacion.get());
            return formacion.get();
        } else {
            return null;
        }
    }
}
