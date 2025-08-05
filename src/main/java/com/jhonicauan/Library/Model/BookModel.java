package com.jhonicauan.Library.Model;

import java.util.UUID;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "tb_books")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idBook;

    private String title;

    private String sinopse;

    private Integer releaseYear = 0;

    @ManyToOne
    @JoinColumn(name = "idAuthor")
    private AuthorModel author;
}
