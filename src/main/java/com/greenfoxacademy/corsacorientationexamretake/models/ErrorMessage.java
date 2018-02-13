package com.greenfoxacademy.corsacorientationexamretake.models;

import java.util.ArrayList;
import java.util.List;

public class ErrorMessage implements ResponseMessage {

  private String status;
  private List<String> errors;

  public ErrorMessage() {
    errors = new ArrayList<>();
  }

  public ErrorMessage(String status, List<String> errors) {
    this.status = status;
    this.errors = errors;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }
}
