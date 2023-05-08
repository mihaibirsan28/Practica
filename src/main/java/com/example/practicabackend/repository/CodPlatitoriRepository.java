package com.example.practicabackend.repository;

import com.example.practicabackend.model.CodPlatitori;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CodPlatitoriRepository extends JpaRepository<CodPlatitori, Integer> {

    List<CodPlatitori> findAll();
//    Optional<CodPlatitori> findById(Integer id);

    @Override
    Optional<CodPlatitori> findById(Integer id);

    CodPlatitori getById(Integer id);

    CodPlatitori findByCodFiscal(Integer codFical);
    CodPlatitori save(CodPlatitori codAdresa);
    void deleteById(Integer id);
}
