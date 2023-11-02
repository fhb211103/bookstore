package at.fhbfi.pit.bookstore.jpa.service;

import at.fhbfi.pit.bookstore.jpa.service.dto.AuthorDto;
import at.fhbfi.pit.bookstore.jpa.service.dto.BookDto;

import java.util.List;

public interface BookService {

    List<BookDto> getBookList();

    void save(BookDto book);

    BookDto getBook(long id);

    void delete(BookDto book);
}
