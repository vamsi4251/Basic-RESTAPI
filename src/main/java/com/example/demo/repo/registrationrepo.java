package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.signup;
@Repository
public interface registrationrepo extends JpaRepository<signup, Integer>{


	Optional<signup> findByname(String name);


}
