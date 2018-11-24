package com.patmander.patpetclinic.services;

import java.util.Set;
import com.patmander.patpetclinic.model.Owner;

public interface OwnerService {
  
  Owner findByLastName(String lastName);

  Owner findById(Long id);

  Owner save(Owner owner);

  Set<Owner> findAll();

  Owner update(Owner owner);

}
