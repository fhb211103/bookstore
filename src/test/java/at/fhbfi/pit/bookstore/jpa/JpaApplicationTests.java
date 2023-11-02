package at.fhbfi.pit.bookstore.jpa;

import at.fhbfi.pit.bookstore.jpa.persistence.entities.AuthorEntity;
import at.fhbfi.pit.bookstore.jpa.persistence.repositories.AuthorRepository;
import at.fhbfi.pit.bookstore.jpa.persistence.repositories.BookRepository;
import at.fhbfi.pit.bookstore.jpa.service.mapper.AuthorMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class JpaApplicationTests {

	@Autowired //sping annotation -> sorgt für richtige anwendung von dependencies
	private AuthorRepository authorRepository;
	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private AuthorMapper authorMapper;

	@Test
	void contextLoads() {
	}

	@Test
	void testAuthorPersistence() {
		List<AuthorEntity> authors = new ArrayList<>();
		authors.add(AuthorEntity.builder()
				.name("James M.")
				.surname("Barrie")
				.age(58)
				.build());
		authors.add(AuthorEntity.builder()
				.name("William")
				.surname("Shakespeare")
				.age(52)
				.build());

		authorRepository.saveAll(authors);

		authorRepository.findAll().forEach(System.out::println);
		authorRepository.deleteById(1L);
		System.out.println("----");
		authorRepository.findAll().forEach(System.out::println);

	}


}
