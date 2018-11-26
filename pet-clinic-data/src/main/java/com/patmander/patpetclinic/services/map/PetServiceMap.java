package com.patmander.patpetclinic.services.map;

import org.springframework.stereotype.Service;
import com.patmander.patpetclinic.model.Pet;
import com.patmander.patpetclinic.services.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet> implements PetService {

}
