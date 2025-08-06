package com.jhonicauan.Library.Model;

import java.util.List;
import java.util.UUID;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_schools")
@Data
public class SchoolModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idSchool;

    private String name;

    private String emailAdress;

    private List<String> preferenceColors;

    private Integer loanDays;

    private Integer maxLoans;
}
