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

    @ManyToMany
    private List<BookEntity> books;

}
