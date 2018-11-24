package com.patmander.patpetclinic.services;

import com.patmander.patpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

  Owner findByLastName(String lastName);

}
