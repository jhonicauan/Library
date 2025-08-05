package com.jhonicauan.Library.Dto.Author;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record RequestAuthor(
    @NotBlank(message = "Não é permitido valores em branco para Nome")
    String name,
    @NotBlank(message = "Não é permitido valores em branco para País")
    String country,
    @Min(value= 1, message = "O ano deve ser no minimo 1")
    Integer birthYear) {
    
}
