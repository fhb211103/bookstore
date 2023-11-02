package at.fhbfi.pit.bookstore.jpa.service.mapper;

import at.fhbfi.pit.bookstore.jpa.persistence.entities.AuthorEntity;
import at.fhbfi.pit.bookstore.jpa.service.dto.AuthorDto;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapper implements Mapper<AuthorDto, AuthorEntity> {

    @Override
    public AuthorEntity toEntity(AuthorDto s) {
        return AuthorEntity.builder()
                .id(s.getId())
                .name(s.getName())
                .surname(s.getSurname())
                .age(s.getAge())
                .build();
    }

    @Override
    public AuthorDto toDto(AuthorEntity s) {
        if (s== null) {
            return null;
        }
        return AuthorDto.builder()
                .id(s.getId())
                .name(s.getName())
                .surname(s.getSurname())
                .age(s.getAge())
                .build();
    }
}
