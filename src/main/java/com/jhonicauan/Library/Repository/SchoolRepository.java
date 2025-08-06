package com.jhonicauan.Library.Repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonicauan.Library.Model.SchoolModel;

public interface SchoolRepository extends JpaRepository<SchoolModel,UUID>{
    SchoolModel findByName(String name);
    SchoolModel findByEmailAdress(String emailAdress);
}
