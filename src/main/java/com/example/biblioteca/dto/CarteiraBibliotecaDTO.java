package com.example.biblioteca.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CarteiraBibliotecaDTO {

    private Long numeroCarteira;
    private boolean isValid;

}
