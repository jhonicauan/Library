package com.jhonicauan.Library.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jhonicauan.Library.Dto.Author.RequestAuthor;
import com.jhonicauan.Library.Dto.Author.ResponseAuthor;
import com.jhonicauan.Library.Mapper.AuthorMapper;
import com.jhonicauan.Library.Model.AuthorModel;
import com.jhonicauan.Library.Repository.AuthorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthorService {
    
    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    public ResponseAuthor addAuthor(RequestAuthor requestAuthor){
        System.out.println(requestAuthor.birthYear());
        if(requestAuthor.birthYear() <= 0){
            throw new RuntimeException("O ano de nascimento deve ser positivo");
        }

        return authorMapper.toDto(authorRepository.save(authorMapper.toEntity(requestAuthor)));
    }

    public List<ResponseAuthor> getAuthors(){
        return authorRepository.findAll().stream().map(authorMapper::toDto).toList();
    }

    public ResponseAuthor getAuthor(UUID id){
        AuthorModel author = authorRepository.findById(id).orElseThrow(()-> new RuntimeException("Não foi possivel encontrar o autor"));
        return authorMapper.toDto(author);
    }
}
