package com.prestabancoms.ms_userRegister.Repositories;

import com.prestabancoms.ms_userRegister.Entities.UserRoleEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRoleRepository extends JpaRepository<UserRoleEntity, Integer> {

    UserRoleEntity findByRole(String role);

}
