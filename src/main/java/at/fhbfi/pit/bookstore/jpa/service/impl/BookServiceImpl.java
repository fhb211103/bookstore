package at.fhbfi.pit.bookstore.jpa.service.impl;

import at.fhbfi.pit.bookstore.jpa.persistence.repositories.BookRepository;
import at.fhbfi.pit.bookstore.jpa.service.BookService;
import at.fhbfi.pit.bookstore.jpa.service.dto.BookDto;
import at.fhbfi.pit.bookstore.jpa.service.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<BookDto> getBookList() {

        return bookMapper.toDto(bookRepository.findAll());
    }

    @Override
    public void save(BookDto book) {
        bookRepository.save(bookMapper.toEntity(book));
    }

    @Override
    public BookDto getBook(long id) {
        return bookMapper.toDto(bookRepository.findById(id).orElseGet(null));
    }

    @Override
    public void delete(BookDto book) {

    }


}
