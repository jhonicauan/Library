package com.jhonicauan.Library.Dto.Author;

import java.util.UUID;

public record ResponseAuthor(UUID idAuthor,String name,String country,Integer birthYear) {
    
}
