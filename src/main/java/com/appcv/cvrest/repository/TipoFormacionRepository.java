package com.appcv.cvrest.repository;

import com.appcv.cvrest.entity.TipoFormacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoFormacionRepository extends CrudRepository<TipoFormacion,Integer> {
}
