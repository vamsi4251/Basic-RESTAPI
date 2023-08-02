package com.example.demo.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.signup;
import com.example.demo.services.signuipservice;

@RestController
@RequestMapping("/api/v1")

public class signupcontroler {
	@Autowired
	signuipservice sign;
	
	@PostMapping("/insert")
	public signup insert(@RequestBody signup s) {
		
		return sign.addusers(s);
	}
	
	@GetMapping("/getall")
	public List<signup>getall(){
		return sign.getall();
	}
	
	@GetMapping("/getbyid/{id}")
	public Optional<signup>getbyid(@PathVariable int id){
		return sign.getbyid(id);
	}
	
	@GetMapping("/getbyname/{name}")
	public Optional<signup>findbyid(@PathVariable String name){
		return sign.getbyname(name);
	}
	
	@DeleteMapping("/delectbyid/{id}")
	public String delectbyid(@PathVariable int id) {
		return sign.deletebyid(id);
	}
	
	@PutMapping("/update")
	public signup update(@RequestBody signup s) {
		return sign.update(s);
	}

}
