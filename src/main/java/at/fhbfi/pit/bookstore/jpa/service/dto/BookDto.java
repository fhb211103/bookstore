package at.fhbfi.pit.bookstore.jpa.service.dto;

// DTO Datentransferobjekt

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    private Long id;
    private String title;
    private int pages;
}
