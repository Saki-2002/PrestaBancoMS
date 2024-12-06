package com.prestabancoms.ms_userRegister.Services;

import com.prestabancoms.ms_userRegister.Entities.UserRoleEntity;
import com.prestabancoms.ms_userRegister.Repositories.UserRoleRepository;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class UserRoleService {

    @Autowired
    UserRoleRepository userRoleRepository;

    public List<UserRoleEntity> getAll() {
        return new ArrayList<>(userRoleRepository.findAll());
    }


    @PostConstruct
    public void init() {
        createRoleIfNotFound("Cliente");
        createRoleIfNotFound("Ejecutivo");
    }

    private void createRoleIfNotFound(String role) {
        if(userRoleRepository.findByRole(role)==null){
            userRoleRepository.save(new UserRoleEntity(null, role));
        }
    }

}
