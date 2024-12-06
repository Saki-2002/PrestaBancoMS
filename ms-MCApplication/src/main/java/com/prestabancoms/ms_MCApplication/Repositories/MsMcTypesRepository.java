package com.prestabancoms.ms_MCApplication.Repositories;

import com.prestabancoms.ms_MCApplication.Entities.MsMcTypesEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MsMcTypesRepository extends JpaRepository<MsMcTypesEntity, Integer> {

    MsMcTypesEntity findByType(String type);

}
