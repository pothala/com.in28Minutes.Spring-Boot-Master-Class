package com.in28minutes.springboot.firstspringbootproject.jpa;

import com.in28minutes.springboot.firstspringbootproject.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByRole(String role);
    List<User> findByName(String name);
    List<User> findByNameIgnoreCase(String name);

}
