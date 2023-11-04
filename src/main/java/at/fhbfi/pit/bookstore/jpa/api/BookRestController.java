package at.fhbfi.pit.bookstore.jpa.api;


import at.fhbfi.pit.bookstore.jpa.service.AuthorService;
import at.fhbfi.pit.bookstore.jpa.service.BookService;
import at.fhbfi.pit.bookstore.jpa.service.dto.AuthorDto;
import at.fhbfi.pit.bookstore.jpa.service.dto.BookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookRestController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<BookDto> getBookList() {
        System.out.println("getBookList");
        List<BookDto> books = bookService.getBookList();
        books.forEach(System.out::println);
        return books;
    }

    @PostMapping
    public void save(@RequestBody BookDto book) {
        System.out.println(book);
        bookService.save(book);
    }

    @GetMapping("/{id}")
    public BookDto getBook(@PathVariable long id) {
        return bookService.getBook(id);

    }

}
