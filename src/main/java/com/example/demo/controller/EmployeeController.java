package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.EmployeesData;
import com.example.demo.Repository.EmployeesDataRepository;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeesDataRepository emprepo;
	@PostMapping("/save")
	public ResponseEntity<String> addUser(@ModelAttribute EmployeesData emp) {
	    emprepo.save(emp);
	    return ResponseEntity.ok("Data saved successfully");
	}

}
