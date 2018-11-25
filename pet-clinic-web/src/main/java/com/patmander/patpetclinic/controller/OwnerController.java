package com.patmander.patpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {
  
  @RequestMapping({"","/","/index*"})
  public String listVets(Model model) {
    model.addAttribute("title", "Pet Clinic - Owners");
    return "owners/index";
  }
  
  

}
