package at.fhbfi.pit.bookstore.jpa.api;

import at.fhbfi.pit.bookstore.jpa.service.dto.AuthorDto;
import at.fhbfi.pit.bookstore.jpa.service.AuthorService;
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
        List<AuthorDto> persons = authorService.getAuthorList();
        persons.forEach(System.out::println);
        return persons;
    }

    @PostMapping
    public void save(@RequestBody AuthorDto person) {
        System.out.println(person);
        authorService.save(person);
    }

    @GetMapping("/{id}")
    public AuthorDto getPerson(@PathVariable long id) {
        return authorService.getAuthor(id);

    }
}
