package com.example.api.controller;

import com.example.api.dto.CandidateCreateDTO;
import com.example.api.entity.Candidate;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/api/v1/candidates")
public class CandidateController {
    private final AtomicInteger idGenerator = new AtomicInteger(1);

    @PostMapping
    public ResponseEntity<Candidate> createCandidate(@Valid @RequestBody CandidateCreateDTO dto) {
        Candidate candidate = new Candidate();
        candidate.setId(idGenerator.getAndIncrement());
        candidate.setFullName(dto.getFullName());
        candidate.setEmail(dto.getEmail());
        candidate.setAge(dto.getAge());
        candidate.setYearsOfExperience(dto.getYearsOfExperience());

        return new ResponseEntity<>(candidate, HttpStatus.CREATED);
    }
}
