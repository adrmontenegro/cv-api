package com.appcv.cvrest.repository;

import com.appcv.cvrest.entity.Entidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntidadRepository extends CrudRepository<Entidad,Long> {
}
