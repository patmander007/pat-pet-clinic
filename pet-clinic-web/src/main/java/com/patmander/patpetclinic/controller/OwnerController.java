package com.patmander.patpetclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.patmander.patpetclinic.services.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnerController {
  
  private OwnerService ownerService;
  
  @Autowired
  public OwnerController(OwnerService ownerService) {
    this.ownerService = ownerService;
  }
  
  @RequestMapping({"","/","/index*"})
  public String listOwners(Model model) {
    model.addAttribute("title", "Pet Clinic - Owners");
    model.addAttribute("owners", ownerService.findAll());
    
    return "owners/index";
  }
  
  

}
