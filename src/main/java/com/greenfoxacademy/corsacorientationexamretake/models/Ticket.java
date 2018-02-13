package com.greenfoxacademy.corsacorientationexamretake.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Ticket {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String reporter;
  private String manufacturer;
  private long serialnumber;
  private String description;
  @Column(name = "reported_at")
  private Date reportedAt;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "name")
  private User user;

  public Ticket() {
  }

  public Ticket(String reporter, String manufacturer, long serialnumber, String description, Date reportedAt) {
    this.reporter = reporter;
    this.manufacturer = manufacturer;
    this.serialnumber = serialnumber;
    this.description = description;
    this.reportedAt = reportedAt;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getReporter() {
    return reporter;
  }

  public void setReporter(String reporter) {
    this.reporter = reporter;
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

  public Date getReportedAt() {
    return reportedAt;
  }

  public void setReportedAt(Date reportedAt) {
    this.reportedAt = reportedAt;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
