package at.fhbfi.pit.bookstore.jpa.api;


import at.fhbfi.pit.bookstore.jpa.service.BookService;
import at.fhbfi.pit.bookstore.jpa.service.dto.AuthorDto;
import at.fhbfi.pit.bookstore.jpa.service.AuthorService;
import at.fhbfi.pit.bookstore.jpa.service.dto.BookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class AuthorRestController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<AuthorDto> getAuthorList() {
        System.out.println("getAuthorList");
        List<AuthorDto> authors = authorService.getAuthorList();
        authors.forEach(System.out::println);
        return authors;
    }

    @PostMapping
    public void save(@RequestBody AuthorDto author) {
        System.out.println(author);
        authorService.save(author);
    }

    @GetMapping("/{id}")
    public AuthorDto getAuthor(@PathVariable long id) {
        return authorService.getAuthor(id);

    }

}
