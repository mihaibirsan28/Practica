package com.example.practicabackend.mapper;

import com.example.practicabackend.dto.D100DeclaratiiDetaliiDTO;
import com.example.practicabackend.model.D100DeclaratiiDetalii;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface D100DeclaratiiDetalliMapper {
    D100DeclaratiiDetalliMapper MAPPER = Mappers.getMapper(D100DeclaratiiDetalliMapper.class);

    D100DeclaratiiDetaliiDTO mapToD100DeclaratiiDetaliiDTO(D100DeclaratiiDetalii d100DeclaratiiDetalii);

    D100DeclaratiiDetalii mapToD100DeclaratiiDetalii(D100DeclaratiiDetaliiDTO d100DeclaratiiDetaliiDTO);
}
