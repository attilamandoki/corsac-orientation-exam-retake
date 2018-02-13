package com.greenfoxacademy.corsacorientationexamretake.services;

import com.greenfoxacademy.corsacorientationexamretake.models.Ticket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TicketService {

  List<Ticket> listOfAllTickets();
}
