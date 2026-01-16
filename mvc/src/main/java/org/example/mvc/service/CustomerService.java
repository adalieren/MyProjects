package org.example.mvc.service;

import lombok.RequiredArgsConstructor;
import org.example.mvc.dto.CustomerDto;
import org.example.mvc.entity.Customer;
import org.example.mvc.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public String createCustomer(CustomerDto customerDto) {
        System.out.println("Customer create started");

        Customer entity = new Customer(null, customerDto.getName(), customerDto.getMail(),customerDto.getGender() );
        try {
            customerRepository.save(entity);
            System.out.println("Customer create finished");
            return "Customer created";
        }catch (Exception ex) {
            System.out.println("Error occurred! " + ex.getMessage());
            return "Hata oluştu: " + ex.getMessage(); // Hata mesajı
        }
    }
    public void getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

}
