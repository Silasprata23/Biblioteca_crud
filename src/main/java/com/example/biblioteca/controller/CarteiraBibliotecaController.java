package com.example.biblioteca.controller;

import com.example.biblioteca.Entity.CarteiraBiblioteca;
import com.example.biblioteca.dto.CarteiraBibliotecaDTO;
import com.example.biblioteca.repository.CarteiraBibliotecaRepository;
import com.example.biblioteca.service.CarteiraBibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carteirabiblioteca")
public class CarteiraBibliotecaController {

    @Autowired
    CarteiraBibliotecaService carteiraBibliotecaService;

    public CarteiraBibliotecaController(CarteiraBibliotecaService carteiraBibliotecaService) {
        this.carteiraBibliotecaService = carteiraBibliotecaService;
    }

    @PostMapping(value = "/criarcarteira")
    public CarteiraBiblioteca criarcarteira(@RequestBody CarteiraBibliotecaDTO dto){
        return carteiraBibliotecaService.criarcarteira(dto);

    }
    @GetMapping(value = "/listarCarteiras")
    public List<CarteiraBiblioteca> getALL() {
        return carteiraBibliotecaService.getALL();
    }

}
