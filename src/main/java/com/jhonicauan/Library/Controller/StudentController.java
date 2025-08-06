package com.jhonicauan.Library.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhonicauan.Library.Dto.Student.RequestStudent;
import com.jhonicauan.Library.Dto.Student.ResponseStudent;
import com.jhonicauan.Library.Service.StudentService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("student")
@RequiredArgsConstructor
public class StudentController {
    
    private final StudentService studentService;

    @PostMapping
    public ResponseStudent addStudent(@RequestBody @Valid RequestStudent requestStudent){
        return studentService.addStudent(requestStudent);
    }

    @GetMapping
    public List<ResponseStudent> getStudents(){
        return studentService.getStudents();
    }
}
