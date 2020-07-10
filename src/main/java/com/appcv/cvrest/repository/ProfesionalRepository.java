package com.appcv.cvrest.repository;

import com.appcv.cvrest.entity.Profesional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesionalRepository extends CrudRepository<Profesional,Long> {

}
