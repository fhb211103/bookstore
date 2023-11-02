package at.fhbfi.pit.bookstore.jpa.service.mapper;

import at.fhbfi.pit.bookstore.jpa.persistence.entities.AuthorEntity;
import at.fhbfi.pit.bookstore.jpa.persistence.entities.BookEntity;
import at.fhbfi.pit.bookstore.jpa.service.dto.AuthorDto;
import at.fhbfi.pit.bookstore.jpa.service.dto.BookDto;

public class BookMapper implements Mapper<BookDto, BookEntity>{

    @Override
    public BookEntity toEntity(BookDto s) {
        return BookEntity.builder()
                .id(s.getId())
                .title(s.getTitle())
                .pages(s.getPages())
                .build();
    }

    @Override
    public BookDto toDto(BookEntity s) {
        if (s== null) {
            return null;
        }
        return BookDto.builder()
                .id(s.getId())
                .title(s.getTitle())
                .pages(s.getPages())
                .build();
    }

}
