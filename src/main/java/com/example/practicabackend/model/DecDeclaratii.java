package com.example.practicabackend.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "DEC_DECLARATII", schema = "DEC_ROOT")
public class DecDeclaratii {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NUME_FISIER_ORIGINAL")
    private String numeFisierOriginal;

    @Column(name = "DATA_INCARCARE")
    private Date dataIncarcare;

    @Column(name = "UTILIZATOR_INCARCARE")
    private String utilizatorIncarcare;

    @Column(name = "TIP_INCARCARE")
    private String tipIncarcare;

    @Column(name = "COD_STARE_PRELUCRARE_INTERN")
    private String codStarePrelucrareIntern;

    @Column(name = "NUMAR_INREGISTRARE")
    private String numarInregistrare;

    @Column(name = "DATA_INREGISTRARE")
    private Date dataInregistrare;

    @Column(name = "TIP_DUK")
    private String tipDuk;

    @Column(name = "CUI")
    private Integer cui;

    @Column(name = "LUNA_DUK")
    private Integer lunaDuk;

    @Column(name = "ANUL_DUK")
    private Integer anulDuk;

    @Column(name = "LOC_INCARCARE")
    private String locIncasare;

    @Column(name = "VERSIUNE_PRG")
    private String versiunePrg;

    @Column(name = "SUMA_CONTROL")
    private Long sumaControl;

    @Column(name = "GEN_RECIPISA")
    private Character genRecipisa = 'N';

    @Column(name = "TIP_PERIOADA")
    private Character tipPerioada = 'L';

    @Column(name = "TIP_DECLARATIE")
    private String tipDeclaratie;

    @Column(name = "ZIP")
    private String zip = "N";

    @Column(name = "DATA_ARHIVARE")
    private Date dataArhivare;

}