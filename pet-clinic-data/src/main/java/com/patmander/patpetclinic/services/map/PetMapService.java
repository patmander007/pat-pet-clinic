package com.patmander.patpetclinic.services.map;

import com.patmander.patpetclinic.model.Pet;

public class PetMapService extends AbstractMapService<Pet, Long> {

  @Override
  public Pet save(Pet object) {
    return super.save(object, object.getId());
  }

  @Override
  public Pet update(Pet object) {
    return super.update(object, object.getId());
  }

}
