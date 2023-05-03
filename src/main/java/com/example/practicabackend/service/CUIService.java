package com.example.practicabackend.service;

import com.example.practicabackend.dto.CodAdreseDTO;
import com.example.practicabackend.dto.CodPlatitoriDTO;
import com.example.practicabackend.mapper.CodAdreseMapper;
import com.example.practicabackend.mapper.CodPlatitoriMapper;
import com.example.practicabackend.model.CodAdrese;
import com.example.practicabackend.model.CodPlatitori;
import com.example.practicabackend.repository.CodAdreseRepository;
import com.example.practicabackend.repository.CodPlatitoriRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
@NoArgsConstructor
public class CUIService {

    @Autowired
    private CodPlatitoriRepository codPlatitoriRepository;

    @Autowired
    private CodAdreseRepository codAdreseRepository;

    private CodPlatitoriMapper codPlatitoriMapper;

    private CodAdreseMapper codAdreseMapper;

    public List<CodAdreseDTO> getAdresa(String cui) {
        if (cui.length() != 9) {
            throw new RuntimeException("CUI trebuie sa aibe 9 cifre");
        }

        int[] coeficienti = {7, 5, 3, 2, 1, 7, 5, 3};
        int suma = 0;
        for (int i = 0; i < 8; i++) {
            suma += Character.getNumericValue(cui.charAt(i)) * coeficienti[i];
        }

        int rest = suma % 11;
        int cifraControl = rest == 10 ? 0 : rest;

        if (cifraControl != Character.getNumericValue(cui.charAt(8))) {
            throw new RuntimeException("CUI-ul nu este valid");
        }
        else {
            Integer cuiValue = Integer.parseInt(cui);
            CodPlatitori codPlatitori = codPlatitoriRepository.findByCodFiscal(cuiValue);
            CodPlatitoriDTO codPlatitoriDTO = codPlatitoriMapper.mapToCodPlatitoriDTO(codPlatitori);
//            List<CodAdreseDTO> codAdreseList = codPlatitoriDTO.getAdrese();
            List<CodAdrese> codAdrese = codAdreseRepository.findAllByCodFiscal(codPlatitoriDTO.getCodFiscal());
            List<CodAdreseDTO> codAdreseDTOList = codAdreseMapper.mapToCodAdreseDTOList(codAdrese);
            return codAdreseDTOList;
        }
    }

    public String getDenumire(String cui) {
        if (cui.length() != 9) {
            throw new RuntimeException("CUI trebuie sa aibe 9 cifre");
        }

        int[] coeficienti = {7, 5, 3, 2, 1, 7, 5, 3};
        int suma = 0;
        for (int i = 0; i < 8; i++) {
            suma += Character.getNumericValue(cui.charAt(i)) * coeficienti[i];
        }

        int rest = suma % 11;
        int cifraControl = rest == 10 ? 0 : rest;

        if (cifraControl != Character.getNumericValue(cui.charAt(8))) {
            throw new RuntimeException("CUI-ul nu este valid");
        }
        else {
            Integer cuiValue = Integer.parseInt(cui);
            CodPlatitori codPlatitori = codPlatitoriRepository.findByCodFiscal(cuiValue);
            CodPlatitoriDTO codPlatitoriDTO = codPlatitoriMapper.mapToCodPlatitoriDTO(codPlatitori);
            String denumire = codPlatitoriDTO.getDenumire();
            return denumire;
        }
    }
}
