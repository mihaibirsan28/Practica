package com.example.practicabackend.mapper;

import com.example.practicabackend.dto.NomJudeteDTO;
import com.example.practicabackend.model.NomJudete;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface NomJudeteMapper {
    NomJudeteMapper MAPPER = Mappers.getMapper(NomJudeteMapper.class);

    NomJudeteDTO mapToNomJudeteDTO(NomJudete nomJudete);

    NomJudete mapToNomJudete(NomJudeteDTO nomJudeteDTO);

    List<NomJudeteDTO> mapToNomJudeteDTOList(List<NomJudete> nomJudeteList);
}
