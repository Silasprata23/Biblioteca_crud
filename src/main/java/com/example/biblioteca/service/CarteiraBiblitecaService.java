package com.example.biblioteca.service;

import com.example.biblioteca.Entity.CarteiraBiblioteca;
import com.example.biblioteca.dto.CarteiraBibliotecaDTO;
import com.example.biblioteca.repository.CarteiraBibliotecaRepository;
import org.springframework.stereotype.Service;

@Service
public class CarteiraBiblitecaService {

    private final CarteiraBibliotecaRepository carteiraBibliotecaRepository;

    public CarteiraBiblitecaService(CarteiraBibliotecaRepository carteiraBibliotecaRepository) {
        this.carteiraBibliotecaRepository = carteiraBibliotecaRepository;
    }

    public CarteiraBiblioteca(CarteiraBibliotecaDTO dto){

        CarteiraBiblioteca carteiraBiblioteca = new CarteiraBiblioteca();
        carteiraBiblioteca.setNumeroCarteira(dto.getNumeroCarteira());
        carteiraBiblioteca.setValid(dto.isValid());
        carteiraBiblioteca.setDataEmissao();


    }



}
