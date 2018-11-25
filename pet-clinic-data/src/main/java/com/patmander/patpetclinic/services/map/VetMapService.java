package com.patmander.patpetclinic.services.map;

import com.patmander.patpetclinic.model.Vet;

public class VetMapService extends AbstractMapService<Vet, Long> {

  @Override
  public Vet save(Vet object) {
    return super.save(object, object.getId());
  }

  @Override
  public Vet update(Vet object) {
    return super.update(object, object.getId());
  }

}
