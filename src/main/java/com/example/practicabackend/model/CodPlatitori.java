package com.example.practicabackend.model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "COD_PLATITORI", schema = "COD_PLATITORI")
public class CodPlatitori {

    @Id
    @Column(name = "COD_FISCAL")
    private Integer codFiscal;

    @Column(name = "DENUMIRE")
    private String denumire;

    @Column(name = "TIP")
    private String tip;

    @Column(name = "NR_INREGISTRARE")
    private String nrInregistrare;

    @Column(name = "DATA_INREGISTRARE")
    private Date dataInregistrare;

    @Column(name = "DATA_ATRIBUIRE")
    private Date dataAtribuire;

    @Column(name = "DATA_PRELUCRARE")
    private Date dataPrelucrare;

    @Column(name = "DATA_SFARSIT")
    private Date dataSfarsit;

    @Column(name = "STA_COD")
    private Integer staCod;

    @Column(name = "DATA_STARE")
    private Date dataStare;

    @Column(name = "SUB_COD")
    private Integer subCod;

    @Column(name = "FILIERA")
    private String filiera;

    @Column(name = "COD_FISCAL_PARINTE")
    private Integer codFiscalParinte;

    @Column(name = "COD_FISCAL_PREDECESOR")
    private Integer codFiscalPredecesor;

    @Column(name = "COD_FISCAL_SUCCESOR")
    private Integer codFiscalSuccesor;

    @Column(name = "TVA")
    private String tva;

    @Column(name = "DATA_TVA")
    private Date dataTva;

    @Column(name = "FARA_TVA")
    private String faraTva;

    @Column(name = "GRUPA_CONT")
    private Integer grupaCont;

    @Column(name = "DOM_FISCAL")
    private Integer domFiscal;

    @Column(name = "ID_TIP_ACT")
    private Integer idTipAct;

    @Column(name = "ID_UTILIZATOR")
    private String idUtilizator;

    @OneToMany(mappedBy = "codFiscal", cascade = CascadeType.ALL)
    private List<CodAdrese> adrese;


}
