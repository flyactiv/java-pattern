package com.example.lesson18.controller;

import com.example.lesson18.model.Phone;
import com.example.lesson18.service.PhoneService;
import com.example.lesson18.service.PhoneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class PhoneController {
    @Autowired
    private PhoneServiceImpl service;

    @PostMapping("/phone")
    public void post(@RequestBody Phone phone) {
        service.addPhone(phone);
    }

    @GetMapping("/phones")
    public List<Phone> getAll() {
        return service.getPhones();
    }

    @GetMapping("/phones/name/{name}")
    public List<Phone> getAllByName(@PathVariable String name) {
        return service.findPhonesByName(name);
    }

    @GetMapping("/phones/creationYear/{creationYear}")
    public List<Phone> getAllByCreationYear(@PathVariable int creationYear) {
        return service.findPhonesByCreationYear(creationYear);
    }

    @GetMapping("/phone/{id}")
    public Phone get(@PathVariable UUID id) {
        return service.getPhone(id);
    }


    @DeleteMapping("/phone/{id}")
    public void delete(@PathVariable UUID id) {
        service.deletePhone(id);
    }
}
