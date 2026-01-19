package com.bank.app.service;
import com.bank.app.model.Customer;
import com.bank.app.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    // ✅ Correct constructor injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Creating the Customer
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    //Getting all customers.
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
    //Getting all customer Id.
    public Optional<Customer> getCustomerById(Long id)
    {
        return customerRepository.findById(id);
    }

    //Update Customer.
    public Customer updateCustomer(Long id, Customer updateCustomer)
    {
        return customerRepository.findById(id)
                .map(existing ->{
            existing.setFirstName(updateCustomer.getFirstName());
            existing.setLastName(updateCustomer.getLastName());
            existing.setEmail(updateCustomer.getEmail());
            existing.setPhoneNumber(updateCustomer.getPhoneNumber());
            return customerRepository.save(existing);
        })
                .orElseThrow(()->new RuntimeException("Customer not found"+id));
    }

    //Delete Customer.
    public void deleteCustomer(Long id){
        if(!customerRepository.existsById(id)){
            throw new RuntimeException("Customer not found "+id);
        }
        customerRepository.deleteById(id);
    }
}


