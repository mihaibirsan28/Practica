package com.example.practicabackend.model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "D100_DECLARATII", schema = "DEC_IMP")
public class D100Declaratii {

    @Id
    @Column(name = "SECVENTA")
    private Long secventa;

    @Column(name = "AN")
    private Integer an;

    @Column(name = "LUNA")
    private Integer luna;

    @Column(name = "CIF")
    private Long cif;

    @Column(name = "NUME_DECLAR")
    private String numeDeclar;

    @Column(name = "PRENUME_DECLAR")
    private String prenumeDeclar;

    @Column(name = "FUNCTIE_DECLAR")
    private String functieDeclar;

    @Column(name = "D_ANULARE")
    private Integer dAnulare;

    @Column(name = "TEMEI")
    private Integer temei;

    @Column(name = "D_SUCC")
    private Integer dSucc;

    @Column(name = "CIFS")
    private Integer cifs;

    @Column(name = "D_DIZOLV")
    private Integer dDizolv;

    @Column(name = "NR_BORDEROU")
    private Integer nrBorderou;

    @Column(name = "DATA_BORDEROU")
    private Date dateBorderou;

    @Column(name = "SUMA_DISTRIB", precision = 15, scale = 2)
    private BigDecimal sumaDistrib;

    @OneToMany(mappedBy = "declaratie")
    private List<D100DeclaratiiDetalii> detaliiList;
}
