package com.prestabancoms.ms_MCApplication.Controllers;

import com.prestabancoms.ms_MCApplication.Entities.MsMcApplicationEntity;
import com.prestabancoms.ms_MCApplication.Services.MsMcApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/mc-application")
@CrossOrigin("*")

public class MsMcApplicationController {

    @Autowired
    private MsMcApplicationService msMcApplicationService;

    @PostMapping
    public ResponseEntity<?> createMCApplication(@RequestBody MsMcApplicationEntity mcApplicationEntity) {
        MsMcApplicationEntity savedApplication = msMcApplicationService.saveMCApplication(mcApplicationEntity);
        return ResponseEntity.ok(savedApplication);
    }
}
