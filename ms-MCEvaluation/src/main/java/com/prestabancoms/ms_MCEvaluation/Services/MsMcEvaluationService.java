package com.prestabancoms.ms_MCEvaluation.Services;

import com.prestabancoms.ms_MCEvaluation.Models.MsMcTypesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.prestabancoms.ms_MCEvaluation.Models.MsMcApplication;
import org.springframework.http.HttpEntity;

@Service
public class MsMcEvaluationService {

    @Autowired
    RestTemplate restTemplate;

    public MsMcApplication updateApplicationStatusbyId(Long applicationId, Long statusId) {

        MsMcApplication applicationUpdate = new MsMcApplication();
        applicationUpdate.setStatus(statusId);

        HttpEntity<MsMcApplication> request = new HttpEntity<>(applicationUpdate);

        ResponseEntity<MsMcApplication> response = restTemplate.exchange(
                "http://ms-MCApplication/mcapplication/" + applicationId + "/",
                HttpMethod.PUT,
                request,
                MsMcApplication.class
        );

        return response.getBody();
    }

}
