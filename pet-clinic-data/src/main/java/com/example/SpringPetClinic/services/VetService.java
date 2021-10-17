package com.example.SpringPetClinic.services;

import com.example.SpringPetClinic.model.Owner;
import com.example.SpringPetClinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
