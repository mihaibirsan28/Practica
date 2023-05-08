package com.example.practicabackend.repository;

import com.example.practicabackend.dto.D100DeclaratiiDetaliiDTO;
import com.example.practicabackend.model.D100Declaratii;
import com.example.practicabackend.model.D100DeclaratiiDetalii;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface D100DeclaratiiDetaliiRepository extends JpaRepository<D100DeclaratiiDetalii, Integer> {
    List<D100DeclaratiiDetalii> findAll();
//    Optional<D100DeclaratiiDetaliiDTO> findById(Integer id);

    D100DeclaratiiDetalii getById(Integer id);
    D100DeclaratiiDetaliiDTO save(D100DeclaratiiDetaliiDTO codAdresa);
    void deleteById(Integer id);
}
