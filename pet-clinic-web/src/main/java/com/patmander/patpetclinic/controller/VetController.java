package com.patmander.patpetclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.patmander.patpetclinic.services.VetService;

@Controller
@RequestMapping("/vets")
public class VetController {
  
  private VetService vetService;
  
  @Autowired
  public VetController(VetService vetService) {
    this.vetService = vetService;
  }

  @RequestMapping({"","/","/index*"})
  public String listVets(Model model) {
    
    model.addAttribute("title", "Pet Clinic Vets");
    model.addAttribute("vets", vetService.findAll());
    
    return "vets/index";
  }
  
  

}
