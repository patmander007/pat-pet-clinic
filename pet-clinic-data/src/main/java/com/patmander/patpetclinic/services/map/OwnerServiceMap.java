package com.patmander.patpetclinic.services.map;

import org.springframework.stereotype.Service;
import com.patmander.patpetclinic.model.Owner;
import com.patmander.patpetclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner> implements OwnerService {

  @Override
  public Owner findByLastName(String lastName) {
    return null;
  }

}
