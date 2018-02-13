package com.greenfoxacademy.corsacorientationexamretake.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

  @Id
  private String name;

  @OneToMany(mappedBy = "id", fetch = FetchType.EAGER)
  private List<Ticket> tickets;

  public User() {
  }

  public User(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
