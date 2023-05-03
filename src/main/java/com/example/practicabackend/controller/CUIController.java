package com.example.practicabackend.controller;

import com.example.practicabackend.dto.CodAdreseDTO;
import com.example.practicabackend.service.CUIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/cui/")
public class CUIController {

    @Autowired
    private CUIService cuiService;

    @GetMapping("/{cui}")
    @ResponseBody
    public ResponseEntity<StringBuilder> getById(@PathVariable String cui) {
        List<CodAdreseDTO> codAdreseDTOList = cuiService.getAdresa(cui);
        String denumire = cuiService.getDenumire(cui);
        StringBuilder response = new StringBuilder();
        response.append(denumire);
        for (CodAdreseDTO codAdreseDTO : codAdreseDTOList) {
            response.append(codAdreseDTO.toString());
        }
        return ResponseEntity.ok(response);
    }
}
