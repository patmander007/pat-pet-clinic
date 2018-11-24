package com.patmander.patpetclinic.services;

import java.util.Set;
import com.patmander.patpetclinic.model.Pet;

public interface PetService {

  Pet findById(Long id);

  Pet save(Pet pet);

  Set<Pet> findAll();

  Pet update(Pet pet);

}
