package com.example.biblioteca.service;

import com.example.biblioteca.Entity.CarteiraBiblioteca;
import com.example.biblioteca.Entity.Usuario;
import com.example.biblioteca.dto.CarteiraBibliotecaDTO;
import com.example.biblioteca.repository.CarteiraBibliotecaRepository;
import com.example.biblioteca.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CarteiraBibliotecaService {


    private final CarteiraBibliotecaRepository carteiraBibliotecaRepository ;

    private final UsuarioRepository usuarioRepository ;

    public CarteiraBibliotecaService(CarteiraBibliotecaRepository carteiraBibliotecaRepository, UsuarioRepository usuarioRepository) {
        this.carteiraBibliotecaRepository = carteiraBibliotecaRepository;
        this.usuarioRepository = usuarioRepository;
    }


    public CarteiraBiblioteca criarcarteira(CarteiraBibliotecaDTO dto){

        Usuario usuario = usuarioRepository.findById(get)
        CarteiraBiblioteca carteiraBiblioteca = new CarteiraBiblioteca();
        carteiraBiblioteca.setNumeroCarteira(dto.getNumeroCarteira());

        carteiraBiblioteca.setDataEmissao(new Date());
        carteiraBiblioteca.setValid(dto.isValid());

        return carteiraBibliotecaRepository.save(carteiraBiblioteca);
    }

    public List<CarteiraBiblioteca> getALL() {
        return carteiraBibliotecaRepository.findAll();
    }


}
