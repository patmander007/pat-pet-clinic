package com.patmander.patpetclinic.services.map;

import org.springframework.stereotype.Service;
import com.patmander.patpetclinic.model.Owner;
import com.patmander.patpetclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

  public Owner save(Owner object) {
    return super.save(object, object.getId());
  }

  public Owner update(Owner object) {
    return super.update(object, object.getId());
  }

  @Override
  public Owner findByLastName(String lastName) {
    return null;
  }

}
