package com.example.practicabackend.repository;

import com.example.practicabackend.dto.D100DeclaratiiDTO;
import com.example.practicabackend.model.D100Declaratii;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface D100DeclaratiiRepository extends JpaRepository {
    List<D100DeclaratiiDTO> findAll();
    Optional<D100DeclaratiiDTO> findById(Integer id);
    D100DeclaratiiDTO save(D100DeclaratiiDTO codAdresa);
    void deleteById(Integer id);
}
