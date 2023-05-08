package com.example.practicabackend.mapper;

import com.example.practicabackend.dto.CodAdreseDTO;
import com.example.practicabackend.dto.CodPlatitoriDTO;
import com.example.practicabackend.model.CodAdrese;
import com.example.practicabackend.model.CodPlatitori;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Optional;

@Mapper
public interface CodPlatitoriMapper {
    CodPlatitoriMapper MAPPER = Mappers.getMapper(CodPlatitoriMapper.class);

    CodPlatitoriDTO mapToCodPlatitoriDTO(CodPlatitori codPlatitori);

    CodPlatitori mapToCodPlatitori(CodPlatitoriDTO codPlatitoriDTO);

//    Optional<CodPlatitoriDTO> mapToCodPlatitoriDTOOptional(Optional<CodPlatitori> codPlatitoriOptional);

    List<CodPlatitoriDTO> mapToCodPlatitoriDTOList(List<CodPlatitori> codPlatitoriList);

//    Optional<CodPlatitoriDTO> mapToCodPlatitoriDTOOptional(Optional<CodPlatitori> codPlatitoriOptional);
}
