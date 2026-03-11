package com.example.biblioteca.service;

import com.example.biblioteca.repository.CarteiraBibliotecaRepository;
import org.springframework.stereotype.Service;

@Service
public class CarteiraBiblitecaService {

    private final CarteiraBibliotecaRepository carteiraBibliotecaRepository;

    public CarteiraBiblitecaService(CarteiraBibliotecaRepository carteiraBibliotecaRepository) {
        this.carteiraBibliotecaRepository = carteiraBibliotecaRepository;
    }


}
