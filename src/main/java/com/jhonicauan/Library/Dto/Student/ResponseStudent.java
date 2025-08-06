package com.jhonicauan.Library.Dto.Student;

import java.util.UUID;

public record ResponseStudent(UUID idStudent,String name,String email,Integer loansNumber) {
    
}
