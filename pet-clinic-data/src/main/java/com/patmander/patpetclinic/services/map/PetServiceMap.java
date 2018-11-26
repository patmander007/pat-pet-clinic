package com.patmander.patpetclinic.services.map;

import org.springframework.stereotype.Service;
import com.patmander.patpetclinic.model.Pet;
import com.patmander.patpetclinic.services.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

  @Override
  public Pet save(Pet object) {
    return super.save(object, object.getId());
  }

  @Override
  public Pet update(Pet object) {
    return super.update(object, object.getId());
  }

}
