package org.harish.customer.serviceImpl;

import java.util.UUID;

import org.harish.customer.dto.CustomerDTO;
import org.harish.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
 	@Override
	public CustomerDTO getCustomerById(UUID customerId) {
		return CustomerDTO.builder().id(UUID.randomUUID())
									.name("Harish Tiwari")
									.build();
	}

}
