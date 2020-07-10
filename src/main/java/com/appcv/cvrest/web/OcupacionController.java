package com.appcv.cvrest.web;

import com.appcv.cvrest.entity.Formacion;
import com.appcv.cvrest.entity.Ocupacion;
import com.appcv.cvrest.service.OcupacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("${spring.api.path}/ocupaciones")
public class OcupacionController {
    private final OcupacionService ocupacionService;

    @GetMapping
    public List<Ocupacion> findAll() {
        return ocupacionService.findAll();
    }

    @PostMapping
    public Ocupacion create(@RequestBody Ocupacion ocupacion) {
        return ocupacionService.save(ocupacion);
    }

    @DeleteMapping("/{id}")
    public Ocupacion delete(@PathVariable Long id) {
        return ocupacionService.delete(id);
    }
}
