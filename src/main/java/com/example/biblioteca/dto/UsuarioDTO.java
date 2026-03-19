package com.example.biblioteca.dto;


import com.example.biblioteca.Entity.CarteiraBiblioteca;
import com.example.biblioteca.Entity.Emprestimo;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UsuarioDTO {

    private Long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String email;




}

