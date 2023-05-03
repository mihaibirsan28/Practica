package com.example.practicabackend.dto;

import com.example.practicabackend.model.CodAdrese;
import com.example.practicabackend.model.CodPlatitori;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class CodPlatitoriDTO {

    private Integer codFiscal;

    private String denumire;

    private String tip;

    private String nrInregistrare;

    private Date dataInregistrare;

    private Date dataAtribuire;

    private Date dataPrelucrare;

    private Date dataSfarsit;

    private Integer staCod;

    private Date dataStare;

    private Integer subCod;

    private String filiera;

    private Integer codFiscalParinte;

    private Integer codFiscalPredecesor;

    private Integer codFiscalSuccesor;

    private String tva;

    private Date dataTva;

    private String faraTva;

    private Integer grupaCont;

    private Integer domFiscal;

    private Integer idTipAct;

    private String idUtilizator;

    private List<CodAdreseDTO> adrese;
}
