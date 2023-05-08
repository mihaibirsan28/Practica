package com.example.practicabackend.mapper;

import com.example.practicabackend.dto.CodAdreseDTO;
import com.example.practicabackend.model.CodAdrese;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Optional;

@Mapper
public interface CodAdreseMapper {
    CodAdreseMapper MAPPER = Mappers.getMapper(CodAdreseMapper.class);

    CodAdreseDTO mapToCodAdreseDTO(CodAdrese codAdrese);

//    Optional<CodAdreseDTO> mapToCodAdreseDTOOptional(Optional<CodAdrese> codAdreseOptional);

    CodAdrese mapToCodAdrese(CodAdreseDTO codAdreseDTO);

    List<CodAdreseDTO> mapToCodAdreseDTOList(List<CodAdrese> codAdreseList);
}
