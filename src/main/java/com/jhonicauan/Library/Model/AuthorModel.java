package com.jhonicauan.Library.Model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "tb_authors")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AuthorModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idAuthor;

    private String name;
    private String country;
    private Integer birthYear;

    public AuthorModel(String name,String country,Integer birthYear){
        this.name = name;
        this.country = country;
        this.birthYear = birthYear;
    }
}
