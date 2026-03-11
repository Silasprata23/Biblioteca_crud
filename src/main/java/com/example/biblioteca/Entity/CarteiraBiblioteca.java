package com.example.biblioteca.Entity;

import jakarta.persistence.*;
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
public class CarteiraBiblioteca {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long numeroCarteira;

    private Date dataEmissao;

    private boolean isValid;


    @OneToOne(mappedBy = "carteiraBiblioteca",
    cascade = CascadeType.ALL)
    private Usuario usuario;

}
