package com.prestabancoms.ms_MCSimulation.Controllers;

import com.prestabancoms.ms_MCSimulation.Services.MsMcSimulationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/mcsimulation")
@CrossOrigin("*")
public class MsMcSimulationController {

    @Autowired
    MsMcSimulationService mcSimulationService;

    @PostMapping("/")
    public ResponseEntity<Double> simulateMortgageCredit(@RequestBody Map<String, Object> requestData){
        int loanAmount = (Integer) requestData.get("loanAmount");
        double annualInterestRate = ((Number) requestData.get("annualInterestRate")).doubleValue();
        int loanTerm = (Integer) requestData.get("loanTerm");
        double result = mcSimulationService.simulateMortgageCredit(loanAmount,loanTerm,annualInterestRate);
        return ResponseEntity.ok(result);
    }

}
