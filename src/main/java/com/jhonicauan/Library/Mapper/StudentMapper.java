package com.jhonicauan.Library.Mapper;

import org.mapstruct.Mapper;

import com.jhonicauan.Library.Dto.Student.RequestStudent;
import com.jhonicauan.Library.Dto.Student.ResponseStudent;
import com.jhonicauan.Library.Model.StudentModel;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentModel toEntity(RequestStudent requestStudent);
    ResponseStudent toDto(StudentModel student);
}
