package com.example.practicabackend.service;

import com.example.practicabackend.dto.CodAdreseDTO;
import com.example.practicabackend.dto.CodPlatitoriDTO;
import com.example.practicabackend.mapper.CodAdreseMapper;
import com.example.practicabackend.model.CodAdrese;
import com.example.practicabackend.repository.CodAdreseRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
@NoArgsConstructor
public class CodAdreseService  {
    @Autowired
    private CodAdreseRepository codAdreseRepository;

    private CodAdreseMapper codAdreseMapper;

    public List<CodAdreseDTO> findAllCodAdrese() {
        List<CodAdrese> codAdreseList = codAdreseRepository.findAll();
        List<CodAdreseDTO> codAdreseDTOList = codAdreseMapper.mapToCodAdreseDTOList(codAdreseList);
        return codAdreseDTOList;
    }

    public CodAdreseDTO findByIdCodAdrese(Integer id) {
        CodAdrese codAdrese = codAdreseRepository.getById(id);
        CodAdreseDTO codAdreseDTO = codAdreseMapper.mapToCodAdreseDTO(codAdrese);
        return codAdreseDTO;
//        Optional<CodAdrese> codAdreseOptional = codAdreseRepository.findById(id);
//        Optional<CodAdreseDTO> codAdreseDTOOptional = codAdreseMapper.mapToCodAdreseDTOOptional(codAdreseOptional);
//        return codAdreseDTOOptional;
    }

    public CodAdrese saveCodAdrese(CodAdreseDTO codAdresaDTO) {
        CodAdrese codAdrese = codAdreseMapper.mapToCodAdrese(codAdresaDTO);
        return codAdreseRepository.save(codAdrese);
    }

    public void deleteByIdCodAdrese(Integer id) {
        if (! codAdreseRepository.existsById(id)) {
            throw new RuntimeException("CodAdresa not found");
        }
        codAdreseRepository.deleteById(id);
    }

}
