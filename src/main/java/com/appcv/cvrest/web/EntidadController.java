package com.appcv.cvrest.web;

import com.appcv.cvrest.entity.Entidad;
import com.appcv.cvrest.service.EntidadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("${spring.api.path}/entidades")
public class EntidadController {
    private final EntidadService entidadService;

    @GetMapping
    public List<Entidad> findAll() {
        return entidadService.findAll();
    }

    @PostMapping
    public Entidad create(@RequestBody Entidad entidad) {
        return entidadService.save(entidad);
    }

    @DeleteMapping("/{id}")
    public Entidad delete(@PathVariable Long id) {
        return entidadService.delete(id);
    }
}
