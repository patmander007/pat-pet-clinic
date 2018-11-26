package com.patmander.patpetclinic.data.boostrap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.patmander.patpetclinic.model.Owner;
import com.patmander.patpetclinic.model.Vet;
import com.patmander.patpetclinic.services.OwnerService;
import com.patmander.patpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner{
  
  private OwnerService ownerService;
  private VetService vetService;
  
  private static final Logger logger = LoggerFactory.getLogger(DataLoader.class);
  
  @Autowired
  public DataLoader(OwnerService ownerService, VetService vetService) {
    this.ownerService = ownerService;
    this.vetService = vetService;
  }

  @Override
  public void run(String... args) throws Exception {
    
    Owner owner1 = new Owner();
    owner1.setId(1L);
    owner1.setFirstName("Mary Cherry");
    owner1.setLastName("Sanchez");
    ownerService.save(owner1);
    
    Owner owner2 = new Owner();
    owner2.setId(2L);
    owner2.setFirstName("Patrick Norman");
    owner2.setLastName("Santos");
    ownerService.save(owner2);
    logger.info("Owner data bootstrapped!!");
    
    
    Vet vet1 = new Vet();
    vet1.setId(1L);
    vet1.setFirstName("Paula Patricia");
    vet1.setLastName("Santos");
    vetService.save(vet1);
    
    Vet vet2 = new Vet();
    vet2.setId(2L);
    vet2.setFirstName("John");
    vet2.setLastName("Doe");
    vetService.save(vet2);
    logger.info("Vet data bootstrapped!!");
    
  }

}
