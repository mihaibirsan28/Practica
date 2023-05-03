package com.example.practicabackend.service;

import com.example.practicabackend.dto.D100DeclaratiiDTO;
import com.example.practicabackend.dto.DecDeclaratiiDTO;
import com.example.practicabackend.mapper.DecDeclaratiiMapper;
import com.example.practicabackend.repository.DecDeclaratiiRepository;
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
public class DecDeclaratiiService {

    @Autowired
    private DecDeclaratiiRepository decDeclaratiiRepository;

    private DecDeclaratiiMapper decDeclaratiiMapper;

    public List<DecDeclaratiiDTO> findAllDecDeclaratii() {
        return decDeclaratiiRepository.findAll();
    }

    public Optional<DecDeclaratiiDTO> findByIdDecDeclaratii(Integer id) {
        Optional<DecDeclaratiiDTO> decDeclaratiiDTOOptional = decDeclaratiiRepository.findById(id);
        return decDeclaratiiDTOOptional;
    }

    public DecDeclaratiiDTO saveDecDeclaratii(DecDeclaratiiDTO decDeclaratiiDTO) {
        return decDeclaratiiRepository.save(decDeclaratiiDTO);
    }

    public void deleteByIdDecDeclaratii(Integer id) {
        if (! decDeclaratiiRepository.existsById(id)) {
            throw new RuntimeException("DecDeclaratii not found");
        }
        decDeclaratiiRepository.deleteById(id);
    }
}
