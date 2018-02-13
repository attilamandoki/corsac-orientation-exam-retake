package com.greenfoxacademy.corsacorientationexamretake.services;

import com.greenfoxacademy.corsacorientationexamretake.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

  List<User> listOfAllUsers();

}
