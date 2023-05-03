package com.example.practicabackend.dto;

import jakarta.persistence.Column;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public class NomJudeteDTO {
    private Integer cod;

    private String denumire;

    private String auto;

    private Integer ordine;
}
