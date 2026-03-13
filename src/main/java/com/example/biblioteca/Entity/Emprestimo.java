package com.example.biblioteca.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private Date dataEmprestimo;
    @NotBlank
    private Date dataDevolucao;


    @ManyToOne
    @JoinColumn(name = "Usuario_id")

    private Usuario usuario_id;


}
