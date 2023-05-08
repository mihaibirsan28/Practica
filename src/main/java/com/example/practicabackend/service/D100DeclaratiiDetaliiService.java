package com.example.practicabackend.service;

import com.example.practicabackend.dto.D100DeclaratiiDTO;
import com.example.practicabackend.dto.D100DeclaratiiDetaliiDTO;
import com.example.practicabackend.mapper.D100DeclaratiiDetalliMapper;
import com.example.practicabackend.model.D100DeclaratiiDetalii;
import com.example.practicabackend.repository.D100DeclaratiiDetaliiRepository;
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
public class D100DeclaratiiDetaliiService {
    @Autowired
    private D100DeclaratiiDetaliiRepository d100DeclaratiiDetaliiRepository;

    private D100DeclaratiiDetalliMapper d100DeclaratiiDetaliiMapper;

    public List<D100DeclaratiiDetaliiDTO> findAllD100DeclaratiiDetalii() {
        List<D100DeclaratiiDetalii> d100DeclaratiiDetaliiList = d100DeclaratiiDetaliiRepository.findAll();
        List<D100DeclaratiiDetaliiDTO> d100DeclaratiiDetaliiDTOList = d100DeclaratiiDetaliiMapper.mapToD100DeclaratiiDetaliiDTOList(d100DeclaratiiDetaliiList);
        return d100DeclaratiiDetaliiDTOList;
    }

    public D100DeclaratiiDetaliiDTO findByIdD100DeclaratiiDetalii(Integer id) {
        D100DeclaratiiDetalii d100DeclaratiiDetalii = d100DeclaratiiDetaliiRepository.getById(id);
        D100DeclaratiiDetaliiDTO d100DeclaratiiDetaliiDTO = d100DeclaratiiDetaliiMapper.mapToD100DeclaratiiDetaliiDTO(d100DeclaratiiDetalii);
        return d100DeclaratiiDetaliiDTO;
//        Optional<D100DeclaratiiDetaliiDTO> d100DeclaratiiDetaliiDTOOptional = d100DeclaratiiDetaliiRepository.findById(id);
//        return d100DeclaratiiDetaliiDTOOptional;
    }

    public D100DeclaratiiDetaliiDTO saveD100DeclaratiiDetalii(D100DeclaratiiDetaliiDTO d100DeclaratiiDetaliiDTO) {
        return d100DeclaratiiDetaliiRepository.save(d100DeclaratiiDetaliiDTO);
    }

    public void deleteByIdD100DeclaratiiDetalii(Integer id) {
        if (! d100DeclaratiiDetaliiRepository.existsById(id)) {
            throw new RuntimeException("D100DeclaratiiDetalii not found");
        }
        d100DeclaratiiDetaliiRepository.deleteById(id);
    }
}
