package com.example.practicabackend.service;

import com.example.practicabackend.dto.CodAdreseDTO;
import com.example.practicabackend.dto.NomJudeteDTO;
import com.example.practicabackend.mapper.CodAdreseMapper;
import com.example.practicabackend.mapper.NomJudeteMapper;
import com.example.practicabackend.model.NomJudete;
import com.example.practicabackend.repository.CodAdreseRepository;
import com.example.practicabackend.repository.NomJudeteRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
@NoArgsConstructor
public class NomJudeteService {
    @Autowired
    private NomJudeteRepository nomJudeteRepository;

    private NomJudeteMapper nomJudeteMapper;

    public List<NomJudeteDTO> findAllNomJudete() {
        List<NomJudete> nomJudeteList = nomJudeteRepository.findAll();
        List<NomJudeteDTO> nomJudeteDTOList = nomJudeteMapper.mapToNomJudeteDTOList(nomJudeteList);
        return nomJudeteDTOList;
    }

    public NomJudeteDTO findByIdNomJudete(Integer id) {
        NomJudete nomJudete = nomJudeteRepository.getById(id);
        NomJudeteDTO nomJudeteDTO = nomJudeteMapper.mapToNomJudeteDTO(nomJudete);
        return nomJudeteDTO;
//        Optional<NomJudeteDTO> nomJudeteDTOOptional = nomJudeteRepository.findById(id);
//        return nomJudeteDTOOptional;
    }

    public NomJudeteDTO saveNomJudete(NomJudeteDTO nomJudeteDTO) {
        return nomJudeteRepository.save(nomJudeteDTO);
    }

    public void deleteByIdNomJudete(Integer id) {
        if (! nomJudeteRepository.existsById(id)) {
            throw new RuntimeException("NomJudete not found");
        }
        nomJudeteRepository.deleteById(id);
    }
}
