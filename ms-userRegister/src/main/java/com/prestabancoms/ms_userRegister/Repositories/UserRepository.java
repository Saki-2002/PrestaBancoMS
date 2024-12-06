package com.prestabancoms.ms_userRegister.Repositories;

import com.prestabancoms.ms_userRegister.Entities.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    UserEntity findByName(String name);

}
