package com.appcv.cvrest.web;

import com.appcv.cvrest.entity.Profesional;
import com.appcv.cvrest.entity.TipoFormacion;
import com.appcv.cvrest.service.TipoFormacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("${spring.api.path}/formaciones/tipos")
public class TipoFormacionController {
    private final TipoFormacionService tipoFormacionService;

    @GetMapping
    public List<TipoFormacion> findAll() {
        return tipoFormacionService.findAll();
    }

    @GetMapping("/{id}")
    public TipoFormacion findById(@PathVariable Integer id) {
        return tipoFormacionService.findById(id);
    }

    @PostMapping
    public TipoFormacion create(@RequestBody TipoFormacion tipoFormacion) {
        return tipoFormacionService.save(tipoFormacion);
    }

    @DeleteMapping("/{id}")
    public TipoFormacion delete(@PathVariable Integer id) {
        return tipoFormacionService.delete(id);
    }
}
