package com.prestabancoms.ms_MCTracking.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.prestabancoms.ms_MCTracking.Models.MsMcApplication;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class MsMcTrackingService {

    @Autowired
    RestTemplate restTemplate;

    public List<MsMcApplication> getAllbyClient(Long clientId) {
        List<MsMcApplication> mcapplications = restTemplate.getForObject("http://ms-MCApplication/mcapplication/getAllbyClient/" + clientId, List.class);
        return mcapplications;
    }

    public MsMcApplication updateApplicationStatusbyId(Long applicationId, Long statusId) {

        MsMcApplication applicationUpdate = new MsMcApplication();
        applicationUpdate.setStatus(statusId);

        HttpEntity<MsMcApplication> request = new HttpEntity<>(applicationUpdate);

        ResponseEntity<MsMcApplication> response = restTemplate.exchange(
                "http://ms-MCApplication/mcapplication/status/update/" + applicationId,
                HttpMethod.PUT,
                request,
                MsMcApplication.class
        );

        return response.getBody();
    }

}
