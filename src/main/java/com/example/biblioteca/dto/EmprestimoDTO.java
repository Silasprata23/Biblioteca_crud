package com.example.biblioteca.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class EmprestimoDTO {

    private long id;
    private Date dataEmprestimo;
    private Date dataDevolucao;



}
