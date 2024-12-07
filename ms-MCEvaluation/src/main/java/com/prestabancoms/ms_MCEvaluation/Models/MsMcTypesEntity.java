package com.prestabancoms.ms_MCEvaluation.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class MsMcTypesEntity {

    private String type;//1ra vivienda/2da/propiedades comerciales/remodelación
    private int max_term; //En años
    private double min_interest_rate; // En %
    private double max_interest_rate; // En %
    private double max_financing_amount; // En %

    //requisitos documentales

}
