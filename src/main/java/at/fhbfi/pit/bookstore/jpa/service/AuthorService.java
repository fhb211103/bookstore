package at.fhbfi.pit.bookstore.jpa.service;

import at.fhbfi.pit.bookstore.jpa.service.dto.AuthorDto;

import java.util.List;

public interface AuthorService {

    List<AuthorDto> getAuthorList();

    void save(AuthorDto author);

    AuthorDto getAuthor(long id);

    void delete(AuthorDto author);
}
