package at.fhbfi.pit.bookstore.jpa;

import at.fhbfi.pit.bookstore.jpa.persistence.entities.AuthorEntity;
import at.fhbfi.pit.bookstore.jpa.persistence.entities.BookEntity;
import at.fhbfi.pit.bookstore.jpa.persistence.repositories.AuthorRepository;
import at.fhbfi.pit.bookstore.jpa.persistence.repositories.BookRepository;
import at.fhbfi.pit.bookstore.jpa.service.AuthorService;
import at.fhbfi.pit.bookstore.jpa.service.BookService;
import at.fhbfi.pit.bookstore.jpa.service.dto.AuthorDto;
import at.fhbfi.pit.bookstore.jpa.service.dto.BookDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Autowired
    private BookRepository bookRepository;

    @Test
    void testGetBookList() {
        saveTwoBooks();
        List<BookDto> books = bookService.getBookList();
        System.out.println(books.size());
        Assertions.assertEquals(2, books.size());

    }

    @Test
    void testGetBook() {
        saveTwoBooks();
        BookDto book = bookService.getBook(1);
        Assertions.assertNotNull(book);
        Assertions.assertEquals("Peter Pan", book.getTitle());

    }

    @Test
    void saveTwoBooks() {
        List<BookEntity> books = new ArrayList<>();
        books.add(BookEntity.builder()
                .title("Peter Pan")
                .pages(124)
                .build());
        books.add(BookEntity.builder()
                .title("Romeo & Juliet")
                .pages(168)
                .build());

        bookRepository.saveAll(books);


    }

}
