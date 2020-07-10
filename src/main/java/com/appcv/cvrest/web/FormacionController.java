package com.appcv.cvrest.web;

import com.appcv.cvrest.entity.Formacion;
import com.appcv.cvrest.service.FormacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("${spring.api.path}/formaciones")
public class FormacionController {
    private final FormacionService formacionService;

    @GetMapping
    public List<Formacion> findAll() {
        return formacionService.findAll();
    }

    @PostMapping
    public Formacion create(@RequestBody Formacion formacion) {
        return formacionService.save(formacion);
    }

    @DeleteMapping("/{id}")
    public Formacion delete(@PathVariable Long id) {
        return formacionService.delete(id);
    }
}
