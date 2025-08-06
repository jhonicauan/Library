package com.jhonicauan.Library.Model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tb_student")
public class StudentModel extends UserModel{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idStudent;

    private Integer loansNumber = 0;
}
