package com.prestabancoms.ms_MCTracking.Service;

import com.prestabancoms.ms_MCTracking.Entities.MsMcStatusEntity;
import com.prestabancoms.ms_MCTracking.Repositories.MsMcStatusRepository;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class MsMcStatusService {


    @Autowired
    MsMcStatusRepository mcStatusRepository;

    @PostConstruct
    public void init() {
        createStatusIfNotFound("Envío Pendiente");
        createStatusIfNotFound("En Revisión Inicial");
        createStatusIfNotFound("Pendiente de Documentación");
        createStatusIfNotFound("En Evaluación");
        createStatusIfNotFound("Pre-Aprobada");
        createStatusIfNotFound("En Aprobación Final");
        createStatusIfNotFound("Aprobada");
        createStatusIfNotFound("Rechazada");
        createStatusIfNotFound("Cancelada por el Cliente");
        createStatusIfNotFound("En Desembolso");
    }

    private void createStatusIfNotFound(String status){
        if(mcStatusRepository.findByStatus(status)==null){
            mcStatusRepository.save(new MsMcStatusEntity(null, status));
        }
    }

}
