package com.appcv.cvrest.repository;

import com.appcv.cvrest.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Long> {
}
