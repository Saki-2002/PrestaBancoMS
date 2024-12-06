package com.prestabancoms.ms_userRegister.Services;

import com.prestabancoms.ms_userRegister.Entities.UserEntity;
import com.prestabancoms.ms_userRegister.Entities.UserRoleEntity;
import com.prestabancoms.ms_userRegister.Repositories.UserRepository;
import com.prestabancoms.ms_userRegister.Repositories.UserRoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;
    @Autowired
    UserRoleRepository userRoleRepository;


    public UserEntity register(String name, String password, String role){
        if(userRepository.findByName(name)==null){
            UserRoleEntity userRoleEntity = userRoleRepository.findByRole(role);
            long roleID = userRoleEntity.getId();
            UserEntity user = new UserEntity(null, name, password,roleID);
            return userRepository.save(user);
        } else {
            return null;
        }
    }

    public UserEntity login(String name, String password){

        UserEntity user = userRepository.findByName(name);

        if(user!=null && user.getPassword().equals(password)){
            return user;
        } else {
            return null;
        }
    }

}
