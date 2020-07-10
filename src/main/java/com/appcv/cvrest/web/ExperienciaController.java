package com.appcv.cvrest.web;

import com.appcv.cvrest.entity.Experiencia;
import com.appcv.cvrest.service.ExperienciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("${spring.api.path}/experiencias")
public class ExperienciaController {
    private final ExperienciaService experienciaService;

    @GetMapping
    public List<Experiencia> findAll() {
        return experienciaService.findAll();
    }

    @PostMapping
    public Experiencia create(@RequestBody Experiencia experiencia) {
        return experienciaService.save(experiencia);
    }

    @DeleteMapping("/{id}")
    public Experiencia delete(@PathVariable Long id) {
        return experienciaService.delete(id);
    }
}
