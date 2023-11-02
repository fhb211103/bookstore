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

public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name= "a_name")
    private String name;
    @Column(name= "a_surname")
    private String surname;
    @Column(name = "a_age")
    private int age;

    //@ManyToMany
   // private List<BookEntity> books;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "booksByAuthor",
            joinColumns = { @JoinColumn(name = "author_id") },
            inverseJoinColumns = { @JoinColumn(name = "book_id") }
    )
    List<BookEntity> books = new ArrayList<>();


}
