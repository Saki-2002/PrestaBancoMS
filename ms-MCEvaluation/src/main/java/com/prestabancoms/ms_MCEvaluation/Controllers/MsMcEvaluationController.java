package com.prestabancoms.ms_MCEvaluation.Controllers;


import com.prestabancoms.ms_MCEvaluation.Models.McStatus;
import com.prestabancoms.ms_MCEvaluation.Services.MsMcEvaluationService;
import com.prestabancoms.ms_MCEvaluation.Models.MsMcApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mcevaluation")
public class MsMcEvaluationController {

    @Autowired
    MsMcEvaluationService msMcEvaluationService;

    @PutMapping("/updateStatus/{applicationId}")
    public ResponseEntity<?> updateApplicationStatus(@PathVariable Long applicationId, @RequestBody Long statusId){
        MsMcApplication mcApplication = msMcEvaluationService.updateApplicationStatusbyId(applicationId, statusId);
        return ResponseEntity.ok(mcApplication);
    }

    @GetMapping("/applications/getAll/")
    public ResponseEntity<List<MsMcApplication>> getAllApplications(){
        List<MsMcApplication> mcapplications = msMcEvaluationService.getAllApplications();
        return ResponseEntity.ok(mcapplications);
    }

    @GetMapping("/status/getAll/")
    public ResponseEntity<List<McStatus>> getAllStatus(){
        List<McStatus> statuses = msMcEvaluationService.getAllStatuses();
        return ResponseEntity.ok(statuses);
    }

}
