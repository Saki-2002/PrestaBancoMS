package com.prestabancoms.ms_MCTracking.Controllers;



import com.prestabancoms.ms_MCTracking.Entities.MsMcStatusEntity;
import com.prestabancoms.ms_MCTracking.Services.MsMcStatusService;
import com.prestabancoms.ms_MCTracking.Services.MsMcTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.prestabancoms.ms_MCTracking.Models.MsMcApplication;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/mctracking")

public class MsMcTrackingController {

    @Autowired
    MsMcTrackingService msMcTrackingService;
    @Autowired
    MsMcStatusService msMcStatusService;

    @GetMapping("/status/getAll/")
    public ResponseEntity<List<MsMcStatusEntity>> getAll() {
        List<MsMcStatusEntity> mcStatusEntities = msMcStatusService.getAll();
        return ResponseEntity.ok(mcStatusEntities);
    }

    @GetMapping("/getAll/{clientId}")
    public ResponseEntity<List<MsMcApplication>> getAllbyClient(@PathVariable Long clientId) {

        List<MsMcApplication> applications = msMcTrackingService.getAllbyClient(clientId);
        return ResponseEntity.ok(applications);
    }

    @PutMapping("/updateStatus/{applicationId}")
    public ResponseEntity<?> updateApplicationStatus(@PathVariable Long applicationId, @RequestBody Long statusId){
        MsMcApplication mcApplication = msMcTrackingService.updateApplicationStatusbyId(applicationId, statusId);
        return ResponseEntity.ok(mcApplication);
    }


}
