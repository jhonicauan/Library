package com.jhonicauan.Library.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.jhonicauan.Library.Dto.School.RequestSchool;
import com.jhonicauan.Library.Dto.School.ResponseSchool;
import com.jhonicauan.Library.Model.SchoolModel;

@Mapper(componentModel = "spring")
public interface SchoolMapper {
    SchoolModel toEntity(RequestSchool requestSchool);

    ResponseSchool toDto(SchoolModel school);
}
