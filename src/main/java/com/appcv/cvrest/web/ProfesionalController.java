package com.appcv.cvrest.web;

import com.appcv.cvrest.entity.Ocupacion;
import com.appcv.cvrest.entity.Profesional;
import com.appcv.cvrest.service.ProfesionalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("${spring.api.path}/profesionales")
public class ProfesionalController {
    private final ProfesionalService profesionalService;

    @GetMapping
    public List<Profesional> findAll() {
        return profesionalService.findAll();
    }

    @PostMapping
    public Profesional create(@RequestBody Profesional profesional) {
        return profesionalService.save(profesional);
    }

    @DeleteMapping("/{id}")
    public Profesional delete(@PathVariable Long id) {
        return profesionalService.delete(id);
    }
}
