package com.prestabancoms.ms_MCApplication.Controllers;

import com.prestabancoms.ms_MCApplication.Entities.MsMcApplicationEntity;
import com.prestabancoms.ms_MCApplication.Entities.MsMcTypesEntity;
import com.prestabancoms.ms_MCApplication.Services.MsMcApplicationService;
import com.prestabancoms.ms_MCApplication.Services.MsMcTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mcapplication")

public class MsMcApplicationANDMsMcTypesController {

    @Autowired
    private MsMcApplicationService msMcApplicationService;
    @Autowired
    private MsMcTypesService msMcTypesService;

    @PostMapping("/create/")
    public ResponseEntity<?> createMCApplication(@RequestBody MsMcApplicationEntity mcApplicationEntity) {
        MsMcApplicationEntity savedApplication = msMcApplicationService.saveMCApplication(mcApplicationEntity);
        return ResponseEntity.ok(savedApplication);
    }

    @GetMapping("/getAll/")
    public ResponseEntity<List<MsMcApplicationEntity>> getAll() {
        List<MsMcApplicationEntity> mcapplications = msMcApplicationService.getAll();
        return ResponseEntity.ok(mcapplications);
    }

    @GetMapping("/types/getAll/")
    public ResponseEntity<List<MsMcTypesEntity>> getAllTypes() {
        List<MsMcTypesEntity> mcTypesEntities = msMcTypesService.getAll();
        return ResponseEntity.ok(mcTypesEntities);
    }

    @GetMapping("/getAllbyClient/{clientId}")
    public ResponseEntity<List<MsMcApplicationEntity>> getAllByClient(@PathVariable Long clientId) {
        List<MsMcApplicationEntity> mcapplications = msMcApplicationService.findAllbyClient(clientId);
        return ResponseEntity.ok(mcapplications);
    }

    @PutMapping("/status/update/{applicationId}")
    public ResponseEntity<?> updateApplicationStatus(@PathVariable Long applicationId, @RequestBody MsMcApplicationEntity updatedApplication) {
        MsMcApplicationEntity existingApplication = msMcApplicationService.findById(applicationId);
        if(existingApplication == null) {
            return ResponseEntity.notFound().build();
        }

        existingApplication.setStatus(updatedApplication.getStatus());
        MsMcApplicationEntity savedApplication = msMcApplicationService.saveMCApplication(existingApplication);
        return ResponseEntity.ok(savedApplication);
    }

}
