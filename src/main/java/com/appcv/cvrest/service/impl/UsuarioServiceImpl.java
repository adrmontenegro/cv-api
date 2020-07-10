package com.appcv.cvrest.service.impl;

import com.appcv.cvrest.entity.TipoFormacion;
import com.appcv.cvrest.entity.Usuario;
import com.appcv.cvrest.repository.UsuarioRepository;
import com.appcv.cvrest.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        List<Usuario> result = new ArrayList<>();
        usuarioRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario delete(Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        if (usuario.isPresent()) {
            usuarioRepository.delete(usuario.get());
            return usuario.get();
        } else {
            return null;
        }
    }
}
