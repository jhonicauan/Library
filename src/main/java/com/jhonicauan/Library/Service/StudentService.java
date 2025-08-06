package com.jhonicauan.Library.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jhonicauan.Library.Dto.Student.RequestStudent;
import com.jhonicauan.Library.Dto.Student.ResponseStudent;
import com.jhonicauan.Library.Mapper.StudentMapper;
import com.jhonicauan.Library.Repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public ResponseStudent addStudent(RequestStudent requestStudent){
        return studentMapper.toDto(studentRepository.save(studentMapper.toEntity(requestStudent)));
    }

    public List<ResponseStudent> getStudents(){
        return studentRepository.findAll().stream().map(studentMapper::toDto).toList();
    }
    
}
