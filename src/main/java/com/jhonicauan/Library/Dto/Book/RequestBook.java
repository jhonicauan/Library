package com.jhonicauan.Library.Dto.Book;

import java.util.UUID;

public record RequestBook(String title,String sinopse,Integer releaseYear,UUID idAuthor) {
    
}
