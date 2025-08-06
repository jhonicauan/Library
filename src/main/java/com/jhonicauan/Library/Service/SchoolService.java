package com.jhonicauan.Library.Service;

import org.springframework.stereotype.Service;

import com.jhonicauan.Library.Dto.School.RequestSchool;
import com.jhonicauan.Library.Dto.School.ResponseSchool;
import com.jhonicauan.Library.Mapper.SchoolMapper;
import com.jhonicauan.Library.Repository.SchoolRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SchoolService {
    
    private final SchoolRepository schoolRepository;
    private final SchoolMapper schoolMapper;


    public ResponseSchool addSchool(RequestSchool requestSchool){
        if(schoolRepository.findByName(requestSchool.name()) != null) throw new RuntimeException("Nome de escola já registrado no sistema.");
        if(schoolRepository.findByEmailAdress(requestSchool.emailAdress()) != null) throw new RuntimeException("Modelo de email já esta em uso.");
        return schoolMapper.toDto(schoolRepository.save(schoolMapper.toEntity(requestSchool))); 
    }
}
