package at.fhbfi.pit.bookstore.jpa;

import at.fhbfi.pit.bookstore.jpa.persistence.entities.AuthorEntity;
import at.fhbfi.pit.bookstore.jpa.persistence.repositories.AuthorRepository;
import at.fhbfi.pit.bookstore.jpa.service.AuthorService;
import at.fhbfi.pit.bookstore.jpa.service.dto.AuthorDto;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Transactional
public class AuthorServiceTest {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private AuthorRepository authorRepository;

    @Test
    void testGetAuthorList() {
        saveTwoAuthors();
        List<AuthorDto> authors = authorService.getAuthorList();
        System.out.println(authors.size());
        Assertions.assertEquals(2, authors.size());

    }

    @Test
    void testGetOnePerson() {
        saveTwoAuthors();
        AuthorDto author = authorService.getAuthor(1);
        Assertions.assertNotNull(author);
        Assertions.assertEquals("William", author.getName());

    }

    @Test
    void saveTwoAuthors() {
        List<AuthorEntity> authors = new ArrayList<>();
        authors.add(AuthorEntity.builder()
                .name("William")
                .surname("Shakespeare")
                .age(52)
                .build());
        authors.add(AuthorEntity.builder()
                .name("James")
                .surname("Barrie")
                .age(58)
                .build());

        authorRepository.saveAll(authors);
        authorRepository.findAll().forEach(System.out::println);

    }
}
