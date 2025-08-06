package com.jhonicauan.Library.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhonicauan.Library.Dto.Book.RequestBook;
import com.jhonicauan.Library.Dto.Book.ResponseBook;
import com.jhonicauan.Library.Service.BookService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping
    public ResponseBook addBook(@RequestBody @Valid RequestBook requestBook){
        return bookService.addBook(requestBook);
    }

    @GetMapping
    public List<ResponseBook> getBooks(){
        return bookService.getBooks();
    }

    @GetMapping("/author/{name}")
    public List<ResponseBook> getBooksByAuthor(@PathVariable String name){
        return bookService.getBooksByAuthor(name);
    }
}
