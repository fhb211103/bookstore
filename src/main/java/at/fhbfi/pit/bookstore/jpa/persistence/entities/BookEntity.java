package at.fhbfi.pit.bookstore.jpa.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name= "book_title")
    private String title;
    @Column(name = "book_pages")
    private int pages;

    @ManyToMany
    private List<AuthorEntity> authors;
}
