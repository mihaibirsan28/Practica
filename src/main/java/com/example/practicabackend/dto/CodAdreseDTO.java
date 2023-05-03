package com.example.practicabackend.dto;

import com.example.practicabackend.model.CodPlatitori;
import jakarta.persistence.Column;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class CodAdreseDTO {
    private Integer idAdresa;

    private CodPlatitori codFiscal;

    private Integer taraCod;

    private Integer judCod;

    private Integer locCod;

    private Integer stdCod;

    private Integer codPostal;

    private String localitate;

    private Integer sector;

    private String strada;

    private String nr;

    private String bloc;

    private String scara;

    private String etaj;

    private String ap;

    private String telefon;

    private String fax;

    private String email;

    private String detaliiAdresa;
}
