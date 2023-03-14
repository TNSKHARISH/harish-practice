package controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.CustomerDTO;
import service.CustomerService;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerContoller {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping({"/{customerId}"})
	public ResponseEntity<CustomerDTO> getCustomer(@PathVariable("customerId") UUID customerId){
		return new ResponseEntity<>(customerService.getCustomerById(customerId),HttpStatus.OK);
	}
}
