package com.example.biblioteca.dto;

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

    private long id;
    private Date dataEmprestimo;
    private Date dataDevolucao;



}
