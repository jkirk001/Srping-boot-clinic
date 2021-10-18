package com.example.SpringPetClinic.services;

import com.example.SpringPetClinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}