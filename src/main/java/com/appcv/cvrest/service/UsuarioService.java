package com.appcv.cvrest.service;

import com.appcv.cvrest.entity.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> findAll();
    Usuario save(Usuario usuario);
    Usuario delete(Long id);
}
