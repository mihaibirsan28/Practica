package com.example.practicabackend.repository;

import com.example.practicabackend.dto.CodAdreseDTO;
import com.example.practicabackend.model.CodAdrese;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CodAdreseRepository extends JpaRepository<CodAdrese, Integer> {

    List<CodAdrese> findAllByCodFiscal(Integer codFiscal);
    List<CodAdrese> findAll();
    Optional<CodAdrese> findById(Integer id);
    CodAdrese save(CodAdrese codAdresa);
    void deleteById(Integer id);
}
