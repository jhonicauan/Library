package com.jhonicauan.Library.Specification;

import org.springframework.data.jpa.domain.Specification;

import com.jhonicauan.Library.Model.BookModel;

public class BookSpecification {
    public static Specification<BookModel> hasAuthor(String authorName){
        
        return (entity,query,conditions) -> {
            var author = entity.join("author");
            return conditions.like(conditions.lower(author.get("name")), "%" + authorName.toLowerCase() + "%");
        };
    }
}
