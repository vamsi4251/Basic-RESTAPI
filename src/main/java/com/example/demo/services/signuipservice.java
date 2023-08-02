package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.signup;
import com.example.demo.repo.registrationrepo;


@Service
public class signuipservice {

	@Autowired
	registrationrepo repo;
	
	public signup addusers(signup s) {
		
		return repo.save(s);
	}
	
	public List<signup>getall(){
		return repo.findAll();
	}
	
	public Optional<signup>getbyid(int id){
		return repo.findById(id);
	}
	
	public Optional<signup> getbyname(String name) {
		return repo.findByname(name);
	}
	
	public String deletebyid(int id) {
		repo.deleteById(id);
		return "deleted successfully"+id;
	}
	
	public signup update(signup s) {
		int id=s.getId();
		signup sig=repo.findById(id).get();
		sig.setName(s.getName());
		sig.setEmail (s.getEmail());
		sig.setPassword(s.getPassword());
		return repo.save(sig);
	}
}
