package com.prestabancoms.ms_MCApplication.Repositories;

import com.prestabancoms.ms_MCApplication.Entities.MsMcApplicationEntity;
import com.prestabancoms.ms_MCApplication.Entities.MsMcTypesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MsMcApplicationRepository extends JpaRepository<MsMcApplicationEntity, Long> {

    MsMcApplicationEntity findById(int id);
    List<MsMcApplicationEntity> findAllByClient(Long client);
}
