package com.jhonicauan.Library.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.jhonicauan.Library.Dto.Book.RequestBook;
import com.jhonicauan.Library.Dto.Book.ResponseBook;
import com.jhonicauan.Library.Model.BookModel;

@Mapper(componentModel = "spring")
public interface BookMapper {
    @Mapping(target = "author.idAuthor",source = "idAuthor")
    BookModel toEntity(RequestBook requestBook);

    @Mapping(target = "authorName",source = "author.name")
    ResponseBook toDto(BookModel book);

}
