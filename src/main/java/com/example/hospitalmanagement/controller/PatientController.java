package com.example.hospitalmanagement.controller;

import com.example.hospitalmanagement.model.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    private List<Patient> patients = new ArrayList<>();
    private Long idCounter = 1L;

    // Получить список всех пациентов
    @GetMapping
    public List<Patient> getPatients() {
        return patients;
    }

    // Добавить нового пациента
    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        patient.setId(idCounter++);
        patients.add(patient);
        return patient;
    }
}
