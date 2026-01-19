package com.bank.app.Controller;

import com.bank.app.model.Customer;
import com.bank.app.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

   private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer)
    {
        return ResponseEntity.ok(customerService.createCustomer(customer));
    }

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers()
    {
        return ResponseEntity.ok(customerService.getAllCustomers());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") Long id)
    {
        return customerService.getCustomerById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build() );
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id,
                                                   @RequestBody Customer customer)
    {
        try{
            return ResponseEntity.ok(customerService.updateCustomer(id,customer));
        } catch(RuntimeException e)
        {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("id") Long id)
    {
        try{
            customerService.deleteCustomer(id);
            return ResponseEntity.ok(("Customer deleted successfully !"));
        } catch(RuntimeException e)
        {
            return ResponseEntity.notFound().build();
        }
    }

}
