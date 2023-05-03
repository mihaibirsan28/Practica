package com.example.practicabackend.repository;

import com.example.practicabackend.dto.NomJudeteDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NomJudeteRepository extends JpaRepository {
    List<NomJudeteDTO> findAll();
    Optional<NomJudeteDTO> findById(Integer id);
    NomJudeteDTO save(NomJudeteDTO codAdresa);
    void deleteById(Integer id);
}
