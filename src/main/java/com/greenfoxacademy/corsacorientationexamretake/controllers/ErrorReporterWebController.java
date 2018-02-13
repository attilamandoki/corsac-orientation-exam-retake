package com.greenfoxacademy.corsacorientationexamretake.controllers;

import com.greenfoxacademy.corsacorientationexamretake.models.Ticket;
import com.greenfoxacademy.corsacorientationexamretake.models.TicketDTO;
import com.greenfoxacademy.corsacorientationexamretake.models.User;
import com.greenfoxacademy.corsacorientationexamretake.services.TicketService;
import com.greenfoxacademy.corsacorientationexamretake.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ErrorReporterWebController {

  @Autowired
  UserService userService;

  @Autowired
  TicketService ticketService;

  @GetMapping(value = "/")
  public String newTicketForm(@ModelAttribute TicketDTO ticketDTO) {
    List<User> users = new ArrayList<>(userService.listOfAllUsers());
    return "index";
  }

  @PostMapping(value = "/")
  public String submitNewTicket(@ModelAttribute TicketDTO ticketDTO) {
    User user = new User();
    Ticket ticket = new Ticket();
   // ticket.setReporter(userService.findOneByName(user.getName()));
    return "redirect:/";
  }

  @GetMapping(value = "/list")
  public String listOfSubmittedTickets(Model model) {
    List<Ticket> tickets = new ArrayList<>(ticketService.listOfAllTickets());
    model.addAttribute("tickets", tickets);
    return "/list";
  }
  
}