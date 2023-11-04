package at.fhbfi.pit.bookstore.jpa.service.impl;

import at.fhbfi.pit.bookstore.jpa.persistence.repositories.AuthorRepository;
import at.fhbfi.pit.bookstore.jpa.service.AuthorService;
import at.fhbfi.pit.bookstore.jpa.service.dto.AuthorDto;
import at.fhbfi.pit.bookstore.jpa.service.mapper.AuthorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private AuthorMapper authorMapper;

    @Override
    public List<AuthorDto> getAuthorList() {

        return authorMapper.toDto(authorRepository.findAll());
    }

    @Override
    public void save(AuthorDto author) {

        authorRepository.save(authorMapper.toEntity(author));
    }

    @Override
    public AuthorDto getAuthor(long id) {

        return authorMapper.toDto(authorRepository.findById(id).orElseGet(null));
    }

    @Override
    public void delete(AuthorDto author) {

    }


}
