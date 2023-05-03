package com.example.practicabackend.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "D100_DECLARATII_DETALII", schema = "DEC_IMP")
public class D100DeclaratiiDetalii {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "secventa")
    @SequenceGenerator(name = "secventa", sequenceName = "SECVENTA_SEQ")
    @Column(name = "DETALIU_ID")
    private Long detaliiId;

    @Column(name = "AN")
    private Integer an;

    @Column(name = "LUNA")
    private Integer luna;

    @Column(name = "SECVENTA")
    private Long secventa;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "SECVENTA", referencedColumnName = "SECVENTA"),
            @JoinColumn(name = "AN", referencedColumnName = "AN"),
            @JoinColumn(name = "LUNA", referencedColumnName = "LUNA")
    })
    private D100Declaratii declaratie;

    @Column(name = "COD_IMP")
    private Integer codImp;

    @Column(name = "SUMA01")
    private Long suma01;

    @Column(name = "SUMA02")
    private Long suma02;

    @Column(name = "SUMA03")
    private Long suma03;

    @Column(name = "SUMA04")
    private Long suma04;

    @Column(name = "SUMA05")
    private Long suma05;

    @Column(name = "SCADENTA")
    private LocalDate scadenta;

    @Column(name = "COTA")
    private Integer cota;

    @Column(name = "SUMA06")
    private Long suma06;

    @Column(name = "SUMA07")
    private Long suma07;

    @Column(name = "SUMA08")
    private Long suma08;
}
