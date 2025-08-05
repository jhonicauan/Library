package com.jhonicauan.Library.Controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhonicauan.Library.Dto.Author.RequestAuthor;
import com.jhonicauan.Library.Dto.Author.ResponseAuthor;
import com.jhonicauan.Library.Service.AuthorService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/author")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @PostMapping
    public ResponseAuthor addAuthor(@RequestBody @Valid RequestAuthor requestAuthor){
        return authorService.addAuthor(requestAuthor);
    }

    @GetMapping
    public List<ResponseAuthor> getAuthors(){
        return authorService.getAuthors();
    }

    @GetMapping("/{id}")
    public ResponseAuthor getAuthor(@PathVariable UUID id){
        return authorService.getAuthor(id);
    }
}
