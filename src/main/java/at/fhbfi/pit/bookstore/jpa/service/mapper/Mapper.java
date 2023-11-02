package at.fhbfi.pit.bookstore.jpa.service.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface Mapper<DTO, ENTITY>{


    ENTITY toEntity(DTO s);
    DTO toDto(ENTITY s);

    default List<ENTITY> toEntity(Collection<DTO> s) {
        List<ENTITY> entities = new ArrayList<>();
        s.forEach(e -> entities.add(toEntity(e)));
        return entities;
    }

    default List<DTO> toDto(Collection<ENTITY> s) {
        List<DTO> dtos = new ArrayList<>();
        s.forEach(d -> dtos.add(toDto(d)));
        return dtos;
    }
}
