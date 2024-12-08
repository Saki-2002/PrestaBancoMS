package com.prestabancoms.ms_MCEvaluation.Controllers;


import com.prestabancoms.ms_MCEvaluation.Services.MsMcEvaluationService;
import com.prestabancoms.ms_MCEvaluation.Models.MsMcApplication;
import com.prestabancoms.ms_MCEvaluation.Models.MsMcTypesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mcevaluation")
public class MsMcEvaluationController {

    @Autowired
    MsMcEvaluationService msMcEvaluationService;

    @PutMapping("/{applicationId}")
    public ResponseEntity<?> updateApplicationStatus(@PathVariable Long applicationId, @RequestBody Long statusId){
        MsMcApplication mcApplication = msMcEvaluationService.updateApplicationStatusbyId(applicationId, statusId);
        return ResponseEntity.ok(mcApplication);
    }
}
