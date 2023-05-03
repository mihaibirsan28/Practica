package com.example.practicabackend.dto;

import jakarta.persistence.Column;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class DecDeclaratiiDTO {
    private Integer id;

    private String numeFisierOriginal;

    private Date dataIncarcare;

    private String utilizatorIncarcare;

    private String tipIncarcare;

    private String codStarePrelucrareIntern;

    private String numarInregistrare;

    private Date dataInregistrare;

    private String tipDuk;

    private Integer cui;

    private Integer lunaDuk;

    private Integer anulDuk;

    private String locIncasare;

    private String versiunePrg;

    private Long sumaControl;

    private Character genRecipisa = 'N';

    private Character tipPerioada = 'L';

    private String tipDeclaratie;

    private String zip = "N";

    private Date dataArhivare;
}
