package com.example.practicabackend.dto;

import com.example.practicabackend.model.D100DeclaratiiDetalii;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class D100DeclaratiiDTO {
    private Long secventa;

    private Integer an;

    private Integer luna;

    private Long cif;

    private String numeDeclar;

    private String prenumeDeclar;

    private String functieDeclar;

    private Integer dAnulare;

    private Integer temei;

    private Integer dSucc;

    private Integer cifs;

    private Integer dDizolv;

    private Integer nrBorderou;

    private Date dateBorderou;

    private BigDecimal sumaDistrib;

    private List<D100DeclaratiiDetalii> detaliiList;
}
