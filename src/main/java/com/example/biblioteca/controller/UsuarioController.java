package com.example.biblioteca.controller;

import com.example.biblioteca.Entity.Usuario;
import com.example.biblioteca.dto.UsuarioDTO;
import com.example.biblioteca.service.UsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping(value = "/criarUsuario")
    public Usuario criarusuario(@RequestBody UsuarioDTO dto){
        return usuarioService.criarUsuario(dto);
    }


}
