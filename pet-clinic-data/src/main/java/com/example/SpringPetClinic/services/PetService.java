package com.example.SpringPetClinic.services;

import com.example.SpringPetClinic.model.Owner;
import com.example.SpringPetClinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
