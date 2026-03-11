package com.example.biblioteca.Entity;

import jakarta.persistence.*;
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
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String email;


    @OneToOne
    @MapsId
    private CarteiraBiblioteca carteiraBiblioteca;

    @OneToMany(mappedBy = "usuario_id")
    private List<Emprestimo>emprestimos =new ArrayList<>();


}
