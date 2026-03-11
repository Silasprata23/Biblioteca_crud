package com.example.biblioteca.service;

import com.example.biblioteca.Entity.Usuario;
import com.example.biblioteca.dto.UsuarioDTO;
import com.example.biblioteca.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;


    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    public Usuario criarUsuario(UsuarioDTO dto){
        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());

         return usuarioRepository.save(usuario);
    }


}
