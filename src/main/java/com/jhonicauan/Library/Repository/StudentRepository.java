package com.jhonicauan.Library.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonicauan.Library.Model.StudentModel;

public interface StudentRepository extends JpaRepository<StudentModel,UUID>{
    
}
