package at.fhbfi.pit.bookstore.jpa.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "book_title")
    private String title;
    @Column(name = "book_pages")
    private int pages;

    @ManyToMany(mappedBy = "books")
    private List<AuthorEntity> authors = new ArrayList<>();
}
