package com.example.practicabackend.dto;

import com.example.practicabackend.model.D100Declaratii;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class D100DeclaratiiDetaliiDTO {
    private Long detaliiId;

    private Integer an;

    private Integer luna;

    private Long secventa;

    private D100Declaratii declaratie;

    private Integer codImp;

    private Long suma01;

    private Long suma02;

    private Long suma03;

    private Long suma04;

    private Long suma05;

    private LocalDate scadenta;

    private Integer cota;

    private Long suma06;

    private Long suma07;

    private Long suma08;
}
