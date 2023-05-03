package com.example.practicabackend.service;


import com.example.practicabackend.dto.CodPlatitoriDTO;
import com.example.practicabackend.mapper.CodPlatitoriMapper;
import com.example.practicabackend.model.CodPlatitori;
import com.example.practicabackend.repository.CodPlatitoriRepository;
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
public class CodPlatitoriService {

    @Autowired
    private CodPlatitoriRepository codPlatitoriRepository;

    private CodPlatitoriMapper codPlatitoriMapper;

    public List<CodPlatitoriDTO> findAllCodPlatitori() {
        List<CodPlatitori> codPlatitoriList = codPlatitoriRepository.findAll();
        List<CodPlatitoriDTO> codPlatitoriDTOList = codPlatitoriMapper.mapToCodPlatitoriDTOList(codPlatitoriList);
        return codPlatitoriDTOList;
    }

    public Optional<CodPlatitoriDTO> findByIdCodPlatitori(Integer id) {
        Optional<CodPlatitori> codPlatitoriOptional = codPlatitoriRepository.findById(id);
        Optional<CodPlatitoriDTO> codPlatitoriDTOOptional = codPlatitoriMapper.mapToCodPlatitoriDTOOptional(codPlatitoriOptional);
        return codPlatitoriDTOOptional;
    }

    public CodPlatitori saveCodPlatitori(CodPlatitoriDTO codPlatitoriDTO) {
        CodPlatitori codPlatitori = codPlatitoriMapper.mapToCodPlatitori(codPlatitoriDTO);
        return codPlatitoriRepository.save(codPlatitori);
    }

    public void deleteByIdCodPlatitori(Integer id) {
        if (! codPlatitoriRepository.existsById(id)) {
            throw new RuntimeException("CodPlatitori not found");
        }
        codPlatitoriRepository.deleteById(id);
    }
}
