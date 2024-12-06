package com.prestabancoms.ms_MCApplication.Controllers;

import com.prestabancoms.ms_MCApplication.Entities.MsMcTypesEntity;
import com.prestabancoms.ms_MCApplication.Services.MsMcTypesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mc-types")
@CrossOrigin("*")

public class MsMcTypesController {

    @Autowired
    MsMcTypesService mcTypesService;

    @GetMapping("/getAll")
    public ResponseEntity<List<MsMcTypesEntity>> getAll() {
        List<MsMcTypesEntity> mcTypesEntities = mcTypesService.getAll();
        return ResponseEntity.ok(mcTypesEntities);
    }

}
