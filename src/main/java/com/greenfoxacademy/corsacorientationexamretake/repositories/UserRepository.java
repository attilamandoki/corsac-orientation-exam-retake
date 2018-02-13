package com.greenfoxacademy.corsacorientationexamretake.repositories;

import com.greenfoxacademy.corsacorientationexamretake.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  User findByName(String name);
}
