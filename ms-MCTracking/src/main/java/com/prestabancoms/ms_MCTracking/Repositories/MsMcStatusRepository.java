package com.prestabancoms.ms_MCTracking.Repositories;

import com.prestabancoms.ms_MCTracking.Entities.MsMcStatusEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MsMcStatusRepository extends JpaRepository<MsMcStatusEntity, Integer> {

    MsMcStatusEntity findByStatus(String status);

}
