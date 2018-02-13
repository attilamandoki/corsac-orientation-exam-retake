package com.greenfoxacademy.corsacorientationexamretake.services;

import com.greenfoxacademy.corsacorientationexamretake.models.Ticket;
import com.greenfoxacademy.corsacorientationexamretake.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

  @Autowired
  TicketRepository ticketRepository;

  @Override
  public List<Ticket> listOfAllTickets() {
    return (List<Ticket>) ticketRepository.findAll();

  }
}
