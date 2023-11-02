package at.fhbfi.pit.bookstore.jpa;

import at.fhbfi.pit.bookstore.jpa.persistence.entities.AuthorEntity;
import at.fhbfi.pit.bookstore.jpa.persistence.entities.BookEntity;
import at.fhbfi.pit.bookstore.jpa.persistence.repositories.AuthorRepository;
import at.fhbfi.pit.bookstore.jpa.persistence.repositories.BookRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Autowired
	private AuthorRepository authorRepository;
	@Autowired
	private BookRepository bookRepository;
	@PostConstruct
	public void insertFakeData() {

	}
		void saveTwoAuthors() {
			List<AuthorEntity> authors = new ArrayList<>();
			authors.add(AuthorEntity.builder()
					.name("William")
					.surname("Shakespeare")
					.age(52)
					.build());
			authors.add(AuthorEntity.builder()
					.name("James M.")
					.surname("Barrie")
					.age(58)
					.build());

			authorRepository.saveAll(authors);

		}

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

