package serviceImpl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.CustomerDTO;
import service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
 	@Override
	public CustomerDTO getCustomerById(UUID customerId) {
		return CustomerDTO.builder().id(UUID.randomUUID())
									.name("Harish Tiwari")
									.build();
	}

}
