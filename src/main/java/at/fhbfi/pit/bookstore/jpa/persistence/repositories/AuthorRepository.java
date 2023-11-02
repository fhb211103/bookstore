package at.fhbfi.pit.bookstore.jpa.persistence.repositories;

import at.fhbfi.pit.bookstore.jpa.persistence.entities.AuthorEntity;
import at.fhbfi.pit.bookstore.jpa.persistence.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {

    List<AuthorEntity> findByName(String name);
    List<AuthorEntity> findBySurname(String surname);
    List<AuthorEntity> findByBook(BookEntity b);
}
