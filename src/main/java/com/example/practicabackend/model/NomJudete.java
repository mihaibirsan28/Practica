package com.example.practicabackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "NOM_JUDETE", schema = "NOMEN")
public class NomJudete {
    @Id
    @Column(name = "COD")
    private Integer cod;

    @Column(name = "DENUMIRE")
    private String denumire;

    @Column(name = "AUTO")
    private String auto;

    @Column(name = "ORDINE")
    private Integer ordine;
}
