package com.prestabancoms.ms_MCApplication.Repositories;

import com.prestabancoms.ms_MCApplication.Entities.MsMcApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MsMcApplicationRepository extends JpaRepository<MsMcApplicationEntity, Integer> {
}
