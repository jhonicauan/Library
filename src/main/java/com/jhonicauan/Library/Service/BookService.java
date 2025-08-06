package com.jhonicauan.Library.Service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.jhonicauan.Library.Dto.Book.RequestBook;
import com.jhonicauan.Library.Dto.Book.ResponseBook;
import com.jhonicauan.Library.Mapper.BookMapper;
import com.jhonicauan.Library.Model.BookModel;
import com.jhonicauan.Library.Repository.BookRepository;
import com.jhonicauan.Library.Specification.BookSpecification;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookMapper bookMapper;
    private final BookRepository bookRepository;

    public ResponseBook addBook(RequestBook requestBook){
        return bookMapper.toDto(bookRepository.save(bookMapper.toEntity(requestBook)));
    }

    public List<ResponseBook> getBooks(){
        return bookRepository.findAll().stream().map(bookMapper::toDto).toList();
    }

    public List<ResponseBook> getBooksByAuthor(String name){
        Specification<BookModel> spec = BookSpecification.hasAuthor(name);
        return bookRepository.findAll(spec).stream().map(bookMapper::toDto).toList();
    }
}
