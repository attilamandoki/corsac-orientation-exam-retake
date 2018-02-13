package com.greenfoxacademy.corsacorientationexamretake.models;

public class TicketDTO {

  private String name;
  private String manufacturer;
  private long serialnumber;
  private String description;

  public TicketDTO() {
  }

  public TicketDTO(String name, String manufacturer, long serialnumber, String description) {
    this.name = name;
    this.manufacturer = manufacturer;
    this.serialnumber = serialnumber;
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public long getSerialnumber() {
    return serialnumber;
  }

  public void setSerialnumber(long serialnumber) {
    this.serialnumber = serialnumber;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
