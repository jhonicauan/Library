package com.jhonicauan.Library.Dto.School;

import java.util.List;
import java.util.UUID;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public record RequestSchool(
    @NotBlank(message = "A escola deve ter um nome!")
    String name, 
    @NotBlank(message = "A escola deve ter um endereço de email costumizado!")
    String emailAdress,
    @NotEmpty(message = "A escola deve constar as suas cores!")
    List<String> preferenceColors,
    @Min(value = 1,message = "Os emprestimos devem ter limite no minimo de 1 dia")
    Integer loanDays,
    @Min(value = 1,message = "Você deve permitir ao menos 1 emprestimo")
    Integer maxLoans) {}
