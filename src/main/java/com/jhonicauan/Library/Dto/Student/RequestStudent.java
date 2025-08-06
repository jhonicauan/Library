package com.jhonicauan.Library.Dto.Student;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RequestStudent(
    @NotBlank(message = "O estudante deve ter um nome!")
    String name,
    @NotBlank(message = "O estudante deve ter uma senha!")
    @Size(min = 8,message = "A senha deve ter no minimo 8 characteres!")
    String password,
    @NotBlank(message = "O estudante deve ter um email!")
    @Email(message = "Formato de email invalido!")
    String email) {
    
}
