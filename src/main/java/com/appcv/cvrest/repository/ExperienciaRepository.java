package com.appcv.cvrest.repository;

import com.appcv.cvrest.entity.Experiencia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends CrudRepository<Experiencia, Long> {

}
