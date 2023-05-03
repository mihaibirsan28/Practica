package com.example.practicabackend.repository;

import com.example.practicabackend.dto.DecDeclaratiiDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DecDeclaratiiRepository extends JpaRepository {
    List<DecDeclaratiiDTO> findAll();
    Optional<DecDeclaratiiDTO> findById(Integer id);
    DecDeclaratiiDTO save(DecDeclaratiiDTO codAdresa);
    void deleteById(Integer id);
}
