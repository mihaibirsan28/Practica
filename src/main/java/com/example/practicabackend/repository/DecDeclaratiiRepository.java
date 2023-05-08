package com.example.practicabackend.repository;

import com.example.practicabackend.dto.DecDeclaratiiDTO;
import com.example.practicabackend.model.DecDeclaratii;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DecDeclaratiiRepository extends JpaRepository<DecDeclaratii, Integer> {
    List<DecDeclaratii> findAll();
//    Optional<DecDeclaratiiDTO> findById(Integer id);

    DecDeclaratii getById(Integer id);

    DecDeclaratiiDTO save(DecDeclaratiiDTO codAdresa);
    void deleteById(Integer id);
}
