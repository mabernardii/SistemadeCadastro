package com.devsenai2a.usuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsenai2a.usuarios.entity.Usuario;
import com.devsenai2a.usuarios.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    public Usuario cadastrar(Usuario usuario) {
        return repository.save(usuario);
    }
}
