package com.example.biblioteca.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class CarteiraBiblioteca {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numeroCarteira;
    @NotNull
    private Date dataEmissao;
    @NotNull
    private boolean isValid;


    @OneToOne(mappedBy = "carteiraBiblioteca",
    cascade = CascadeType.ALL)
    private Usuario usuario;


}
