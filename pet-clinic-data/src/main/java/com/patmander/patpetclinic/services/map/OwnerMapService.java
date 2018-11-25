package com.patmander.patpetclinic.services.map;

import com.patmander.patpetclinic.model.Owner;

public class OwnerMapService extends AbstractMapService<Owner, Long> {

  @Override
  public Owner save(Owner object) {
    return super.save(object, object.getId());
  }

  @Override
  public Owner update(Owner object) {
    return super.update(object, object.getId());
  }

}
