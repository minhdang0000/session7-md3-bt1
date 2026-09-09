package com.example.api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Candidate {
    private Integer id;
    private String fullName;
    private String email;
    private Integer age;
    private Integer yearsOfExperience;
}
