package com.example.practicabackend.service;

import com.example.practicabackend.dto.CodPlatitoriDTO;
import com.example.practicabackend.dto.D100DeclaratiiDTO;
import com.example.practicabackend.mapper.CodPlatitoriMapper;
import com.example.practicabackend.mapper.D100DeclaratiiMapper;
import com.example.practicabackend.model.D100Declaratii;
import com.example.practicabackend.repository.CodPlatitoriRepository;
import com.example.practicabackend.repository.D100DeclaratiiRepository;
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
public class D100DeclaratiiService {

    @Autowired
    private D100DeclaratiiRepository d100DeclaratiiRepository;

    private D100DeclaratiiMapper d100DeclaratiiMapper;

    public List<D100DeclaratiiDTO> findAllD100Declaratii() {
        List<D100Declaratii> d100DeclaratiiList = d100DeclaratiiRepository.findAll();
        List<D100DeclaratiiDTO> d100DeclaratiiDTOList = d100DeclaratiiMapper.mapToD100DeclaratiiDTOList(d100DeclaratiiList);
        return d100DeclaratiiDTOList;
    }

    public D100DeclaratiiDTO findByIdD100Declaratii(Integer id) {
        D100Declaratii d100Declaratii = d100DeclaratiiRepository.getById(id);
        D100DeclaratiiDTO d100DeclaratiiDTO = d100DeclaratiiMapper.mapToD100DeclaratiiDTO(d100Declaratii);
        return d100DeclaratiiDTO;
//        Optional<D100DeclaratiiDTO> d100DeclaratiiDTOOptional = d100DeclaratiiRepository.findById(id);
//        return d100DeclaratiiDTOOptional;
    }

    public D100DeclaratiiDTO saveD100Declaratii(D100DeclaratiiDTO d100DeclaratiiDTO) {
        return d100DeclaratiiRepository.save(d100DeclaratiiDTO);
    }

    public void deleteByIdD100Declaratii(Integer id) {
        if (! d100DeclaratiiRepository.existsById(id)) {
            throw new RuntimeException("D100Declaratii not found");
        }
        d100DeclaratiiRepository.deleteById(id);
    }


}
