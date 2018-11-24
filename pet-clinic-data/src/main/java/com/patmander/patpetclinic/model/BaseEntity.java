package com.patmander.patpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable{

  private static final long serialVersionUID = 4829586309084189834L;
  
  public Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
  
}
