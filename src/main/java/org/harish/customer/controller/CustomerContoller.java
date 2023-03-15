package org.harish.customer.controller;

import java.util.UUID;

import org.harish.customer.dto.CustomerDTO;
import org.harish.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerContoller {
	
	public CustomerContoller() {
		System.out.println("test print");
	}
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping({"/{customerId}"})
	public ResponseEntity<CustomerDTO> getCustomer(@PathVariable("customerId") UUID customerId){
		return new ResponseEntity<>(customerService.getCustomerById(customerId),HttpStatus.OK);
	}
	
	@GetMapping({"/Hello"})
	public String hello(){
		return "Hello";
	}
}
