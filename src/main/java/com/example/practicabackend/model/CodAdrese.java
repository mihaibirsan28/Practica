package com.example.practicabackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "COD_ADRESE", schema = "CODFISC")
public class CodAdrese {
    @Id
    @Column(name = "ID_ADRESA")
    private Integer idAdresa;

    @ManyToOne
    @JoinColumn(name = "COD_FISCAL", nullable = false)
    private CodPlatitori codFiscal;

//    @Column(name = "COD_FISCAL")
//    private Integer codFiscal;

    @Column(name = "TARA_COD")
    private Integer taraCod;

    @Column(name = "JUD_COD")
    private Integer judCod;

    @Column(name = "LOC_COD")
    private Integer locCod;

    @Column(name = "STD_COD")
    private Integer stdCod;

    @Column(name = "COD_POSTAL")
    private Integer codPostal;

    @Column(name = "LOCALITATE")
    private String localitate;

    @Column(name = "SECTOR")
    private Integer sector;

    @Column(name = "STRADA")
    private String strada;

    @Column(name = "NR")
    private String nr;

    @Column(name = "BLOC")
    private String bloc;

    @Column(name = "SCARA")
    private String scara;

    @Column(name = "ETAJ")
    private String etaj;

    @Column(name = "AP")
    private String ap;

    @Column(name = "TELEFON")
    private String telefon;

    @Column(name = "FAX")
    private String fax;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "DETALII_ADRESA")
    private String detaliiAdresa;

}
