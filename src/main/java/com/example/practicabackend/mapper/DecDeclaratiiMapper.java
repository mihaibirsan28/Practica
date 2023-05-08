package com.example.practicabackend.mapper;

import com.example.practicabackend.dto.DecDeclaratiiDTO;
import com.example.practicabackend.model.DecDeclaratii;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DecDeclaratiiMapper {
    DecDeclaratiiMapper MAPPER = Mappers.getMapper(DecDeclaratiiMapper.class);

    DecDeclaratiiDTO mapToDecDeclaratiiDTO(DecDeclaratii decDeclaratii);

    DecDeclaratii mapToDecDeclaratii(DecDeclaratiiDTO decDeclaratiiDTO);

    List<DecDeclaratiiDTO> mapToDecDeclaratiiDTOList(List<DecDeclaratii> decDeclaratiiList);
}
