package com.prestabancoms.ms_MCEvaluation.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class MsMcApplication {


    private Long status;
    private Long type;
    private Long client;
    private Long executive;

    private int loanAmount; //En CLP
    private int loanTerm; //En años
    private double annualInterestRate; //En %
    private double lienInsurance; // En %
    private double fireInsurance; //En CLP
    private double administrationCommission; //En %

}
