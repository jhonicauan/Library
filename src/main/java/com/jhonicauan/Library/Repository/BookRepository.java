package com.jhonicauan.Library.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.jhonicauan.Library.Model.BookModel;

public interface BookRepository extends JpaRepository<BookModel,UUID>,JpaSpecificationExecutor<BookModel>{
    
}
