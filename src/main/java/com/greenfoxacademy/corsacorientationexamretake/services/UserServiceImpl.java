package com.greenfoxacademy.corsacorientationexamretake.services;

import com.greenfoxacademy.corsacorientationexamretake.models.User;
import com.greenfoxacademy.corsacorientationexamretake.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserRepository userRepository;

  @Override
  public List<User> listOfAllUsers() {
    return (List<User>) userRepository.findAll();
  }
}
