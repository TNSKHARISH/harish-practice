package service;

import java.util.UUID;

import dto.CustomerDTO;

public interface CustomerService {

	public CustomerDTO getCustomerById(UUID customerId);
}
