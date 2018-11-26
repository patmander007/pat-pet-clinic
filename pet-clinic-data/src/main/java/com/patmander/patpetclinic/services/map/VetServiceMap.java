package com.patmander.patpetclinic.services.map;

import org.springframework.stereotype.Service;
import com.patmander.patpetclinic.model.Vet;
import com.patmander.patpetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

  @Override
  public Vet save(Vet object) {
    return super.save(object, object.getId());
  }

  @Override
  public Vet update(Vet object) {
    return super.update(object, object.getId());
  }

}
