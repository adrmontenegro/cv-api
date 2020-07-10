package com.appcv.cvrest.repository;

import com.appcv.cvrest.entity.Ocupacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcupacionRepository extends CrudRepository<Ocupacion,Long> {

}
