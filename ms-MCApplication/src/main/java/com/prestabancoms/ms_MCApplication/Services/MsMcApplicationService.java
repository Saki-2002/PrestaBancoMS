package com.prestabancoms.ms_MCApplication.Services;

import com.prestabancoms.ms_MCApplication.Entities.MsMcApplicationEntity;
import com.prestabancoms.ms_MCApplication.Repositories.MsMcApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MsMcApplicationService {

    @Autowired
    private MsMcApplicationRepository mcApplicationRepository;

    public MsMcApplicationEntity saveMCApplication(MsMcApplicationEntity mcApplicationEntity) {
        return mcApplicationRepository.save(mcApplicationEntity);
    }

    public MsMcApplicationEntity findById(Long id){
        return mcApplicationRepository.findById(id).orElse(null);
    }

    public List<MsMcApplicationEntity> findAllbyClient(Long Id){
        return mcApplicationRepository.findAllByClient(Id);
    }


}