package com.example.biblioteca.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class EmprestimoDTO {

    private Long id;
    @NotBlank
    private Date dataEmprestimo;
    @NotBlank
    private Date dataDevolucao;



}
