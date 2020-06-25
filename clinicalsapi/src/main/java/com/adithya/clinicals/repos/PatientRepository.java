package com.adithya.clinicals.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adithya.clinicals.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
