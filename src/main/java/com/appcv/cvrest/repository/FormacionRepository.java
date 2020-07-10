package com.appcv.cvrest.repository;

import com.appcv.cvrest.entity.Formacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormacionRepository extends CrudRepository<Formacion,Long> {

}
