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
@CrossOrigin("*")

public class MsMcApplicationController {

    @Autowired
    private MsMcApplicationService msMcApplicationService;
    @Autowired
    private MsMcTypesService msMcTypesService;

    @PostMapping("/create/")
    public ResponseEntity<?> createMCApplication(@RequestBody MsMcApplicationEntity mcApplicationEntity) {
        MsMcApplicationEntity savedApplication = msMcApplicationService.saveMCApplication(mcApplicationEntity);
        return ResponseEntity.ok(savedApplication);
    }

    @GetMapping("/types/getAll/")
    public ResponseEntity<List<MsMcTypesEntity>> getAll() {
        List<MsMcTypesEntity> mcTypesEntities = msMcTypesService.getAll();
        return ResponseEntity.ok(mcTypesEntities);
    }


}
