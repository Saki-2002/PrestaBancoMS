package com.prestabancoms.ms_MCApplication.Services;

import com.prestabancoms.ms_MCApplication.Entities.MsMcTypesEntity;
import com.prestabancoms.ms_MCApplication.Repositories.MsMcTypesRepository;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MsMcTypesService {

    @Autowired
    MsMcTypesRepository mcTypesRepository;

    public List<MsMcTypesEntity> getAll() {
        return new ArrayList<>(mcTypesRepository.findAll());
    }

    @PostConstruct
    public void init() {
        createIfNotFound("Primera Vivienda",30,3.5,5,80);
        createIfNotFound("Segunda Vivienda",20,4,6,70);
        createIfNotFound("Propiedades Comerciales",25,5,7,60);
        createIfNotFound("Remodelación",15,4.5,6,50);
    }

    private void createIfNotFound(
            String type,
            int max_term,
            double min_interest_rate,
            double max_interest_rate,
            int max_financing_amount
    ){
        if(mcTypesRepository.findByType(type)==null){
            mcTypesRepository.save(new MsMcTypesEntity(
                    null,
                    type,
                    max_term,
                    min_interest_rate,
                    max_interest_rate,
                    max_financing_amount
            ));
        }
    }

}
