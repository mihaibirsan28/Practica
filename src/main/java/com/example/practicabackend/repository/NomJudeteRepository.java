package com.example.practicabackend.repository;

import com.example.practicabackend.dto.NomJudeteDTO;
import com.example.practicabackend.model.NomJudete;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NomJudeteRepository extends JpaRepository<NomJudete, Integer> {
    List<NomJudete> findAll();
//    Optional<NomJudeteDTO> findById(Integer id);

    NomJudete getById(Integer id);
    NomJudeteDTO save(NomJudeteDTO codAdresa);
    void deleteById(Integer id);
}
