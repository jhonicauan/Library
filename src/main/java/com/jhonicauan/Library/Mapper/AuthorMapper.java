package com.jhonicauan.Library.Mapper;

import org.mapstruct.Mapper;

import com.jhonicauan.Library.Dto.Author.RequestAuthor;
import com.jhonicauan.Library.Dto.Author.ResponseAuthor;
import com.jhonicauan.Library.Model.AuthorModel;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
    AuthorModel toEntity(RequestAuthor requestAuthor);
    ResponseAuthor toDto(AuthorModel author);
}
