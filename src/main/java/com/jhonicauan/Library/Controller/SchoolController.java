package com.jhonicauan.Library.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhonicauan.Library.Dto.School.RequestSchool;
import com.jhonicauan.Library.Dto.School.ResponseSchool;
import com.jhonicauan.Library.Service.SchoolService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("school")
@RequiredArgsConstructor
public class SchoolController {
    
    private final SchoolService schoolService;

    @PostMapping
    public ResponseSchool addSchool(@RequestBody @Valid RequestSchool requestSchool){
        return schoolService.addSchool(requestSchool);
    }
}
