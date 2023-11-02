package at.fhbfi.pit.bookstore.jpa.persistence.repositories;

import at.fhbfi.pit.bookstore.jpa.persistence.entities.AuthorEntity;
import at.fhbfi.pit.bookstore.jpa.persistence.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<BookEntity, Long> {

    List<BookEntity> findByPagesIsGreaterThan(int pages);
    BookEntity findByTitle(String title);
    //List<BookEntity> findByAuthor(AuthorEntity a);
}
