package at.fhbfi.pit.bookstore.jpa.service.dto;

// DTO Datentransferobjekt
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDto {

    private Long id;
    private String name;
    private String surname;
    private int age;
}
