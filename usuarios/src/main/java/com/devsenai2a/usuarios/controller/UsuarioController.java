package com.devsenai2a.usuarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devsenai2a.usuarios.entity.Usuario;
import com.devsenai2a.usuarios.service.UsuarioService;
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;
   
    @GetMapping
    public List<Usuario> listarUsuarios(){
        return service.listarTodos();
    }
   
    @PostMapping
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.cadastrar(usuario));
    }
}