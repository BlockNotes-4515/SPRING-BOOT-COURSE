package com.bank.app;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @GetMapping
    public String getContacts() {
        return "Returning all contacts";
    }

    @PostMapping
    public String addContact() {
        return "New contact added!";
    }

    @DeleteMapping("/{id}")
    public String deleteContact(@PathVariable int id) {
        return "Contact " + id + " deleted!";
    }

    @GetMapping("/public/info")
    public String publicInfo() {
        return "This is a public endpoint";
    }
}
