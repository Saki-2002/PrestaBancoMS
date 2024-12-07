package com.prestabancoms.ms_MCApplication.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "mc_types")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class MsMcTypesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    private String type;//1ra vivienda/2da/propiedades comerciales/remodelación
    private int max_term; //En años
    private double min_interest_rate; // En %
    private double max_interest_rate; // En %
    private double max_financing_amount; // En %

    //requisitos documentales

}
