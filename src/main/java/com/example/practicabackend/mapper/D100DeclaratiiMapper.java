package com.example.practicabackend.mapper;

import com.example.practicabackend.dto.D100DeclaratiiDTO;
import com.example.practicabackend.model.D100Declaratii;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface D100DeclaratiiMapper {
    D100DeclaratiiMapper MAPPER = Mappers.getMapper(D100DeclaratiiMapper.class);

    D100DeclaratiiDTO mapToD100DeclaratiiDTO(D100Declaratii d100Declaratii);

    D100Declaratii mapToD100Declaratii(D100DeclaratiiDTO d100DeclaratiiDTO);
}
