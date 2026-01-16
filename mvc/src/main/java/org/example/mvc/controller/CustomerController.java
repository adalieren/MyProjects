package org.example.mvc.controller;


import org.example.mvc.dto.CustomerDto;
import org.example.mvc.entity.Customer;
import org.example.mvc.service.CustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

   /* @GetMapping(value = "/test")
    @ResponseBody
    public String getCustomersTest(@RequestParam String name) {
    return customerService.test(name);
    } */

    @PostMapping(value = "/create")
    @ResponseBody
    public String createCustomer(@RequestBody CustomerDto customerDto) {
        return customerService.createCustomer(customerDto);
    }

    @GetMapping(value="/getall")
    @ResponseBody
    public void getAllCustomers() {
        customerService.getAllCustomers();
    }















}
