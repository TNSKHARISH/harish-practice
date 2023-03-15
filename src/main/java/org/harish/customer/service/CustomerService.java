package org.harish.customer.service;

import java.util.UUID;

import org.harish.customer.dto.CustomerDTO;

public interface CustomerService {

	public CustomerDTO getCustomerById(UUID customerId);
}
